package io.github.seggan.slimefunwarfare;

import com.google.common.collect.Sets;
import io.github.mooy1.infinitylib.core.ConfigUtils;
import io.github.mooy1.infinitylib.core.PluginUtils;
import io.github.seggan.slimefunwarfare.items.guns.Gun;
import io.github.seggan.slimefunwarfare.items.powersuits.ArmorPiece;
import io.github.seggan.slimefunwarfare.items.powersuits.Module;
import io.github.seggan.slimefunwarfare.items.powersuits.PowerSuit;
import io.github.seggan.slimefunwarfare.listeners.BetterExplosiveListener;
import io.github.seggan.slimefunwarfare.listeners.BulletListener;
import io.github.seggan.slimefunwarfare.listeners.ConcreteListener;
import io.github.seggan.slimefunwarfare.listeners.GrenadeListener;
import io.github.seggan.slimefunwarfare.listeners.HitListener;
import io.github.seggan.slimefunwarfare.listeners.ModuleListener;
import io.github.seggan.slimefunwarfare.listeners.PyroListener;
import io.github.seggan.slimefunwarfare.listeners.SpaceListener;
import io.github.seggan.slimefunwarfare.lists.Categories;
import io.github.seggan.slimefunwarfare.spacegenerators.SpaceGenerator;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import io.github.thebusybiscuit.slimefun4.utils.ChargeUtils;
import lombok.Getter;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;

import javax.annotation.Nonnull;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class SlimefunWarfare extends JavaPlugin implements SlimefunAddon, Listener {

    @Getter
    private static SlimefunWarfare instance = null;

    private static final Set<UUID> flying = new HashSet<>();

    @Override
    public void onEnable() {
        instance = this;

        PluginUtils.setup("SlimefunWarfare", this, "Seggan/SlimefunWarfare/master", getFile());
        PluginUtils.setupMetrics(9227);

        PluginUtils.registerListener(new BulletListener());
        PluginUtils.registerListener(new PyroListener());
        PluginUtils.registerListener(new GrenadeListener());
        PluginUtils.registerListener(new ConcreteListener());
        PluginUtils.registerListener(new BetterExplosiveListener());
        PluginUtils.registerListener(new SpaceListener());
        PluginUtils.registerListener(new HitListener());
        PluginUtils.registerListener(new ModuleListener());
        PluginUtils.registerListener(this);

        Categories.setup(this);

        Setup.setupItems(this);
        Setup.setupMelee(this);
        Setup.setupBullets(this);
        Setup.setupGuns(this);
        Setup.setupExplosives(this);
        Setup.setupSpace(this);
        Setup.setupSuits(this);

        Module.setup(this);

        for (World world : Bukkit.getWorlds()) {
            String name = world.getName();
            if (name.endsWith("_nether") || name.endsWith("_the_end")) continue;

            World space = Bukkit.getWorld(name + "_space");
            if (space != null) continue;

            if (!SlimefunPlugin.getWorldSettingsService().isWorldEnabled(world)) continue;

            WorldCreator creator = new WorldCreator(name + "_space")
                .seed(world.getSeed())
                .generator(new SpaceGenerator());
            space = creator.createWorld();

            space.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
            space.setGameRule(GameRule.DO_WEATHER_CYCLE, false);
            space.setTime(18000L);
        }

        if (ConfigUtils.getBoolean("guns.autoshoot", true)) {
            // Gun autoshoot task
            PluginUtils.scheduleRepeatingSync(() -> {
                for (Player p : getServer().getOnlinePlayers()) {
                    if (p.isSneaking() && !p.isFlying()) {
                        ItemStack stack = p.getInventory().getItemInMainHand();
                        SlimefunItem item = SlimefunItem.getByItem(stack);
                        if (!(item instanceof Gun)) {
                            continue;
                        }
                        Gun gun = (Gun) item;
                        ItemMeta meta = stack.getItemMeta();
                        PersistentDataContainer container = meta.getPersistentDataContainer();
                        long lastUse = container.getOrDefault(Gun.LAST_USE, PersistentDataType.LONG, 0L);
                        long currentTime = System.currentTimeMillis();
                        if ((currentTime - lastUse) < gun.getCooldown()) {
                            return;
                        }
                        container.set(Gun.LAST_USE, PersistentDataType.LONG, currentTime);
                        stack.setItemMeta(meta);
                        gun.shoot(p, stack);
                    }
                }
            }, 1);
        }

        PluginUtils.scheduleRepeatingSync(() -> {
            for (Player p : getServer().getOnlinePlayers()) {
                UUID uuid = p.getUniqueId();
                for (ItemStack stack : p.getInventory().getArmorContents()) {
                    SlimefunItem sfi = SlimefunItem.getByItem(stack);
                    if (sfi instanceof PowerSuit) {
                        PowerSuit suit = (PowerSuit) sfi;
                        for (Module module : PowerSuit.getModules(stack)) {
                            ItemMeta im = stack.getItemMeta();

                            PotionEffect effect = module.getEffect();
                            if (effect != null && ChargeUtils.getCharge(im) >= module.getPower()) {
                                p.addPotionEffect(effect);
                                suit.removeItemCharge(stack, module.getPower());
                            }

                            if (module == Module.MINI_JETS) {
                                if (!p.getAllowFlight()) {
                                    p.setAllowFlight(true);
                                    flying.add(uuid);
                                }
                                if (p.isFlying()) {
                                    if (ChargeUtils.getCharge(im) < module.getPower()) {
                                        p.setAllowFlight(false);
                                        flying.remove(uuid);
                                    } else {
                                        suit.removeItemCharge(stack, module.getPower());
                                    }
                                }
                            } else {
                                if (flying.contains(p.getUniqueId()) && suit.getType() == ArmorPiece.LEGS) {
                                    p.setAllowFlight(false);
                                    flying.remove(uuid);
                                }
                            }

                            suit.addItemCharge(stack, 10);
                        }
                    }
                }
            }
        }, 20);

        PluginUtils.scheduleRepeatingSync(() -> {
            for (UUID uuid : flying) {
                Player p = getServer().getPlayer(uuid);
                if (p == null) {
                    flying.remove(uuid);
                    return;
                }
                if (p.isFlying()) {

                }
            }
        }, 4);
    }

    @EventHandler
    public void onPlayerJoin(@Nonnull PlayerJoinEvent e) {
        Player p = e.getPlayer();
        ItemStack boots = p.getInventory().getBoots();
        if (p.getAllowFlight() && SlimefunItem.getByItem(boots) instanceof PowerSuit &&
            Sets.newHashSet(PowerSuit.getModules(boots)).contains(Module.MINI_JETS)) {
            flying.add(p.getUniqueId());
        }
    }

    @EventHandler
    public void onPlayerLeave(@Nonnull PlayerQuitEvent e) {
        flying.remove(e.getPlayer().getUniqueId());
    }

    @Override
    public void onDisable() {
        getLogger().info("Slimefun Warfare disabled.");
    }

    @Nonnull
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public String getBugTrackerURL() {
        return null;
    }
}

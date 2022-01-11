package io.github.seggan.slimefunwarfare.lists;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import org.bukkit.Material;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class Categories {

    public static final ItemGroup GENERAL = new SubGroup(
        "slimefunwarfare_general",
        new CustomItemStack(Material.DIAMOND_SWORD, "粘液战争 - 主菜单")
    );

    public static final ItemGroup MACHINES = new SubGroup(
        "slimefunwarfare_machines",
        new CustomItemStack(Material.STONECUTTER, "粘液战争 - 机器")
    );

    public static final ItemGroup GUNS = new SubGroup(
        "slimefunwarfare_guns",
        new CustomItemStack(Material.CROSSBOW, "粘液战争 - 枪支")
    );

    public static final ItemGroup MELEE = new SubGroup(
        "slimefunwarfare_melee",
        new CustomItemStack(Material.IRON_AXE, "粘液战争 - 近战")
    );

    public static final ItemGroup EXPLOSIVES = new SubGroup(
        "slimefunwarfare_explosives",
        new CustomItemStack(Material.TNT, "粘液战争 - 爆炸")
    );

    public static final ItemGroup RESOURCES = new SubGroup(
        "slimefunwarfare_resources",
        new CustomItemStack(Material.IRON_ORE, "粘液战争 - 资源")
    );

    public static final ItemGroup POWER_SUITS = new SubGroup(
        "slimefunwarfare_power_suits",
        new CustomItemStack(PlayerHead.getItemStack(Heads.SUIT_HELMET), "粘液战争 - 装甲")
    );

    private static final ItemGroup MAIN = new MultiGroup(
        "slimefunwarfare",
        new CustomItemStack(Material.DIAMOND_SWORD, "粘液战争"),
        GENERAL, MACHINES, GUNS, MELEE, EXPLOSIVES, RESOURCES, POWER_SUITS
    );

    public static void setup(SlimefunWarfare addon) {
        MAIN.register(addon);
    }
}

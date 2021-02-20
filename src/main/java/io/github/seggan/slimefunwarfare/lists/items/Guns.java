package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Guns {

    private Guns() {}

    public static final SlimefunItemStack PISTOL = new SlimefunItemStack(
        "GUN_PISTOL",
        Material.CROSSBOW,
        "&7Pistol",
        "",
        "&7A short range gun",
        "&7that reloads quickly.",
        "&7Useful for close combat.",
        "&cRange: 7",
        "&cDamage: 2 hearts",
        "&cCooldown: 0.75 seconds"
    );

    public static final SlimefunItemStack REVOLVER = new SlimefunItemStack(
        "GUN_REVOLVER",
        Material.CROSSBOW,
        "&7Revolver",
        "",
        "&7A short range gun",
        "&7that reloads quickly.",
        "&7Useful for close combat.",
        "&cRange: 10",
        "&cDamage: 3 hearts",
        "&cCooldown: 0.5 seconds"
    );

    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7Machine Gun",
        "",
        "&7Pew pew pew",
        "&cRange: 30",
        "&cMinimum Range: 5",
        "&cDamage: 3 hearts",
        "&cCooldown: 0.15 seconds"
    );

    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7Minigun",
        "",
        "&7The ultimate device",
        "&7to pepper your friends with.",
        "&cRange: 40",
        "&cMinimum Range: 5",
        "&cDamage: 4 hearts",
        "&cCooldown: none"
    );

    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7Rifle",
        "",
        "&7A standard rifle.",
        "&cRange: 40",
        "&cMinimum Range: 5",
        "&cDamage: 4 hearts",
        "&cCooldown: 0.75 seconds"
    );

    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7Shotgun",
        "",
        "&7Less range than a",
        "&7rifle, but more damage.",
        "&cRange: 25",
        "&cMinimum Range: 5",
        "&cDamage: 6.5 hearts",
        "&cCooldown: 1.25 seconds"
    );

    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7Assault Rifle",
        "",
        "&7A derivative of",
        "&7the rifle, the assault",
        "&7rifle is the standard",
        "&7military weapon.",
        "&cRange: 50",
        "&cMinimum Range: 3",
        "&cDamage: 6.5 hearts",
        "&cCooldown: 0.3 seconds"
    );

    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7Sniper Rifle",
        "",
        "&7The ultimate long-range",
        "&7gun, the sniper is very powerful.",
        "&cRange: 130",
        "&cMinimum Range: 50",
        "&cDamage: 11 hearts",
        "&cCooldown: 8 seconds"
    );

    public static final SlimefunItemStack ENERGY_RIFLE = new SlimefunItemStack(
        "GUN_ENERGY_RIFLE",
        Material.CROSSBOW,
        "&eEnergy Rifle",
        "",
        "&7Finally, no need to carry around bullets!",
        "&cUses 5J per shot",
        "&cRange: 100",
        "&cDamage: 10 hearts",
        "&cCooldown: 0.2 seconds",
        LoreBuilder.powerCharged(0, 2500),
        "&eNote: The bullets visually shoot a little off",
        "&ebut you still hit the target"
    );
}

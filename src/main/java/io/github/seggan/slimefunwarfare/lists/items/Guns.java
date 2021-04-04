package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Guns {

    private Guns() {}

    public static final SlimefunItemStack PISTOL = new SlimefunItemStack(
        "GUN_PISTOL",
        Material.CROSSBOW,
        "&7手枪",
        "",
        "&7短程枪",
        "&7换弹较快",
        "&7适用于近距离战斗",
        "&c范围: 10",
        "&c伤害: 3 颗心",
        "&c冷却时间: 0.5 秒"
    );

    public static final SlimefunItemStack REVOLVER = new SlimefunItemStack(
        "GUN_REVOLVER",
        Material.CROSSBOW,
        "&7左轮手枪",
        "",
        "&7短程枪",
        "&7装弹较快",
        "&7适用于近距离战斗",
        "&c范围: 10",
        "&c伤害: 3心",
        "&c冷却时间: 0.3 秒"
    );

    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7机枪",
        "",
        "&7砰 砰 砰",
        "&c范围: 30",
        "&c最小范围: 5",
        "&c伤害: 3心",
        "&c冷却时间: 0.15 秒"
    );

    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7小型机枪",
        "",
        "&7和你朋友在一起交♂往的",
        "&7终极装置",
        "&c范围: 40",
        "&c最小范围: 5",
        "&c伤害: 4心",
        "&c冷却时间: 无"
    );

    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7步枪",
        "",
        "&7 标准的步枪",
        "&c范围: 40",
        "&c最小范围: 5",
        "&c伤害: 4心",
        "&c冷却时间: 0.75 秒"
    );

    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7霰弹枪",
        "",
        "&7射击范围比步枪小",
        "&7但是威力更大",
        "&c范围: 25",
        "&c最小范围: 5",
        "&c伤害: 6.5心",
        "&c冷却时间: 1.25 秒"
    );

    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7突击步枪",
        "",
        "&7它比普通步枪更强",
        "&7是标准的",
        "&7军事武器",
        "&c范围: 50",
        "&c最小范围: 3",
        "&c伤害: 6.5心",
        "&c冷却时间: 0.3 秒"
    );

    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7狙击枪",
        "",
        "&7射击范围非常远",
        "&7它非常强大",
        "&c范围: 130",
        "&c最小范围: 50",
        "&c伤害: 11心",
        "&c冷却时间: 8 秒"
    );

    public static final SlimefunItemStack ENERGY_RIFLE = new SlimefunItemStack(
        "GUN_ENERGY_RIFLE",
        Material.CROSSBOW,
        "&e能量步枪",
        "",
        "&7最后,无需消耗任何子弹！",
        "&c每次使用将消耗5J",
        "&c范围: 100",
        "&c伤害: 10心",
        "&c冷却时间: 0.2s",
        LoreBuilder.powerCharged(0, 2500),
        "&e注意：子弹在视觉上不太明显",
        "&e但是你仍然能击中目标"
    );
}

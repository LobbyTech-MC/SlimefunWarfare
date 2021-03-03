package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Explosives {

    private Explosives() {
    }

    public static final SlimefunItemStack PYRO_POWDER = new SlimefunItemStack(
        "PYRO_POWDER",
        Material.REDSTONE,
        "&4火药粉",
        "",
        "&7确实是一种极易爆炸的物质"
    );

    public static final SlimefunItemStack LIQUID_AIR = new SlimefunItemStack(
        "LIQUID_AIR",
        HeadTexture.TIN_CAN,
        "&f液化空气",
        "",
        "&7不要碰!"
    );

    public static final SlimefunItemStack LIQUID_NITROGEN = new SlimefunItemStack(
        "LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f液氮",
        "",
        "&7冰冻任何人?"
    );

    public static final SlimefunItemStack PURIFIED_LIQUID_NITROGEN = new SlimefunItemStack(
        "PURIFIED_LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f纯化液氮",
        "",
        "&7尽可能纯净"
    );

    public static final SlimefunItemStack LIQUID_OXYGEN = new SlimefunItemStack(
        "LIQUID_OXYGEN",
        HeadTexture.TIN_CAN,
        "&f液氧",
        "",
        "&7提神醒脑"
    );

    public static final SlimefunItemStack FLOX = new SlimefunItemStack(
        "FLOX",
        HeadTexture.TIN_CAN,
        "&FLOX",
        "",
        "&7汽油 + 液氧 右键单击进入太空",
        "&c确保双点击空格键",
        "&c传送到天上"
    );

    public static final SlimefunItemStack THIOACETONE = new SlimefunItemStack(
        "THIOACETONE",
        Material.BROWN_DYE,
        "&6硫丙酮",
        "",
        "&7确实很臭"
    );

    public static final SlimefunItemStack NITROGEN_TRIIODIDE = new SlimefunItemStack(
        "NITROGEN_TRIIODIDE",
        Material.PURPLE_DYE,
        "&5三碘化氮",
        "",
        "&7手榴弹的一种材料"
    );

    public static final SlimefunItemStack AZIDOAZIDE_AZIDE = new SlimefunItemStack(
        "AZIDOAZIDE_AZIDE",
        Material.SUGAR,
        "&e叠氮叠氮化物",
        "",
        "&7手榴弹的一种材料"
    );

    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "ARSENIC",
        Material.GUNPOWDER,
        "&7砷",
        "",
        "&7手榴弹的一种材料"
    );

    public static final SlimefunItemStack ENRICHED_URANIUM = new SlimefunItemStack(
        "ENRICHED_URANIUM",
        HeadTexture.BOOSTED_URANIUM,
        "&a浓缩铀"
    );

    public static final SlimefunItemStack EMPTY_GRENADE = new SlimefunItemStack(
        "GRENADE",
        Material.SNOWBALL,
        "&f化学手榴弹",
        "",
        "&7包含: 无"
    );

    public static final SlimefunItemStack REINFORCED_CONCRETE = new SlimefunItemStack(
        "REINFORCED_CONCRETE",
        Material.GRAY_CONCRETE,
        "&7钢筋混凝土",
        "",
        "&7能够抵抗几次爆炸"
    );

    public static final SlimefunItemStack NUCLEAR_BOMB = new SlimefunItemStack(
        "NUCLEAR_BOMB",
        Material.TNT,
        "&7核弹",
        "",
        "&7核爆！"
    );
}

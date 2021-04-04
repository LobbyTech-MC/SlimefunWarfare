package io.github.seggan.slimefunwarfare.lists.items;

import io.github.seggan.slimefunwarfare.lists.Heads;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Color;
import org.bukkit.Material;

public final class Items {

    private Items() {}

    public static final SlimefunItemStack SLIMESTEEL = new SlimefunItemStack(
        "SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a软钢锭",
        "",
        "坚硬而有弹性的一种材料"
    );

    public static final SlimefunItemStack REINFORCED_SLIMESTEEL = new SlimefunItemStack(
        "REINFORCED_SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a强化软钢锭",
        "",
        "坚硬而有弹性的一种材料"
    );

    public static final SlimefunItemStack SCOPE = new SlimefunItemStack(
        "SCOPE",
        Material.STICK,
        "&a瞄准器"
    );

    public static final SlimefunItemStack BARREL = new SlimefunItemStack(
        "BARREL",
        Material.STICK,
        "&7枪管"
    );

    public static final SlimefunItemStack ADVANCED_BARREL = new SlimefunItemStack(
        "ADVANCED_BARREL",
        Material.STICK,
        "&7高级枪管"
    );

    public static final SlimefunItemStack BULLET_PRESS = new SlimefunItemStack(
        "BULLET_PRESS",
        Material.SMOKER,
        "&7子弹制造机",
        "",
        LoreBuilder.powerPerSecond(16),
        LoreBuilder.powerBuffer(32),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack AIR_LIQUEFIER = new SlimefunItemStack(
        "AIR_LIQUEFIER",
        Material.BEACON,
        "&b空气液化器",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack EXPLOSIVE_SYNTHESIZER = new SlimefunItemStack(
        "EXPLOSIVE_SYNTHESIZER",
        Material.TNT,
        "&4爆炸合成器",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack BOOMINATOR_9000 = new SlimefunItemStack(
        "BOOMINATOR_9000",
        Material.SMITHING_TABLE,
        "&4助泡剂9000",
        "",
        "&7处理用于核弹的铀",
        LoreBuilder.powerPerSecond(1024),
        LoreBuilder.powerBuffer(2048),
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7铁制子弹",
        "",
        "&7x0.75伤害"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7铅制子弹",
        "",
        "&7x1伤害"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&aDU弹",
        "",
        "&7让命中的实体着火",
        "&7x1.5伤害"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6金子弹",
        "",
        "&7x2伤害"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6三硝基丁烯弹",
        "",
        "&7让命中的实体着火",
        "&7x2.75伤害"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7枪壳",
        "",
        "&7所有枪的基础"
    );

    public static final SlimefunItemStack OSMIUM_METEOR = new SlimefunItemStack(
        "OSMIUM_METEOR",
        Material.IRON_ORE,
        "&9流星",
        "",
        "&7稀有金属的来源"
    );

    public static final SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack(
        "OSMIUM_DUST",
        Material.SUGAR,
        "&9锇尘",
        "",
        "&7剧毒 不要吸入!"
    );

    public static final SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack(
        "OSMIUM_INGOT",
        Material.IRON_INGOT,
        "&9锇锭",
        "",
        "&7在外太空发现的一种强大的材料"
    );

    public static final SlimefunItemStack OSMIUM_SUPERALLOY = new SlimefunItemStack(
        "OSMIUM_SUPERALLOY",
        Material.IRON_INGOT,
        "&9锇超级高温合金",
        "",
        "&7最硬，最坚韧，最坚固的材料"
    );

    public static final SlimefunItemStack SEGGANESSON_METEOR = new SlimefunItemStack(
        "SEGGANESSON_METEOR",
        Material.DIAMOND_ORE,
        "&7塞加尼斯松流星",
        "",
        "&7稀有元素塞加尼斯松的来源"
    );

    public static final SlimefunItemStack SEGGANESSON = new SlimefunItemStack(
        "SEGGANESSON",
        Material.LIGHT_BLUE_DYE,
        "&b塞加尼斯松",
        "",
        "&7一种有潜力的稀有元素"
    );

    public static final SlimefunItemStack ENERGY_RECTIFIER = new SlimefunItemStack(
        "ENERGY_RECTIFIER",
        Material.POWERED_RAIL,
        "&b能量整流器",
        "",
        "&7将电能转化为纯能源"
    );

    public static final SlimefunItemStack UNPATENTABLIUM = new SlimefunItemStack(
        "UNPATENTABLIUM",
        Material.LIGHT_BLUE_DYE,
        "&bUnpatentablium",
        "",
        "&7For some reason, the",
        "&7Feds wouldn't let you",
        "&7patent this powerful",
        "&7power source"
    );

    public static final SlimefunItemStack POWER_SUIT_GENERATOR = new SlimefunItemStack(
        "POWER_SUIT_GENERATOR",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFkNWExZmY3Zjk3NmMxYzJlYmQ0ZWY5YTkwYWQ5MTQ2Nzk1YzFjNDRmZGFlNjI5NjQ5NDg0MzRhNzI1NyJ9fX0=",
        "&6Power Suit Generator",
        "",
        "&7The central power",
        "&7source of any power",
        "&7suit"
    );

    public static final SlimefunItemStack ELEMENT_FORGE = new SlimefunItemStack(
        "ELEMENT_FORGE",
        Material.SMITHING_TABLE,
        "&cElement Forge",
        "",
        "&7Used to create new elements",
        "&cMultiblock Structure"
    );

    public static final SlimefunItemStack POWER_SUIT_HELMET = new SlimefunItemStack(
        "POWER_SUIT_HELMET",
        Heads.SUIT_HELMET,
        "&4Power Suit Helmet",
        "",
        "&7A powerful piece of armor",
        "&7that is designed to be modified.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_CHESTPLATE = new SlimefunItemStack(
        "POWER_SUIT_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.MAROON,
        "&4Power Suit Chestplate",
        "",
        "&7A powerful piece of armor",
        "&7that is designed to be modified.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_LEGGINGS = new SlimefunItemStack(
        "POWER_SUIT_LEGGINGS",
        Material.LEATHER_LEGGINGS, Color.MAROON,
        "&4Power Suit Leggings",
        "",
        "&7A powerful piece of armor",
        "&7that is designed to be modified.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_BOOTS = new SlimefunItemStack(
        "POWER_SUIT_BOOTS",
        Material.LEATHER_BOOTS, Color.MAROON,
        "&4Power Suit Boots",
        "",
        "&7A powerful piece of armor",
        "&7that is designed to be modified.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );

    public static final SlimefunItemStack MODULE_MANIPULATOR = new SlimefunItemStack(
        "MODULE_MANIPULATOR",
        Material.CRAFTING_TABLE,
        "&fModule Manipulator",
        "",
        "&7Allows you to install, uninstall",
        "&7and view modules"
    );

    public static final SlimefunItemStack MODULE_CASE = new SlimefunItemStack(
        "MODULE_CASE",
        Heads.MODULE,
        "&6Module Case"
    );
}

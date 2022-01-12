package io.github.seggan.slimefunwarfare.lists;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public final class Items {

    // region explosives
    public static final SlimefunItemStack PYRO_POWDER = new SlimefunItemStack(
        "PYRO_POWDER",
        Material.REDSTONE,
        "&4火药粉",
        "",
        "&7爆炸危险!"
    );
    public static final SlimefunItemStack LIQUID_AIR = new SlimefunItemStack(
        "LIQUID_AIR",
        HeadTexture.TIN_CAN,
        "&f液态空气",
        "",
        "&7禁止触摸!"
    );
    public static final SlimefunItemStack LIQUID_NITROGEN = new SlimefunItemStack(
        "LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f液氮",
        "",
        "&7注意低温?"
    );
    public static final SlimefunItemStack PURIFIED_LIQUID_NITROGEN = new SlimefunItemStack(
        "PURIFIED_LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f纯化液氮",
        "",
        "&7高纯度"
    );
    public static final SlimefunItemStack THIOACETONE = new SlimefunItemStack(
        "THIOACETONE",
        Material.BROWN_DYE,
        "&6硫代丙酮",
        "",
        "&7臭鸡蛋味"
    );
    public static final SlimefunItemStack NITROGEN_TRIIODIDE = new SlimefunItemStack(
        "NITROGEN_TRIIODIDE",
        Material.PURPLE_DYE,
        "&5三碘化氮",
        "",
        "&7手榴弹原料之一"
    );
    public static final SlimefunItemStack AZIDOAZIDE_AZIDE = new SlimefunItemStack(
        "AZIDOAZIDE_AZIDE",
        Material.SUGAR,
        "&e叠氮化物",
        "",
        "&7手榴弹原料之一"
    );
    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "ARSENIC",
        Material.GUNPOWDER,
        "&7砷",
        "",
        "&7手榴弹原料之一"
    );
    public static final SlimefunItemStack ENRICHED_URANIUM = new SlimefunItemStack(
        "ENRICHED_URANIUM",
        HeadTexture.BOOSTED_URANIUM,
        "&a浓缩铀",
        "",
        LoreBuilder.radioactive(Radioactivity.VERY_DEADLY)
    );
    public static final SlimefunItemStack EMPTY_GRENADE = new SlimefunItemStack(
        "GRENADE",
        Material.SNOWBALL,
        "&f化学手榴弹",
        "",
        "&7类型: 无"
    );
    public static final SlimefunItemStack REINFORCED_CONCRETE = new SlimefunItemStack(
        "REINFORCED_CONCRETE",
        Material.GRAY_CONCRETE,
        "&7钢筋混凝土",
        "",
        "&7一种具有爆炸抗性 (不保证炸不坏) 的混凝土"
    );
    public static final SlimefunItemStack NUCLEAR_BOMB = new SlimefunItemStack(
        "NUCLEAR_BOMB",
        Material.TNT,
        "&7核弹",
        "",
        "&7KABOOM!",
        LoreBuilder.radioactive(Radioactivity.VERY_DEADLY)
    );
    // endregion

    // region general
    public static final SlimefunItemStack BORAX = new SlimefunItemStack(
        "BORAX",
        Material.QUARTZ,
        "&f硼砂",
        "",
        "&7一种从石头上掉下来的普通矿物"
    );
    public static final SlimefunItemStack BORON = new SlimefunItemStack(
        "BORON",
        Material.CHARCOAL,
        "&7硼"
    );
    public static final SlimefunItemStack SLIMESTEEL = new SlimefunItemStack(
        "SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a史莱姆钢锭",
        "",
        "坚硬且延展性好的金属",
        "非常适合于各种应用场景"
    );

    public static final SlimefunItemStack REINFORCED_SLIMESTEEL = new SlimefunItemStack(
        "REINFORCED_SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a强化史莱姆钢锭",
        "",
        "坚硬且延展性好的金属",
        "非常适合于各种应用场景"
    );

    public static final SlimefunItemStack SCOPE = new SlimefunItemStack(
        "SCOPE",
        Material.STICK,
        "&a瞄准镜"
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
        "&7子弹头压力机",
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
        "&4轰鸣器 9000",
        "",
        "&7为核弹加工铀",
        LoreBuilder.powerPerSecond(1024),
        LoreBuilder.powerBuffer(2048),
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7铁子弹",
        "",
        "&7x0.75 伤害"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7铅弹",
        "",
        "&7x1 伤害"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&a杜子弹",
        "",
        "&7点燃被击中的实体",
        "&7x1.5 伤害"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6金子弹",
        "",
        "&7x2 伤害"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6三硝基弹",
        "",
        "&7点燃被击中的实体",
        "&7x2.75 伤害"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7枪盒",
        "",
        "&7所有枪支的基地"
    );

    public static final SlimefunItemStack OSMIUM_METEOR = new SlimefunItemStack(
        "OSMIUM_METEOR",
        Material.IRON_ORE,
        "&9锇陨石",
        "",
        "&7稀有金属锇的来源"
    );

    public static final SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack(
        "OSMIUM_DUST",
        Material.SUGAR,
        "&9锇粉",
        "",
        "&7剧毒 戴好防毒面具!"
    );

    public static final SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack(
        "OSMIUM_INGOT",
        Material.IRON_INGOT,
        "&9锇锭",
        "",
        "&7一种仅在外太空发现的非常坚固的金属"
    );

    public static final SlimefunItemStack OSMIUM_SUPERALLOY = new SlimefunItemStack(
        "OSMIUM_SUPERALLOY",
        Material.IRON_INGOT,
        "&9锇高温合金",
        "",
        "&7已知硬度最大、柔韧性最好、最强的矿物材料"
    );

    public static final SlimefunItemStack SEGGANESSON_METEOR = new SlimefunItemStack(
        "SEGGANESSON_METEOR",
        Material.DIAMOND_ORE,
        "&7赛格内松流星",
        "",
        "&7稀有元素赛格内松的资源"
    );

    public static final SlimefunItemStack SEGGANESSON = new SlimefunItemStack(
        "SEGGANESSON",
        Material.LIGHT_BLUE_DYE,
        "&b赛格内松",
        "",
        "&7一种有潜力为整个城市供电的稀有元素"
    );

    public static final SlimefunItemStack ENERGY_RECTIFIER = new SlimefunItemStack(
        "ENERGY_RECTIFIER",
        Material.POWERED_RAIL,
        "&b能量整流器",
        "",
        "&7将电能转化为纯能量"
    );

    public static final SlimefunItemStack METEOR_ATTRACTOR = new SlimefunItemStack(
        "METEOR_ATTRACTOR",
        HeadTexture.MAGNET,
        "&f流星吸引器",
        "",
        "&7一个强大的磁铁",
        "&7可以从太空中吸引流星"
    );

    public static final SlimefunItemStack ELEMENTAL_REACTOR = new SlimefunItemStack(
        "ELEMENTAL_REACTOR",
        HeadTexture.GENERATOR,
        "&b元素反应堆",
        "",
        "&7使用富有能量的",
        "&7赛格内松和未获专利材料发电",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(32_768),
        LoreBuilder.powerPerSecond(32_768)
    );

    public static final SlimefunItemStack FIBER_OPTIC_GLASS = new SlimefunItemStack(
        "FIBER_OPTIC_GLASS",
        Material.BLUE_STAINED_GLASS,
        "&f光纤玻璃"
    );

    public static final SlimefunItemStack FIBER_OPTIC_CABLE = new SlimefunItemStack(
        "FIBER_OPTIC_CABLE",
        Material.STRING,
        "&f光纤电缆"
    );

    public static final SlimefunItemStack LASER_DIODE = new SlimefunItemStack(
        "LASER_DIODE",
        PlayerHead.getItemStack(Heads.LASER),
        "&4激光二极管"
    );

    public static final SlimefunItemStack ULTRA_MAGNET = new SlimefunItemStack(
        "ULTRA_MAGNET",
        HeadTexture.MAGNET.getTexture(),
        "&f超磁铁"
    );

    public static final SlimefunItemStack RADIO = new SlimefunItemStack(
        "RADIO",
        Material.REDSTONE_TORCH,
        "&f收音机",
        "",
        "&7将它放入背包与别人聊天",
        "&7通过加密秘钥对消息进行编码/解码",
        "&7只有拥有相同加密秘钥的人可以读懂你的消息",
        "&7右键设置加密秘钥聊天"
    );
    // endregion

    // region rare earths
    public static final SlimefunItemStack ION_EXCHANGE_SEPARATOR = new SlimefunItemStack(
        "ION_EXCHANGE_SEPARATOR",
        Material.SEA_LANTERN,
        "&b离子交换分离器",
        "",
        "&7提纯独居石中难以分离的稀土",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(256),
        LoreBuilder.powerBuffer(512)
    );

    public static final SlimefunItemStack MONAZITE = new SlimefunItemStack(
        "MONAZITE",
        Material.ORANGE_DYE,
        "&e独居石",
        "",
        "&7所有稀土的来源",
        "&7可以在火成岩中找到"
    );

    public static final SlimefunItemStack LANTHANUM_INGOT = new SlimefunItemStack(
        "LANTHANUM_INGOT",
        Material.IRON_INGOT,
        "&e镧锭",
        "",
        "&7可用作无限打火石"
    );

    public static final SlimefunItemStack NEODYMIUM_INGOT = new SlimefunItemStack(
        "NEODYMIUM_INGOT",
        Material.NETHERITE_INGOT,
        "&e钕锭"
    );

    public static final SlimefunItemStack GADOLINIUM_INGOT = new SlimefunItemStack(
        "GADOLINIUM_INGOT",
        Material.IRON_INGOT,
        "&e钆锭"
    );

    public static final SlimefunItemStack TERBIUM_INGOT = new SlimefunItemStack(
        "TERBIUM_INGOT",
        Material.IRON_INGOT,
        "&e铽锭"
    );

    public static final SlimefunItemStack DYSPROSIUM_INGOT = new SlimefunItemStack(
        "DYSPROSIUM_INGOT",
        Material.NETHERITE_INGOT,
        "&e镝锭"
    );

    public static final SlimefunItemStack HOLMIUM_INGOT = new SlimefunItemStack(
        "HOLMIUM_INGOT",
        Material.BRICK,
        "&e钬锭"
    );

    public static final SlimefunItemStack ERBIUM_INGOT = new SlimefunItemStack(
        "ERBIUM_INGOT",
        Material.IRON_INGOT,
        "&e铒锭"
    );

    public static final SlimefunItemStack YTTERBIUM_INGOT = new SlimefunItemStack(
        "YTTERBIUM_INGOT",
        Material.IRON_INGOT,
        "&e镱锭"
    );

    public static final SlimefunItemStack TERFENOL_D = new SlimefunItemStack(
        "TERFENOL_D",
        Material.IRON_INGOT,
        "&6三苯酚",
        "",
        "&7这种合金具有在磁场中",
        "&7改变形状的有趣特性"
    );

    public static final SlimefunItemStack TERFENOL_D_BLOCK = new SlimefunItemStack(
        "TERFENOL_D_BLOCK",
        Material.IRON_BLOCK,
        "&6三苯酚块"
    );

    public static final SlimefunItemStack NDFEB_ALLOY = new SlimefunItemStack(
        "NDFEB_ALLOY",
        Material.NETHERITE_INGOT,
        "&6钕铁硼合金",
        "",
        "&7这种合金是人类已知最具磁性的",
        "&7最具磁性的材料"
    );

    public static final SlimefunItemStack NDFEB_ALLOY_BLOCK = new SlimefunItemStack(
        "NDFEB_ALLOY_BLOCK",
        Material.NETHERITE_BLOCK,
        "&6钕铁硼合金块"
    );
    // endregion

    // region suits
    public static final SlimefunItemStack UNPATENTABLIUM = new SlimefunItemStack(
        "UNPATENTABLIUM",
        Material.LIGHT_BLUE_DYE,
        "&b未获专利材料",
        "",
        "&7出于某种原因",
        "&7联邦调查局不会让你",
        "&7为这种强大的电源",
        "&7申请专利"
    );

    public static final SlimefunItemStack POWER_SUIT_GENERATOR = new SlimefunItemStack(
        "POWER_SUIT_GENERATOR",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFkNWExZmY3Zjk3NmMxYzJlYmQ0ZWY5YTkwYWQ5MTQ2Nzk1YzFjNDRmZGFlNjI5NjQ5NDg0MzRhNzI1NyJ9fX0=",
        "&6电力套装发电装置",
        "",
        "&7任何用电套装",
        "&7的电力供给中心"
    );

    public static final SlimefunItemStack ELEMENT_FORGE = new SlimefunItemStack(
        "ELEMENT_FORGE",
        Material.SMITHING_TABLE,
        "&c元素铁砧",
        "",
        "&7用于创建新元素",
        "&c多方块结构"
    );

    public static final SlimefunItemStack POWER_SUIT_HELMET = new SlimefunItemStack(
        "POWER_SUIT_HELMET",
        PlayerHead.getItemStack(Heads.SUIT_HELMET),
        "&4电力套装头盔",
        "",
        "&7改进设计的强大盔甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_CHESTPLATE = new SlimefunItemStack(
        "POWER_SUIT_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.MAROON,
        "&4电力套装胸甲",
        "",
        "&7改进设计的强大盔甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_LEGGINGS = new SlimefunItemStack(
        "POWER_SUIT_LEGGINGS",
        Material.LEATHER_LEGGINGS, Color.MAROON,
        "&4电力套装头盔",
        "",
        "&7改进设计的强大盔甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_BOOTS = new SlimefunItemStack(
        "POWER_SUIT_BOOTS",
        Material.LEATHER_BOOTS, Color.MAROON,
        "&4电力套装靴子",
        "",
        "&7改进设计的强大盔甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );

    public static final SlimefunItemStack MODULE_MANIPULATOR = new SlimefunItemStack(
        "MODULE_MANIPULATOR",
        Material.CRAFTING_TABLE,
        "&f模块机械手",
        "",
        "&7允许你安装、卸载或查看模组"
    );

    public static final SlimefunItemStack MODULE_CASE = new SlimefunItemStack(
        "MODULE_CASE",
        PlayerHead.getItemStack(Heads.MODULE),
        "&6模组案例"
    );
    // endregion

    // region guns
    public static final SlimefunItemStack PISTOL = new SlimefunItemStack(
        "GUN_PISTOL",
        Material.CROSSBOW,
        "&7手枪",
        "",
        "&7短程枪",
        "&7换弹快",
        "&7近战优势",
        "&c范围: 10",
        "&c伤害: 3 颗星",
        "&c冷却: 0.5 秒"
    );
    public static final SlimefunItemStack REVOLVER = new SlimefunItemStack(
        "GUN_REVOLVER",
        Material.CROSSBOW,
        "&7左轮手枪",
        "",
        "&7短程枪",
        "&7换弹快",
        "&7近战优势",
        "&c范围: 10",
        "&c伤害: 3 颗星",
        "&c冷却: 0.3 秒"
    );
    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7机枪",
        "",
        "&7biu biu biu",
        "&c范围: 30",
        "&c最小范围: 5",
        "&c伤害: 3 颗星",
        "&c冷却: 0.15 秒"
    );
    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7机枪",
        "",
        "&7保护队友的终极设备",
        "&c范围: 40",
        "&c最小范围: 5",
        "&c伤害: 4 颗星",
        "&c冷却: 无"
    );
    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7步枪",
        "",
        "&7标准步枪",
        "&c范围: 40",
        "&c最小范围: 5",
        "&c伤害: 4 颗星",
        "&c冷却: 0.75 秒"
    );
    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7霰弹枪",
        "",
        "&7射程比步枪小",
        "&7伤害比步枪高",
        "&c范围: 25",
        "&c最小范围: 5",
        "&c伤害: 6.5 颗星",
        "&c冷却: 1.25 秒"
    );
    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7突击步枪",
        "",
        "&7步枪的衍生版本",
        "&7是一种标准武器",
        "&c范围: 50",
        "&c最小范围: 3",
        "&c伤害: 6.5 颗星",
        "&c冷却: 0.3 秒"
    );
    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7狙击步枪",
        "",
        "&7终极远程武器",
        "&7强大的狙击武器",
        "&c范围: 130",
        "&c最小范围: 50",
        "&c伤害: 11 颗星",
        "&c冷却: 8 秒"
    );
    public static final SlimefunItemStack ENERGY_RIFLE = new SlimefunItemStack(
        "GUN_ENERGY_RIFLE",
        Material.CROSSBOW,
        "&e电力步枪",
        "",
        "&7终于不用随身携带子弹了!",
        "&c每发子弹消耗 5J 电力",
        "&c范围: 100",
        "&c伤害: 10 hearts",
        "&c冷却: 0.2 seconds",
        LoreBuilder.powerCharged(0, 2500),
        "&e注意: 子弹在视觉上有点偏离",
        "&e但你仍然击中了目标"
    );
    // endregion

    // region melee
    public static final SlimefunItemStack ENERGY_BLADE = new SlimefunItemStack(
        "ENERGY_BLADE",
        Material.DIAMOND_SWORD,
        "&b电力刀刃",
        "",
        "&7在某些圈子中称为 \"光剑\",",
        "&7这把先进的剑使用",
        "&7纯净的能量来切开活体组织",
        "",
        "&9每发子弹消耗 5J 电力",
        LoreBuilder.powerCharged(0, 2500),
        "",
        "&7在主手时:",
        "&2 14 攻击伤害",
        "&2 1.6 攻击速度"
    );
    public static final SlimefunItemStack BATTLE_AXE = new SlimefunItemStack(
        "BATTLE_AXE",
        Material.IRON_AXE,
        "&6&l战斧",
        "",
        "&7专为战斗设计的斧子. 没有烦人的冷却时间!",
        "",
        "&7在主手时:",
        "&2 9 攻击伤害",
        "&2 1.6 攻击速度"
    );
    public static final SlimefunItemStack OSMIUM_SWORD = new SlimefunItemStack(
        "OSMIUM_SWORD",
        Material.IRON_SWORD,
        "&6锇剑",
        "",
        "&7重量级剑",
        "",
        "&7当在主手时:",
        "&2 10 攻击伤害",
        "&2 1.6 攻击速度"
    );
    public static final SlimefunItemStack DUMMY = new SlimefunItemStack(
        "DUMMY",
        Material.HUSK_SPAWN_EGG,
        "&f假人刷怪蛋",
        "",
        "&7右键生成一个假人; 当你击中他时",
        "&7他会告诉你对他造成了多少伤害",
        "&7右键摧毁他"
    );
    // endregion

    static {
        ENERGY_BLADE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);

        ItemMeta meta = Items.ENERGY_BLADE.getItemMeta();
        meta.setUnbreakable(true);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            13,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        ENERGY_BLADE.setItemMeta(meta);

        // Sets the attack speed to match that of a sword
        meta = BATTLE_AXE.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackSpeed",
            -2.4,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            8,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        BATTLE_AXE.setItemMeta(meta);

        OSMIUM_SWORD.addUnsafeEnchantment(Enchantment.DURABILITY, 8);

        meta = OSMIUM_SWORD.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            9,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        OSMIUM_SWORD.setItemMeta(meta);
    }
}

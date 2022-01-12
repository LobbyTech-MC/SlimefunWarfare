package io.github.seggan.slimefunwarfare.lists.items;

import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import io.github.seggan.slimefunwarfare.lists.Heads;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

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
        "&b未获专利材料",
        "",
        "&7出于某种原因",
        "&7美联储不允许",
        "&7申请这种强大",
        "&7的电源专利"
    );

    public static final SlimefunItemStack POWER_SUIT_GENERATOR = new SlimefunItemStack(
        "POWER_SUIT_GENERATOR",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFkNWExZmY3Zjk3NmMxYzJlYmQ0ZWY5YTkwYWQ5MTQ2Nzk1YzFjNDRmZGFlNjI5NjQ5NDg0MzRhNzI1NyJ9fX0=",
        "&6电力套装发电器",
        "",
        "&7电力套装的中央",
        "&7电力控制系统"
    );

    public static final SlimefunItemStack ELEMENT_FORGE = new SlimefunItemStack(
        "ELEMENT_FORGE",
        Material.SMITHING_TABLE,
        "&c元素铁砧",
        "",
        "&7用于制造新元素",
        "&c多方块结构"
    );

    public static final SlimefunItemStack POWER_SUIT_HELMET = new SlimefunItemStack(
        "POWER_SUIT_HELMET",
        PlayerHead.getItemStack(Heads.SUIT_HELMET),
        "&4电力套装头盔",
        "",
        "&7可装配组件的强大胸甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_CHESTPLATE = new SlimefunItemStack(
        "POWER_SUIT_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.MAROON,
        "&4电力套装胸甲",
        "",
        "&7可装配组件的强大胸甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_LEGGINGS = new SlimefunItemStack(
        "POWER_SUIT_LEGGINGS",
        Material.LEATHER_LEGGINGS, Color.MAROON,
        "&4电力套装护腿",
        "",
        "&7可装配组件的强大胸甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_BOOTS = new SlimefunItemStack(
        "POWER_SUIT_BOOTS",
        Material.LEATHER_BOOTS, Color.MAROON,
        "&4电力套装靴子",
        "",
        "&7可装配组件的强大胸甲",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );

    public static final SlimefunItemStack MODULE_MANIPULATOR = new SlimefunItemStack(
        "MODULE_MANIPULATOR",
        Material.CRAFTING_TABLE,
        "&f机械手臂模块",
        "",
        "&7允许你安装、卸载和查看模块"
    );

    public static final SlimefunItemStack MODULE_CASE = new SlimefunItemStack(
        "MODULE_CASE",
        PlayerHead.getItemStack(Heads.MODULE),
        "&6模块样例"
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
        "&7用于近战",
        "&c最大射程: 10",
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
        "&7用于近战",
        "&c最大射程: 10",
        "&c伤害: 3 颗星",
        "&c冷却: 0.3 秒"
    );
    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7机枪",
        "",
        "&7Pew pew pew",
        "&c最大射程: 30",
        "&c最小射程: 5",
        "&c伤害: 3 颗星",
        "&c冷却: 0.15 秒"
    );
    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7轻机枪",
        "",
        "&7保护队友的终极设备",
        "&c最大射程: 40",
        "&c最小射程: 5",
        "&c伤害: 4 颗星",
        "&c冷却: 无"
    );
    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7步枪",
        "",
        "&7标准步枪",
        "&c最大射程: 40",
        "&c最小射程: 5",
        "&c伤害: 4 颗星",
        "&c冷却: 0.75 秒"
    );
    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7霰弹枪",
        "",
        "&7射程小于步枪",
        "&7伤害大于步枪",
        "&c最大射程: 25",
        "&c最小射程: 5",
        "&c伤害: 6.5 颗星",
        "&c冷却: 1.25 秒"
    );
    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7突击步枪",
        "",
        "&7标准步枪的衍生物",
        "&7突击步枪是标准的军用武器",
        "&c最大射程: 50",
        "&c最小射程: 3",
        "&c伤害: 6.5 颗星",
        "&c冷却: 0.3 秒"
    );
    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7狙击步枪",
        "",
        "&7终极远程武器",
        "&7强大的狙击能力",
        "&c最大范围: 130",
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
        "&c单发消耗 5J 电力",
        "&c射程: 100",
        "&c伤害: 10 颗星",
        "&c冷却: 0.2 秒",
        LoreBuilder.powerCharged(0, 2500),
        "&e注意: 子弹在视觉上射击了一点",
        "&e但是你任然击中了目标"
    );
    // endregion

    // region melee
    public static final SlimefunItemStack ENERGY_BLADE = new SlimefunItemStack(
        "ENERGY_BLADE",
        Material.DIAMOND_SWORD,
        "&b能量之刃",
        "",
        "&7在某些圈子中称为 \"光剑\",",
        "&7这把高级剑使用纯净的能量",
        "&7切开活组织",
        "",
        "&9单发消耗 5J 电力",
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
        "&7这把斧头专为战斗而设计. 无需担心冷却问题!",
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
        "&7拿在手上很沉重的感觉",
        "",
        "&7在主手时:",
        "&2 10 攻击伤害",
        "&2 1.6 攻击速度"
    );
    public static final SlimefunItemStack DUMMY = new SlimefunItemStack(
        "DUMMY",
        Material.HUSK_SPAWN_EGG,
        "&f假人刷怪蛋",
        "",
        "&7右键生成一个假人; 当你击中他的时候",
        "&7他会告诉你你造成了多少伤害.",
        "&7右键单击他以摧毁他"
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

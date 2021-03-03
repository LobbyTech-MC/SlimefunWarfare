package io.github.seggan.slimefunwarfare.lists;

import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Categories {

    private Categories() {}

    public static final Category GENERAL = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare"),
        new CustomItem(Material.DIAMOND_SWORD, "粘液战争")
    );

    public static final Category GUNS = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_guns"),
        new CustomItem(Material.CROSSBOW, "粘液战争 - 枪支")
    );

    public static final Category MELEE = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_melee"),
        new CustomItem(Material.IRON_AXE, "粘液战争 - 近战武器")
    );

    public static final Category EXPLOSIVES = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_explosives"),
        new CustomItem(Material.TNT, "粘液战争 - 爆炸性武器")
    );

    public static final Category RESOURCES = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_resources"),
        new CustomItem(Material.IRON_ORE, "粘液战争 - 资源")
    );
}

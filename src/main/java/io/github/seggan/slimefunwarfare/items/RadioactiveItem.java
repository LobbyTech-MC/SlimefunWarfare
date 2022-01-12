package io.github.seggan.slimefunwarfare.items;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;

public class RadioactiveItem extends SlimefunItem implements Radioactive {

    private final Radioactivity radioactivity;

    public RadioactiveItem(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, Radioactivity radioactivity) {
        super(category, item, recipeType, recipe);
        this.radioactivity = radioactivity;
    }

	@Override
	public Radioactivity getRadioactivity() {
		// TODO Auto-generated method stub
		return radioactivity;
	}
}

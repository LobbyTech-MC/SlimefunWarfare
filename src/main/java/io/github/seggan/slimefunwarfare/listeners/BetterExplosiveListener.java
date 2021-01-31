package io.github.seggan.slimefunwarfare.listeners;

import io.github.seggan.slimefunwarfare.items.ABetterExplosive;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public class BetterExplosiveListener implements Listener {

    @EventHandler
    public void onExplosiveDispense(BlockDispenseEvent e) {
        if (SlimefunItem.getByItem(e.getItem()) instanceof ABetterExplosive) {
            e.setCancelled(true);
        }
    }
}

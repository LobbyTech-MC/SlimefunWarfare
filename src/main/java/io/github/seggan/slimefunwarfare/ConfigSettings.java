package io.github.seggan.slimefunwarfare;

import lombok.AccessLevel;
import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;

@Getter
public class ConfigSettings {

    @Getter(AccessLevel.NONE)
    private final SlimefunWarfare plugin;

    private int concreteExplodePercent = 10;
    private boolean autoshoot = true;
    private boolean minRangeOn = true;
    private boolean useBulletsFromInv = true;

    private int meteorSpawnRate = 5;
    private int meteorsPerChunk = 1;
    private int segganessonChance = 15;

    ConfigSettings(SlimefunWarfare plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {
        FileConfiguration config = plugin.getConfig();

        setConcreteExplodePercent(config.getInt("explosions.concrete-explode-chance"));
        autoshoot = config.getBoolean("guns.autoshoot");
        setMinRangeOn(config.getBoolean("guns.min-range-on"));
        setUseBulletsFromInv(config.getBoolean("guns.use-bullets-from-inv"));

        meteorSpawnRate = config.getInt("space.meteor-spawn-rate");
        meteorsPerChunk = config.getInt("space.meteors-per-chunk");
        segganessonChance = config.getInt("space.segganesson-chance");
    }

	public boolean isAutoshoot() {
		return autoshoot;
	}

	public int getMeteorsPerChunk() {
		return meteorsPerChunk;
	}

	public double getMeteorSpawnRate() {
		return meteorSpawnRate;
	}

	public double getSegganessonChance() {
		return segganessonChance;
	}

	public int getConcreteExplodePercent() {
		return concreteExplodePercent;
	}

	public void setConcreteExplodePercent(int concreteExplodePercent) {
		this.concreteExplodePercent = concreteExplodePercent;
	}

	public boolean isMinRangeOn() {
		return minRangeOn;
	}

	public void setMinRangeOn(boolean minRangeOn) {
		this.minRangeOn = minRangeOn;
	}

	public boolean isUseBulletsFromInv() {
		return useBulletsFromInv;
	}

	public void setUseBulletsFromInv(boolean useBulletsFromInv) {
		this.useBulletsFromInv = useBulletsFromInv;
	}
}

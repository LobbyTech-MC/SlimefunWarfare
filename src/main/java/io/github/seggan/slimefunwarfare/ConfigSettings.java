package io.github.seggan.slimefunwarfare;

import org.bukkit.configuration.file.FileConfiguration;

import lombok.AccessLevel;
import lombok.Getter;

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

        concreteExplodePercent = config.getInt("explosions.concrete-explode-chance");
        autoshoot = config.getBoolean("guns.autoshoot");
        minRangeOn = config.getBoolean("guns.min-range-on");
        useBulletsFromInv = config.getBoolean("guns.use-bullets-from-inv");

        meteorSpawnRate = config.getInt("space.meteor-spawn-rate");
        setMeteorsPerChunk(config.getInt("space.meteors-per-chunk"));
        segganessonChance = config.getInt("space.segganesson-chance");
    }

	public boolean isAutoshoot() {
		return autoshoot;
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

	public int getMeteorsPerChunk() {
		return meteorsPerChunk;
	}

	public void setMeteorsPerChunk(int meteorsPerChunk) {
		this.meteorsPerChunk = meteorsPerChunk;
	}
}

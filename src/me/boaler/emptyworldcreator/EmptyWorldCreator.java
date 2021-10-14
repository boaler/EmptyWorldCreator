package me.boaler.emptyworldcreator;

import org.bukkit.Bukkit;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class EmptyWorldCreator extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getLogger().info(this.getDescription().getName() + " v" + this.getDescription().getVersion() + " loaded successfully.");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getLogger().info(this.getDescription().getName() + " disabled.");
	}
	
	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
	    return new EmptyWorldChunkGenerator();
	}
}

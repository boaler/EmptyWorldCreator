package me.boaler.emptyworldcreator;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class EmptyWorldChunkGenerator extends ChunkGenerator {
	
	@SuppressWarnings("deprecation")
	@Override
	public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
		ChunkData data = createChunkData(world);

	    //generate empty chunk
	    for(int x = 0; x < 16; x++){
	    	for(int y = 0; y < 16; y++) {
	    		for(int z = 0; z< 16; z++) {
	    			data.setBlock(x, y, z, Material.AIR);
	    		}
	    	}
	    }
	    
	    return data;
	}
}

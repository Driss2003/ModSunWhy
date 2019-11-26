package com.mod.sunwhy.world;

import java.util.Random;

import com.mod.sunwhy.init.BlockMod;
import com.mod.sunwhy.structure.StructureSun;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenTuto implements IWorldGenerator
{
   
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,IChunkProvider chunkProvider) 
	{
	
	

		{
		
		 

			Generatenether(world, chunkX * 16, chunkZ * 16, random);
			GenerateOverworld(world, chunkX * 16, chunkZ * 16, random);
			GenerateEnd(world, chunkX * 16, chunkZ * 16, random);

		}
		
	}

	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
	{
		
		for(int i = 0; i < spawnChance; i++)
		{
			
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
			
			new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, Xpos, Ypos, Zpos);
					
			
		}
		
	}
	
	
	private void addStructure(String string, Random random, World world, int posX, int posZ, int minY, int maxY, int spawnChance)
	{
		for(int i = 0; i < spawnChance; i++)
		{
			
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
			
	}
	}
	private void Generatenether(World world, int i, int j, Random random) 
	{
			
	}

	private void GenerateOverworld(World world, int i, int j, Random random) 
	{
		
		addOre(BlockMod.myleniumore, Blocks.stone, random, world, i, j, 1, 15, 1, 3, 6);
		addOre(BlockMod.sunore, Blocks.stone, random, world, i, j, 1, 15, 1, 3, 5);
		addOre(BlockMod.ruby, Blocks.stone, random, world, i, j, 1, 15, 1, 3, 7);
		addOre(BlockMod.amethyst, Blocks.stone, random, world, i, j, 1, 15, 1, 4, 8);
		addOre(BlockMod.Sunrounge, Blocks.stone, random, world, i, j, 1, 250, 1, 4, 2);

		
		

		
	}
	
	
	private void GenerateBiomeSaphir(World BiomeSaphir2, int i, int j, Random random) 
	{
		
		addOre(BlockMod.myleniumore, Blocks.stone, random, BiomeSaphir2, i, j, 1, 15, 1, 3, 6);

		
		

		
	}

	private void GenerateEnd(World world, int i, int j, Random random) {

		addOre(BlockMod.saphir, Blocks.end_stone, random, world, i, j, 1, 125, 1, 4, 50);
        
	}

	
		
	

}

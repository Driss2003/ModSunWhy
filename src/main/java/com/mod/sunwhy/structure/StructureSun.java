package com.mod.sunwhy.structure;

import com.mod.sunwhy.init.BlockMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class StructureSun {
	public static void init(World world, int x, int y, int z)
	{
		if(world.getBlock(x, y-1, z) == Blocks.grass && world.getBlock(x, y+7, z)== Blocks.air)
	
	{
		
	}

   }
}
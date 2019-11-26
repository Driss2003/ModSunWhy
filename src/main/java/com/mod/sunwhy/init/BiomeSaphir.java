package com.mod.sunwhy.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeSaphir extends BiomeGenBase
{

public BiomeSaphir(int p_i1971_1_) {
		super(p_i1971_1_);
		// TODO Auto-generated constructor stub
		this.topBlock = BlockMod.Sunrounge;
		this.fillerBlock = BlockMod.ruby;
	    this.flowers.add(new FlowerEntry(BlockMod.culturesun, 0, 20));
        this.canSpawnLightningBolt();
        this.waterColorMultiplier = 26111;





	    }
}
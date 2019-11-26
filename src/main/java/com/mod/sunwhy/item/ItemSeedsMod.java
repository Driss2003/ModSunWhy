package com.mod.sunwhy.item;

import java.util.Random;

import com.mod.sunwhy.init.BlockMod;
import com.mod.sunwhy.init.ItemMod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

public class ItemSeedsMod extends ItemSeeds {

	public ItemSeedsMod(Block p_i45352_1_, Block p_i45352_2_) {
		super(p_i45352_1_, p_i45352_2_);
		// TODO Auto-generated constructor stub
	}
	
	protected Item func_149865_P()
    {
        return ItemMod.BlueSeed ;
    }

	
}




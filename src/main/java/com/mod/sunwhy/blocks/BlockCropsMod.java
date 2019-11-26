package com.mod.sunwhy.blocks;

import java.beans.EventSetDescriptor;
import java.util.Random;

import com.mod.sunwhy.init.BlockMod;
import com.mod.sunwhy.init.ItemMod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class BlockCropsMod extends BlockCrops {
	
	
	
	    
	    
	    protected Item func_149866_i()
	    {
	        return ItemMod.BlueSeed;
	    }
	    
	    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
	    {
	        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 100);
	    }

	    public Item getItemDropped(int p_149650_1_, int p_149650_2_, int p_149650_3_,int p_149690_4_,int p_149690_5_,int p_149690_6_,int p_149690_7_)
	    {
	        return p_149650_1_ == 7 ? this.func_149865_P() : this.func_149866_i();
	        
	    }
	    
	    
	    

	    protected Item func_149865_P()
	    {
	        return ItemMod.item_test;
	    }
	    
	   
	      
	    

	    
	    
}


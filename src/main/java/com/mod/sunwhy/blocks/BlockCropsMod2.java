package com.mod.sunwhy.blocks;

import java.util.Random;

import com.mod.sunwhy.init.ItemMod;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockCropsMod2 extends BlockCrops {
	

    
    
    
    
    protected Item func_149866_i()
    {
        return Items.stick;
    }
    
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 0);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return p_149650_1_ == 6 ? this.func_149865_P() : this.func_149866_i();
    }
    
    
    
    protected Item func_149865_P()
    {
        return ItemMod.myleniumIngot;
    }
}
   
   
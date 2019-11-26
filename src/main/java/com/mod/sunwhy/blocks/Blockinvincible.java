package com.mod.sunwhy.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blockinvincible extends Block {
 
    
 
    protected Blockinvincible()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(50.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setResistance(6000000.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName("factionblock");
    }
 
    public int getMobilityFlag()
    {
        return 2;
    }
}
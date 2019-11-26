package com.mod.sunwhy.farmland;


import java.util.Random;

import com.mod.sunwhy.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
 
 

 
public class Farmlandplus extends Block{
 
 
    boolean tilled;
    private IIcon top, bottom, back, front, right, left;
 
    public Farmlandplus(boolean tilled)
    {
 
        super (Material.ground);
 
        this.tilled = tilled;
        this.setTickRandomly(true);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGravel);
 
        if (tilled)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
            this.setLightOpacity(255);
            this.setCreativeTab(null);
            this.useNeighborBrightness = true;
        }
    }
 
 
 

    public String getUnlocalizedName()
    {
        return "tile.fertilizedDirt";
    }
 
 
 
    @Override
    public boolean isOpaqueCube()
    {
        return !tilled;
    }
 
 
 
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        plantable.getPlant(world, x, y + 1, z);
        EnumPlantType plantType = plantable.getPlantType(world, x, y + 1, z);
        switch(plantType) {
            case Desert:
                return !this.tilled;
            case Nether:
                return false;
            case Crop:
                return this.tilled;
            case Cave:
                return !this.tilled;
            case Plains:
                return !this.tilled;
            case Water:
                return true;
            case Beach:
                return !this.tilled;
            default:
                return false;
        }
    }
 
    public void registerBlockIcons(IIconRegister iiconRegister) {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":fertilized_machine");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":fertilized_machine_1");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":fertilized_machine_4");
        this.back = iiconRegister.registerIcon(Reference.MOD_ID + ":fertilized_machine_3");
        this.front = iiconRegister.registerIcon(Reference.MOD_ID + ":fertilized_machine_2");
        this.right = iiconRegister.registerIcon(Reference.MOD_ID + ":fertilized_machine_3");
        this.left = iiconRegister.registerIcon(Reference.MOD_ID + ":fertilized_machine_2");
    }
 
    public IIcon getIcon(int side, int metadata) {
        if (side == 0) {
            return this.bottom;
        } else if (side == 1) {
            return this.top;
        } else if (side == 2) {
            return this.front;
        } else if (side == 3) {
            return this.back;
        } else if (side == 4) {
            return this.left;
        } else if (side == 5) {
            return this.right;
        }
        return this.blockIcon;
    }
 
    @Override
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        if (!world.isRemote)
        {
            Block toBoost = world.getBlock(x,y-1,z);
            if (toBoost != null && toBoost != Blocks.air && toBoost instanceof IPlantable)
            {
                world.playAuxSFX(2005,x,y+1,z, 0);
            }
            for (int i = 0; i < 5; i++)
            {
                toBoost = world.getBlock(x,y+1,z);
                if (toBoost != null && toBoost != Blocks.air && toBoost instanceof IPlantable)
                {
                    toBoost.updateTick(world, x,y+1,z, rand);
                }
            }
        }
    }
 
}
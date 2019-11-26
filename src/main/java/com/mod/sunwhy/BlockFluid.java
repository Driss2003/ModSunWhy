package com.mod.sunwhy;

import com.google.common.io.Resources;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid extends BlockFluidClassic
{

public BlockFluid(Fluid fluid, Material material) {
		super(fluid, material);
		// TODO Auto-generated constructor stub
	}


public boolean canDisplace(IBlockAccess world, int x, int y, int z)
{
    if(world.getBlock(x, y, z).getMaterial().isLiquid())
    {
        return false;
    }
    return super.canDisplace(world, x, y, z);
}

public boolean displaceIfPossible(World world, int x, int y, int z)
{
    if(world.getBlock(x, y, z).getMaterial().isLiquid())
    {
        return false;
    }
    return super.displaceIfPossible(world, x, y, z);
}

public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
{
  if (((entity instanceof EntityLivingBase)) && (!world.isRemote)) {
    ((EntityLivingBase)entity).heal(50F);
    ((EntityLivingBase)entity).isEating();
  }

}
}
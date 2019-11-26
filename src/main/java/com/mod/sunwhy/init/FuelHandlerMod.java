package com.mod.sunwhy.init;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandlerMod implements IFuelHandler 
{

	@Override

	public int getBurnTime (ItemStack fuel)
{
	if(fuel.getItem() == ItemMod.SunCoal )
	{
		return 500;
	}
	return 500;
}
	
}

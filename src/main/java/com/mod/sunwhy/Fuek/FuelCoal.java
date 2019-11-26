package com.mod.sunwhy.Fuek;

import com.mod.sunwhy.init.ItemMod;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelCoal implements IFuelHandler {
	 

	public int getBurnTime(ItemStack fuel) {
	if(fuel.getItem() == ItemMod.SunCoal) {
	return 1000;
	}else {
	return 0;
	}
	 
	}
	 
	}
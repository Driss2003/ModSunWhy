package com.mod.sunwhy.cd;

import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;



import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemRecord;

import com.mod.sunwhy.ModTuto;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class CDRadioactive extends ItemRecord
{
 
protected CDRadioactive(String string)
{
 
super(string);
 
this.setCreativeTab(ModTuto.tabTuto);
setUnlocalizedName(string);
}
@SideOnly(Side.CLIENT)
public String getRecordTitle()
{
return "modMineKingdomHearts - " + this.recordName;
}
@SideOnly(Side.CLIENT)
public void func_94581_a(IIconRegister par1IconRegister)
{
this.itemIcon = par1IconRegister.registerIcon("modminekingdomhearts:cdTensionRising");
}
}
 
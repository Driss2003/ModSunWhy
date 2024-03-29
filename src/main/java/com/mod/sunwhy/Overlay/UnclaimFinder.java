package com.mod.sunwhy.Overlay;

import java.util.List;

import com.mod.sunwhy.ModTuto;
import com.mod.sunwhy.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
 
public class UnclaimFinder extends Item {
    private String[] type = { "chest_radar" };
    private IIcon[] iconArray;
 
    public UnclaimFinder()
      {
        setMaxStackSize(1);
        setCreativeTab(ModTuto.tabTuto);
        setUnlocalizedName("chest_radar");
      }
 
    public void registerIcons(IIconRegister iconregister) {
        this.iconArray = new IIcon[this.type.length];
        for (int i = 0; i < this.type.length; i++) {
            this.iconArray[i] = iconregister.registerIcon("Reference:" + this.type[i]);
            this.iconArray[i] = iconregister.registerIcon(Reference.MOD_ID + ":bite");
        }
    }
 
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item Item, CreativeTabs creativeTabs, List list) {
        for (int metadata = 0; metadata < this.type.length; metadata++) {
            list.add(new ItemStack(Item, 1, metadata));
        }
    }
 
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int metadata) {
        return (metadata < this.type.length) && (metadata >= 0) ? this.iconArray[metadata] : this.iconArray[0];
    }
}
package com.mod.sunwhy.item;

import com.mod.sunwhy.Reference;
import com.mod.sunwhy.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorTutom extends ItemArmor {

	public ItemArmorTutom(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
		
	}
	
	
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	
	if(stack.getItem() == ItemMod.pantalonmylenium)
	{
		
		return Reference.MOD_ID + ":textures/models/armor/armorMod_layer_4.png";
		
	}
	
	
	else if(stack.getItem() == ItemMod.casquemylenium|| stack.getItem() == ItemMod.plastronmylenium || stack.getItem() == ItemMod.botemylenium)
	{
		
		return Reference.MOD_ID + ":textures/models/armor/armorMod_layer_3.png";
		
	}
	return null;
	
}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	  {
	  
	    player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 660, 0));
		  }
	
}


	
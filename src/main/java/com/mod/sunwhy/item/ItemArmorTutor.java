package com.mod.sunwhy.item;

import com.mod.sunwhy.Reference;
import com.mod.sunwhy.init.ItemMod;

import ibxm.Player;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemArmorTutor extends ItemArmor {

	public ItemArmorTutor(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
		
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		
		
		if(stack.getItem() == ItemMod.rp)
		{
			
			return Reference.MOD_ID + ":textures/models/armor/mMod_layer_6.png";
			
		}
		
		
		else if(stack.getItem() == ItemMod.rc|| stack.getItem() == ItemMod.rpl || stack.getItem() == ItemMod.rb)
		{
			
			return Reference.MOD_ID + ":textures/models/armor/mMod_layer_5.png";
			
		}
		
		
		
		
		
		return null;
	}
		
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
		  {
		  
		    player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 660, 0));
	 		  }
		
	}


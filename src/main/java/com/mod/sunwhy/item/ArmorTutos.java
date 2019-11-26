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

public class ArmorTutos extends ItemArmor {

	public ArmorTutos(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
		
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		
		
		if(stack.getItem() == ItemMod.sp)
		{
			
			return Reference.MOD_ID + ":textures/models/armor/armorMod_layer_10.png";
			
		}
		
		
		else if(stack.getItem() == ItemMod.sc|| stack.getItem() == ItemMod.spl || stack.getItem() == ItemMod.sb)
		{
			
			return Reference.MOD_ID + ":textures/models/armor/armorMod_layer_9.png";
			
		}
		
	
		return null;
	}
		
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)

		  {
		  
		    player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 660, 0));
		    player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 660, 0));
		    		  }
		
	}


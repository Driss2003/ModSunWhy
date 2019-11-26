package com.mod.sunwhy.item;




import com.mod.sunwhy.GuiJobs.jobHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ItemSwordTuto extends ItemSword {

	public ItemSwordTuto(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

		
		@Override
	    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
		{
		if (!world.isRemote)
		{
	    jobHandler metier = jobHandler.get(player);
		ChatComponentTranslation comp = new ChatComponentTranslation("tu as " + metier.money +" XP");
		player.addChatComponentMessage(comp);
		}
		return itemstack;
		}
	}


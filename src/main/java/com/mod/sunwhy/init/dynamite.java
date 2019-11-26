package com.mod.sunwhy.init;

import com.mod.sunwhy.dynamite.EntityDynamite;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class dynamite extends Item
{
    private int setMaxDamage;
	public dynamite()
    {

        this.maxStackSize = 16;

    }
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
        	stack.stackSize--;
        }
 
        world.playSoundAtEntity(player, "random.bow", 2.5F, 2.8F / (itemRand.nextFloat() * 0.4F + 0.8F));
 
        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new EntityDynamite(world, player));
        }
 
        return stack;
    }
	@SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering() 
    {
        return true;
    }
 
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() 
    {
        return true;
    }
}



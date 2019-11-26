package com.mod.sunwhy.dynamite;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
 
public class dynamitesun extends Item
{
    public dynamitesun()
    {
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            stack.stackSize--;
        }
 
        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.8F / (itemRand.nextFloat() * 0.4F + 0.8F));
 
        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new EntityDynamite(world, player));
        }
 
        return stack;
    }
}
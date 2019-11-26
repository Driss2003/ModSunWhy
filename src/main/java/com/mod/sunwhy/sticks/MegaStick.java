package com.mod.sunwhy.sticks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
 
public class MegaStick extends Item
{
 
public MegaStick()
{
this.setMaxDamage(4);
this.setMaxStackSize(1);
}
 
@Override
public void onUpdate(ItemStack item, World world, Entity player, int slotIndex, boolean inHand)
{
if(item.hasTagCompound())//Si ton item n'a pas de tag alors on ne fait rien
{
if(item.stackTagCompound.getInteger("timer") > 0)//si ton timer est supérieur à 0 (après un clic droit logiquement)
{
item.stackTagCompound.setInteger("timer", (int) (item.stackTagCompound.getInteger("timer") + 1));//On l'incrémente de 1 à chaque tick
}
if(item.stackTagCompound.getInteger("timer") >= (int) (45))//Remplace 6 par le nombre de secondes du timer souhaité
{
item.stackTagCompound.setInteger("timer", 0);//On remet à 0 si le timer est arrivé à la limite souhaitée
}
}
super.onUpdate(item, world, player, slotIndex, inHand);
}
 
public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
{
if(!item.hasTagCompound())
{
item.setTagCompound(new NBTTagCompound());
item.stackTagCompound.setInteger("timer", 0);
}
if(item.stackTagCompound.getInteger("timer") == 0)
{
player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.jump.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.resistance.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 400, 5));
player.addPotionEffect(new PotionEffect(Potion.heal.id, 400, 5));
item.damageItem(1, player);

item.stackTagCompound.setInteger("timer", 1);
}
else
{
if(world.isRemote)
player.addChatComponentMessage(new ChatComponentTranslation("En Chargement..."));
}
return item;
}
 
@SideOnly(Side.CLIENT)
public boolean hasEffect(ItemStack item)
{
return true;
}
}
 
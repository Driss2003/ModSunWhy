package com.mod.sunwhy.item;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;










import java.util.List;
import java.util.Set;
 
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
 
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
 
public class ItemHammer extends ItemPickaxe
{
    
    public ItemHammer(ToolMaterial p_i45347_1_)
    {
        super(p_i45347_1_);
        // TODO Auto-generated constructor stub
    }
 
 
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
        if(entity instanceof EntityPlayer) {
 
        EntityPlayer player = (EntityPlayer)entity;
        stack.damageItem(1, entity);
 
        Vec3 lookVec = player.getLookVec();
        double xLook = Math.abs(lookVec.xCoord);
        double yLook = Math.abs(lookVec.yCoord);
        double zLook = Math.abs(lookVec.zCoord);
        
 
 
        double max = Math.max(xLook, Math.max(yLook, zLook));
 
 
 
        int addX = 1;
        int addY = 1;
        int addZ = 1;
 
        if(max == xLook) {
        y -= 2;
        z -= 2;
        addX = 5;
        } else if(max == yLook) {
        x -= 2;
        z -= 2;
        addY = 5;
        } else if(max == zLook) {
        x -= 2;
        y -= 2;
        addZ = 5;
        }
 
        for(int xOffset = 0; xOffset < 5; xOffset += addX) {
        for(int yOffset = 0; yOffset < 5; yOffset += addY) {
        for(int zOffset = 0; zOffset < 5; zOffset += addZ) {
 
        Block currentBlock = world.getBlock(x + xOffset, y + yOffset, z + zOffset);
        int blockMetadata = world.getBlockMetadata(x + xOffset, y + yOffset, z + zOffset);
 
        BreakEvent event = new BreakEvent(x + xOffset, y + yOffset, x + zOffset, world, currentBlock, blockMetadata, (EntityPlayer)player);
        event.setCanceled(!player.capabilities.isCreativeMode);
 
        if(currentBlock.getBlockHardness(world, x + xOffset, y + yOffset, z + zOffset) <= 4.0F && currentBlock.getBlockHardness(world, x + xOffset, y + yOffset, z + zOffset)  >= 0F) {
            event.setCanceled(false);
    
        }
 
        MinecraftForge.EVENT_BUS.post(event);
 
        if(!event.isCanceled()) {
        currentBlock.harvestBlock(world, (EntityPlayer)player, x + xOffset, y + yOffset, z + zOffset, blockMetadata);
        world.setBlockToAir(x + xOffset, y + yOffset, z + zOffset);
 
        boolean hasSilk = EnchantmentHelper.getSilkTouchModifier(player);
        boolean canSilk = currentBlock.canSilkHarvest(world, (EntityPlayer)player, x + xOffset, y + yOffset, z + zOffset, blockMetadata);
        if(ForgeHooks.canHarvestBlock(currentBlock, (EntityPlayer)player, blockMetadata) && (!hasSilk || hasSilk && !canSilk)) {
 
        int exp = currentBlock.getExpDrop(world, blockMetadata, EnchantmentHelper.getFortuneModifier(player));
        currentBlock.dropXpOnBlockBreak(world, x + xOffset, y + yOffset, z + zOffset, exp);
        }
        }
        }
        }
        }
        return true;
        }
        return false;
        }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
    {
    par2List.add("\u00A73" + "> Ce marteau creuse en 5x5x2:");
    }
   
 
    
 
}
 
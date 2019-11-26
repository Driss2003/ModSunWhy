package com.mod.sunwhy.init;

import com.mod.sunwhy.ModTuto;
import com.mod.sunwhy.Reference;
import com.mod.sunwhy.blocks.BlockBasic;
import com.mod.sunwhy.blocks.BlockCropsMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;


public class BlockMod 
{

	public static Block block_test,antimob,saphir,sunore,blockinv, myleniumore, myleniumblock, caveblock,Sunrounge,ruby,amethyst, culturesun;
	public static void init()
	{
		
		block_test = new BlockBasic(Material.rock).setCreativeTab(ModTuto.tabTuto).setBlockName("block_test").setBlockTextureName(Reference.MOD_ID + ":block_test").setHardness(14.0F).setResistance(14.0F);
		myleniumore = new BlockBasic(Material.iron).setCreativeTab(ModTuto.tabTuto).setBlockName("myleniumore").setBlockTextureName(Reference.MOD_ID + ":myleniumore").setHardness(14.0F).setResistance(8.0F);
		myleniumblock = new BlockBasic(Material.wood).setCreativeTab(ModTuto.tabTuto).setBlockName("myleniumblock").setBlockTextureName(Reference.MOD_ID + ":myleniumblock").setHardness(14.0F).setResistance(10.0F);
		caveblock = new BlockBasic(Material.glass).setCreativeTab(ModTuto.tabTuto).setBlockName("caveblock").setBlockTextureName(Reference.MOD_ID + ":caveblock").setHardness(4.0F).setResistance(5.0F);

		saphir = new BlockBasic(Material.iron).setCreativeTab(ModTuto.tabTuto).setBlockName("saphir").setBlockTextureName(Reference.MOD_ID + ":saphir").setHardness(10.0F).setResistance(10.0F);
		culturesun = new BlockCropsMod().setCreativeTab(ModTuto.tabTuto).setBlockName("culturesun").setBlockTextureName(Reference.MOD_ID + ":culturesun");



		
		sunore = new BlockBasic(Material.iron).setCreativeTab(ModTuto.tabTuto).setBlockName("sunore").setBlockTextureName(Reference.MOD_ID + ":sunore").setHardness(10.0F).setResistance(10.0F);

		
		Sunrounge = new BlockBasic(Material.iron).setCreativeTab(ModTuto.tabTuto).setBlockName("sunrouge").setBlockTextureName(Reference.MOD_ID + ":sunrouge").setHardness(1.0F).setResistance(1.0F);

		blockinv = new BlockBasic(Material.iron).setCreativeTab(ModTuto.tabTuto).setBlockName("blockinv").setBlockTextureName(Reference.MOD_ID + ":blockinv").setResistance(100000000000.0F).setHardness(1000.0F).setBlockUnbreakable();

		
		ruby = new BlockBasic(Material.iron).setCreativeTab(ModTuto.tabTuto).setBlockName("ruby").setBlockTextureName(Reference.MOD_ID + ":ruby").setHardness(5.0F).setResistance(10.0F);


		amethyst = new BlockBasic(Material.iron).setCreativeTab(ModTuto.tabTuto).setBlockName("amethyst").setBlockTextureName(Reference.MOD_ID + ":amethyst").setHardness(4.0F).setResistance(10.0F);


		
	}

	public static void register()
	{
		
		
		
		
		


		GameRegistry.registerBlock(amethyst, amethyst.getUnlocalizedName().substring(5));	
		GameRegistry.registerBlock(ruby, ruby.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(myleniumore, myleniumore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(saphir, saphir.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sunore, sunore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Sunrounge, Sunrounge.getUnlocalizedName().substring(5));
		//Blocs D'amethyst manquant
		//Blocs De Ruby manquant
		GameRegistry.registerBlock(myleniumblock, myleniumblock.getUnlocalizedName().substring(5));		
		GameRegistry.registerBlock(block_test, block_test.getUnlocalizedName().substring(5));	
		GameRegistry.registerBlock(blockinv, blockinv.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(caveblock, caveblock.getUnlocalizedName().substring(5));
		
		
		
		

		
		
		
			
			
		

	
	}

}


package com.mod.sunwhy.init;


import com.mod.sunwhy.ModTuto;
import com.mod.sunwhy.Reference;
import com.mod.sunwhy.Overlay.UnclaimFinder;
import com.mod.sunwhy.dynamite.dynamitesun;
import com.mod.sunwhy.item.ArmorTutos;
import com.mod.sunwhy.item.ItemArmorTuto;
import com.mod.sunwhy.item.ItemArmorTutoa;
import com.mod.sunwhy.item.ItemArmorTutom;
import com.mod.sunwhy.item.ItemArmorTutor;
import com.mod.sunwhy.item.ItemHammer;
import com.mod.sunwhy.item.ItemMiniHammer;
import com.mod.sunwhy.item.ItemPickaxeTuto;
import com.mod.sunwhy.item.ItemSeedsMod;
import com.mod.sunwhy.item.ItemSwordTuto;
import com.mod.sunwhy.sticks.MegaStick;
import com.sun.org.apache.bcel.internal.classfile.Field;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod 
{
	public static ToolMaterial addToolMaterial(String name, Integer a, Integer durability, Integer enchantments, Integer enhancements, Integer damages) {
		return EnumHelper.addToolMaterial(name, a, durability, enchantments, enhancements, damages);
	}
	
	public static ToolMaterial toolTuto = ItemMod.addToolMaterial("ToolTuto", 15, 4800, 35, 24, 40);
	public static ToolMaterial Mylenium = EnumHelper.addToolMaterial("Mylenium", 15, 3600, 22, 10, 22);
	public static ToolMaterial a = EnumHelper.addToolMaterial("a", 12, 1600, 15, 10, 15);
	public static ToolMaterial Sunrouge = EnumHelper.addToolMaterial("a", 20, 10000, 55, 35, 50);
	public static ToolMaterial r = EnumHelper.addToolMaterial("r", 14, 2800, 20, 10, 20);
	public static ToolMaterial h = EnumHelper.addToolMaterial("h", 2, 2800, 2, 20, 90);
	public static ToolMaterial axes = EnumHelper.addToolMaterial("axes", 20, 4800, 45, 18, 35);
	public static ToolMaterial axesr = EnumHelper.addToolMaterial("axesr", 25, 10000, 65, 4500, 99);
	
	public static ArmorMaterial SunrougeA = EnumHelper.addArmorMaterial("armorTutosun", 10000, new int[] {8, 8, 8, 8}, 10);
	public static ArmorMaterial armorTuto = EnumHelper.addArmorMaterial("armorTuto", 4800, new int[] {7, 7, 7, 7}, 9);
	public static ArmorMaterial armormylenium = EnumHelper.addArmorMaterial("armormylenium", 3600, new int[] {6, 6, 6, 6}, 8);
	public static ArmorMaterial armorTutor  = EnumHelper.addArmorMaterial("armorTutor", 2800, new int[] {5, 5, 5, 5}, 7);
	public static ArmorMaterial armorTutoa = EnumHelper.addArmorMaterial("armorTutoa", 2200, new int[] {4, 4, 4, 4}, 6);


	
	
	
	
	public static Item item_test,incdyna,MegaStick,unclaimF,lol,ss,spick,SunCoal,axesun,axesunr,hammer,si,sc,spl,sp,sb,BlueSeed,ai,re,as,ri,rpickaxe,apickaxe,minihammer,seedm,MultiTool,rc,rpl,rp,rb,ac,ab,apl,ap, myleniumIngot,myleniumSword, item_Sword,casquemylenium,ingottest , plastronmylenium, pantalonmylenium, botemylenium,  myleniumpickaxe, item_pickaxe, casqueArmor, plastronArmor, seedTuto, pantalon_Armor,  boteArmor;
	public static void init()
	{	
		
		
		
		//Items Amethyst
		apickaxe = new ItemPickaxeTuto(ItemMod.a).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":api").setUnlocalizedName("api");
		
		as = new ItemSwordTuto(ItemMod.a).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":as").setUnlocalizedName("as");
		
		ai = new Item().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("ai").setTextureName(Reference.MOD_ID + ":ai");
	    
		ac = new ItemArmorTutoa(armorTutoa, 0).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":ac").setUnlocalizedName("ac");
	    
		apl = new ItemArmorTutoa(armorTutoa, 1).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":apl").setUnlocalizedName("apl");
	    
		ap = new ItemArmorTutoa(armorTutoa, 2).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":ap").setUnlocalizedName("ap");
	    
		ab = new ItemArmorTutoa(armorTutoa, 3).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":ab").setUnlocalizedName("ab");	

		//Items Ruby
	    rpickaxe = new ItemPickaxeTuto(ItemMod.r).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":pr").setUnlocalizedName("pr");
		
	    re = new ItemSwordTuto(ItemMod.r).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":re").setUnlocalizedName("re");
	    
	    ri = new Item().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("ri").setTextureName(Reference.MOD_ID + ":ri");
	   
	    rc = new ItemArmorTutor(armorTutor, 0).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":rc").setUnlocalizedName("rc");
	    
	    rpl = new ItemArmorTutor(armorTutor, 1).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":ar").setUnlocalizedName("rpl");
	    
	    rp = new ItemArmorTutor(armorTutor, 2).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":rp").setUnlocalizedName("rp");
	    
	    rb = new ItemArmorTutor(armorTutor, 3).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":rb").setUnlocalizedName("rb");

		//Items Mylenium
		
		
	    myleniumIngot = new Item().setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":mylenium_ingot").setUnlocalizedName("mylenium_ingot");
	    
	    myleniumSword = new ItemSwordTuto(ItemMod.Mylenium).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":mylenium_sword").setUnlocalizedName("mylenium_sword");
	    
	    myleniumpickaxe = new ItemPickaxeTuto(ItemMod.Mylenium).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":mylenium_pickaxe").setUnlocalizedName("mylenium_pickaxe");	    
	    
	    minihammer = new ItemMiniHammer(ItemMod.a).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":minihammer").setUnlocalizedName("minihammer");
	    
	    casquemylenium = new ItemArmorTutom(armormylenium, 0).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":myleniumcasque").setUnlocalizedName("myleniumcasque");
	    
	    plastronmylenium = new ItemArmorTutom(armormylenium, 1).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":myleniumplastron").setUnlocalizedName("myleniumplastron");
	    
	    pantalonmylenium = new ItemArmorTutom(armormylenium, 2).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":myleniumpantalon").setUnlocalizedName("myleniumpantalon");
	    
	    botemylenium = new ItemArmorTutom(armormylenium, 3).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":myleniumbote").setUnlocalizedName("myleniumbote");

	    //Item Sun
	    
	   	item_test = new Item().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("item_test").setTextureName(Reference.MOD_ID + ":item_test").setUnlocalizedName("item_test");
	    
	   	item_Sword = new ItemSwordTuto(ItemMod.toolTuto).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":item_sword").setUnlocalizedName("item_sword");
	    
	   	axesun = new ItemSwordTuto(ItemMod.axes).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":sunaxec").setUnlocalizedName("sunaxec");
	    
	   	seedTuto = new ItemSeedsMod(BlockMod.culturesun, Blocks.stone).setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("seedTuto").setTextureName(Reference.MOD_ID + ":seedTuto");	
	    
	   	casqueArmor = new ItemArmorTuto(armorTuto, 0).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":item_casque").setUnlocalizedName("item_casque");
	    
	   	plastronArmor = new ItemArmorTuto(armorTuto, 1).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":item_plastron").setUnlocalizedName("item_plastron");
	    
	   	pantalon_Armor = new ItemArmorTuto(armorTuto, 2).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":item_pantalon").setUnlocalizedName("item_pantalon");
	    
	   	boteArmor = new ItemArmorTuto(armorTuto, 3).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":item_bote").setUnlocalizedName("item_bote");	    
 	    
	   	ingottest = new Item().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("ingottest").setTextureName(Reference.MOD_ID + ":test_ingot");

	    hammer = new ItemHammer(ItemMod.h).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":hammer").setUnlocalizedName("hammer");

	    
	    
	    //Item SunRouge
	    spick = new ItemPickaxeTuto(ItemMod.Sunrouge).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":spick").setUnlocalizedName("spick");
	    
	    ss = new ItemSwordTuto(ItemMod.Sunrouge).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":ss").setUnlocalizedName("ss");	    
 	    
	    si = new Item().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("si").setTextureName(Reference.MOD_ID + ":si");
	    
	    sc =new ArmorTutos(SunrougeA, 0).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":sc").setUnlocalizedName("sc");
	    
	    spl = new ArmorTutos(SunrougeA, 1).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":spl").setUnlocalizedName("spl");
	    
	    sp = new ArmorTutos(SunrougeA, 2).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":sp").setUnlocalizedName("sp");
	    
	    sb = new ArmorTutos(SunrougeA, 3).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":sb").setUnlocalizedName("sb");	    
	
	    axesunr = new ItemSwordTuto(ItemMod.axesr).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":sunraxec").setUnlocalizedName("sunraxec");

	    
	    MegaStick = new MegaStick().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("megastick").setTextureName(Reference.MOD_ID + ":megastick");
//	    initItem(Megastic, new MegaStick(), "megastick")
	    unclaimF = new UnclaimFinder().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("radar").setTextureName(Reference.MOD_ID + ":bite");	   
	    lol = new dynamite().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("dynamite").setTextureName(Reference.MOD_ID + ":Dynamite");
	    incdyna = new dynamitesun().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("incdynamite").setTextureName(Reference.MOD_ID + ":incDynamite");   
	    item_pickaxe = new ItemPickaxeTuto(ItemMod.toolTuto).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":item_pickaxe").setUnlocalizedName("item_pickaxe");
	    casquemylenium = new ItemArmorTutom(armormylenium, 0).setCreativeTab(ModTuto.tabTuto).setTextureName(Reference.MOD_ID + ":myleniumcasque").setUnlocalizedName("myleniumcasque");
	    BlueSeed = new Item().setCreativeTab(ModTuto.tabTuto).setUnlocalizedName("BlueSeed").setTextureName(Reference.MOD_ID + ":blueSeed").setUnlocalizedName("blueSeed");    	
	   	}
	
	// public static void initItem(self , String fieldName, Item itemInstance, String itemName)
///	{
//		Field field = self.class.getDeclaredField(fieldName);
//		field.set(itemInstance.setCreativeTab(ModTuto.tabTuto).setUnlocalizedName(itemName).setTextureName(Reference.MOD_ID + ":" + itemName));
//	}
	
	public static void register()
	
	
	{
		
		//Lingot
		GameRegistry.registerItem(item_test, "item_test");
		GameRegistry.registerItem(ai, "ai");
		GameRegistry.registerItem(ri, "ri");
		GameRegistry.registerItem(myleniumIngot, "myleniumIngot");
		GameRegistry.registerItem(ingottest, "ingottest");
		GameRegistry.registerItem(si, "si");
		
		
		//Amethyste
		GameRegistry.registerItem(ac, "ac");
	    GameRegistry.registerItem(apl, "apl");
	    GameRegistry.registerItem(ap, "ap");
	    GameRegistry.registerItem(ab, "ab");
		GameRegistry.registerItem(apickaxe, "apickaxe");
		GameRegistry.registerItem(as, "as");
		
		//RUBY
	    GameRegistry.registerItem(rc, "rc");
	    GameRegistry.registerItem(rpl, "rpl");
	    GameRegistry.registerItem(rp, "rp");
	    GameRegistry.registerItem(rb, "rb");
		GameRegistry.registerItem(re, "re");

	    
	    
	    
	    //Mylenium
	    GameRegistry.registerItem(casquemylenium, "casquemylenium");
		GameRegistry.registerItem(plastronmylenium, "plastronmylenium");
		GameRegistry.registerItem(pantalonmylenium, "pantalonmylenium");
		GameRegistry.registerItem(botemylenium, "botemylenium");
		GameRegistry.registerItem(myleniumSword, " myleniumSword");
		GameRegistry.registerItem(myleniumpickaxe, "myleniumpickaxe");
		GameRegistry.registerItem(minihammer, "minihammer");
	    
	    
	    
	    
	    
	    //SUN
		GameRegistry.registerItem(casqueArmor, "casqueArmor");
		GameRegistry.registerItem(plastronArmor,"plastronArmor");
		GameRegistry.registerItem(pantalon_Armor,"pantalon_Armor");
		GameRegistry.registerItem(boteArmor,"boteArmor");
		GameRegistry.registerItem(item_pickaxe, "item_pickaxe");
		GameRegistry.registerItem(item_Sword, "item_Sword");
		GameRegistry.registerItem(hammer, "hammer");
		GameRegistry.registerItem(axesun, "axesun");
		GameRegistry.registerItem(BlueSeed, "BlueSeed");	
	    
	    
	    //SunRouge

	    GameRegistry.registerItem(si, "si");
	    GameRegistry.registerItem(sc, "sc");
	    GameRegistry.registerItem(spl, "spl");
	    GameRegistry.registerItem(sp, "sp");
	    GameRegistry.registerItem(sb, "sb");
		GameRegistry.registerItem(spick, "spick");
		GameRegistry.registerItem(ss, "ss");
		GameRegistry.registerItem(axesunr, "axesunr");
		
		
		
		
		
		//Items Bordel
		

		GameRegistry.registerItem(unclaimF, "unclaimF");
		GameRegistry.registerItem(MegaStick, "MegaStick");
		GameRegistry.registerItem(lol, "lol");
		GameRegistry.registerItem(incdyna, "incdyna");
		GameRegistry.registerItem(seedTuto, "seedTuto");
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.casqueArmor, 1), new Object[] {"aaa", "a0a", "000", 'a', ItemMod.ingottest});
		GameRegistry.addRecipe(new ItemStack(ItemMod.lol, 1), new Object[] {"nnn", "gag", "nnn", 'a', ItemMod.item_test, 'n', Items.gunpowder, 'g', Blocks.tnt});
		GameRegistry.addRecipe(new ItemStack(ItemMod.lol, 1), new Object[] {"nnn", "gag", "nnn", 'a', ItemMod.item_test, 'n', Items.flint_and_steel, 'g', Blocks.tnt});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plastronArmor, 1), new Object[] {"c0c", "ccc", "ccc", 'c', ItemMod.ingottest});
		GameRegistry.addRecipe(new ItemStack(ItemMod.pantalon_Armor, 1), new Object[] {"eee", "e0e", "e0e", 'e', ItemMod.ingottest});
		GameRegistry.addRecipe(new ItemStack(ItemMod.item_pickaxe, 1), new Object[] {"mmm", "0n0", "0n0", 'm', ItemMod.ingottest, 'n', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.item_Sword, 1), new Object[] {"0k0", "0k0", "0n0", 'k', ItemMod.ingottest, '1', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.boteArmor, 1), new Object[] {"000", "j0j", "j0j", 'j', ItemMod.ingottest});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ingottest, 1), new Object[] {"rrr", "rrr", "rrr", 'r', ItemMod.item_test});
		GameRegistry.addRecipe(new ItemStack(ItemMod.hammer, 1), new Object[] {"ppp", "ppp", "020", 'p', ItemMod.ingottest, '2', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.minihammer, 1), new Object[] {"666", "666", "030", '6', ItemMod.myleniumIngot, '3', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.rc, 1), new Object[] {"aaa", "a0a", "000", 'a', ItemMod.ri});
		GameRegistry.addRecipe(new ItemStack(ItemMod.rpl, 1), new Object[] {"u0u", "uuu", "uuu", 'u', ItemMod.ri});
		GameRegistry.addRecipe(new ItemStack(ItemMod.rp, 1), new Object[] {"iii", "i0i", "i0i", 'i', ItemMod.ri});
		GameRegistry.addRecipe(new ItemStack(ItemMod.rb, 1), new Object[] {"000", "808", "808", '8', ItemMod.ri});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ac, 1), new Object[] {"qqq", "q0q", "000", 'q', ItemMod.ai});
		GameRegistry.addRecipe(new ItemStack(ItemMod.apl, 1), new Object[] {"w0w", "www", "www", 'w', ItemMod.ai});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ap, 1), new Object[] {"bbb", "b0b", "b0b", 'b', ItemMod.ai});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ab, 1), new Object[] {"000", "202", "202", '2', ItemMod.ai});
		GameRegistry.addRecipe(new ItemStack(ItemMod.axesun, 1), new Object[] {"220", "210", "010", '2', ItemMod.ingottest, '1', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.axesunr, 1), new Object[] {"220", "210", "010", '2', ItemMod.si, '1', Items.stick});		
		GameRegistry.addRecipe(new ItemStack(ItemMod.sc, 1), new Object[] {"qqq", "q0q", "000", 'q', ItemMod.si});
		GameRegistry.addRecipe(new ItemStack(ItemMod.spl, 1), new Object[] {"w0w", "www", "www", 'w', ItemMod.si});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sp, 1), new Object[] {"bbb", "b0b", "b0b", 'b', ItemMod.si});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sb, 1), new Object[] {"000", "202", "202", '2', ItemMod.si});
		GameRegistry.addRecipe(new ItemStack(ItemMod.myleniumSword, 1), new Object[] {"010", "010", "070", '1', ItemMod.myleniumIngot, '7', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.myleniumpickaxe, 1), new Object[] {"222", "080", "080", '2', ItemMod.myleniumIngot, '8', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(ItemMod.rpickaxe, 1), new Object[] {"vvv", "0n0", "0n0", 'v', ItemMod.ri, 'n', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.apickaxe, 1), new Object[] {"jjj", "0n0", "0n0", 'j', ItemMod.ai, 'n', Items.stick});		
		GameRegistry.addRecipe(new ItemStack(ItemMod.re, 1), new Object[] {"0t0", "0t0", "0n0", 't', ItemMod.ri, 'n', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.as, 1), new Object[] {"0T0", "0T0", "0n0", 'T', ItemMod.ai, 'n', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.casquemylenium, 1), new Object[] {"333", "303", "000", '3', ItemMod.myleniumIngot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plastronmylenium, 1), new Object[] {"404", "444", "444", '4', ItemMod.myleniumIngot, 'n', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.pantalonmylenium, 1), new Object[] {"555", "505", "505", '5', ItemMod.myleniumIngot, 'e', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.botemylenium, 1), new Object[] {"000", "606", "606", '6', ItemMod.myleniumIngot, 'z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ingottest, 9), new Object[] {"000", "070", "000", '7', BlockMod.block_test});
		GameRegistry.addRecipe(new ItemStack(ItemMod.myleniumIngot, 9), new Object[] {"000", "080", "000", '8', BlockMod.myleniumblock});

		
		
	}
}

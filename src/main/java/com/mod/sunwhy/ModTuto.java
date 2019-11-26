package com.mod.sunwhy;

import org.lwjgl.opengl.Display;

import com.mod.sunwhy.Fuek.FuelCoal;
import com.mod.sunwhy.GuiJobs.Guijobs;
import com.mod.sunwhy.Overlay.F3Event;
import com.mod.sunwhy.dynamite.EntityDynamite;
import com.mod.sunwhy.dynamite.entitydynamitesun;
import com.mod.sunwhy.init.BlockMod;
import com.mod.sunwhy.init.EventsMod;
import com.mod.sunwhy.init.FuelHandlerMod;
import com.mod.sunwhy.init.ItemMod;
import com.mod.sunwhy.item.ItemBucketPoison;
import com.mod.sunwhy.proxy.CommonProxy;
import com.mod.sunwhy.world.WorldRegister;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetworkSystem;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION )



public class ModTuto 
{

	@Instance(Reference.MOD_ID)
	public static ModTuto instance;
	public static Main instance1 = new Main();
	public static Block poisenouswaterb;
	public static Fluid poison;
	public static Item poisonbucket;
	public static BiomeGenBase SaphirBiome;
	public static Block machineTuto;
	  	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;

	public static NetworkSystem network1;
	public static SimpleNetworkWrapper network21;

	public static Block block;
	
	public static CreativeTabs tabTuto = new CreativeTabs ("tabTuto")
			{
		       @SideOnly(Side.CLIENT)
		       public Item getTabIconItem()
		       {
		    	   return Item.getItemFromBlock(BlockMod.block_test);
		       }
		
		
			};
			
		
		
			
	public static Object network2;

	public static BiomeGenBase BiomeSaphir2;
	public static Object d;

		

	
    @EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

    	WorldRegister.mainRegistry();
    	BlockMod.init();	
    	BlockMod.register();
    	ItemMod.init();
    	ItemMod.register();
    	EventsMod.init();
    	

    	poison = new Fluid("poison").setDensity(4000).setViscosity(500).setTemperature(286).setLuminosity(10).setUnlocalizedName("poison"); //on cree notre fluid que l'on nomme poison
        FluidRegistry.registerFluid(poison); // on register notre fluid
        poison = FluidRegistry.getFluid("poison");
        poisenouswaterb = new BlockFluid(poison, Material.water).setBlockTextureName(Reference.MOD_ID + ":poison"); // on crée notre block
		GameRegistry.registerBlock(poisenouswaterb, poisenouswaterb.getUnlocalizedName().substring(5)); //puis on le register
        poisonbucket = new ItemBucketPoison(ModTuto.poisenouswaterb).setUnlocalizedName("poisonbucket").setCreativeTab(ModTuto.tabTuto).setContainerItem(Items.bucket).setTextureName(Reference.MOD_ID + ":poisonbucket"); //on definit notre sceau de poison
        GameRegistry.registerItem(poisonbucket , "poisonbucket "); // on register l'item
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("poison", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(Items.bucket), FluidContainerRegistry.EMPTY_BUCKET);  	    	
    	proxy.registerRender();


    	

    	
    	
    	
    	
    	
    	
	}

	
   
    
    @EventHandler
   	public void Init(FMLInitializationEvent event)
   	{
    	Display.setTitle("SunWhy Launcher");


    	
    	
    	
    	
    	
    	


        MinecraftForge.EVENT_BUS.register(new F3Event());
        MinecraftForge.EVENT_BUS.register(this);

    	GameRegistry.registerFuelHandler(new FuelCoal());

    	EntityRegistry.registerModEntity(EntityDynamite.class, "EntityDynamite", 420, ModTuto.instance, 32, 20, false);
    	EntityRegistry.registerModEntity(entitydynamitesun.class, "entitydynamitesun", 420, ModTuto.instance, 32, 20, false);
    	proxy.registerRender();
    	
    	GameRegistry.registerFuelHandler(new FuelHandlerMod());
   	}
    
    private static void initialise(String string) {
		// TODO Auto-generated method stub
		
	}




	@EventHandler
   	public void postInit(FMLPostInitializationEvent event)
   	{




   	

	    proxy.postInit(event);
	    System.out.println("postInit");
	    proxy.registerRender();
    	MinecraftForge.EVENT_BUS.register(this);

   	}
    @EventHandler
    public void Load(FMLInitializationEvent event)
    {
        proxy.registerOverlay();
    }
    
    @SubscribeEvent
    public void onBucketFill(FillBucketEvent event)
    {
        Block id = event.world.getBlock(event.target.blockX, event.target.blockY, event.target.blockZ);
        int metadata = event.world.getBlockMetadata(event.target.blockX, event.target.blockY, event.target.blockZ);
        if(id == this.poisenouswaterb && metadata == 0)
        {
            event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
            if (!event.world.isRemote){
            	event.entityPlayer.inventory.consumeInventoryItem(Items.bucket);
                EntityItem itemsc = new EntityItem(event.world, event.entityPlayer.posX, event.entityPlayer.posY, event.entityPlayer.posZ, new ItemStack(this.poisonbucket, 1));
                event.world.spawnEntityInWorld(itemsc);
            }
        }
    }
}



	
	
   


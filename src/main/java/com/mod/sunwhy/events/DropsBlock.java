package com.mod.sunwhy.events;

import java.util.ArrayList;
import java.util.Random;

import com.mod.sunwhy.init.BlockMod;
import com.mod.sunwhy.init.ItemMod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class DropsBlock
{
  
      
      
 
    
 
      @SubscribeEvent
      public void onDrops(BlockEvent.HarvestDropsEvent event)
      {
      if(event.block == BlockMod.sunore)
    	  
      {
    	  
    	  
      	    int rand = new Random().nextInt(1);
              if(rand == 0){
            	  event.drops.clear();
  		    event.drops.add(new ItemStack(ItemMod.item_test, 1));
  		    
  		    event.dropChance = 0.03F;
              }
      }
  		 
      }

      
  		    
      @SubscribeEvent
      public void onDrops2(BlockEvent.HarvestDropsEvent event)
      {
  		    
    	  if(event.block == Blocks.red_flower)
        	  
          {
        	  
        	  
          	    int rand = new Random().nextInt(1);
                  if(rand == 0){
                	  event.drops.clear();
      		    event.drops.add(new ItemStack(ItemMod.seedTuto, 1));
      		    
      		    event.dropChance = 0.009F;
                  }
          }
      }
	  
     
 
 

    	  @SubscribeEvent
          public void onDrops3(BlockEvent.HarvestDropsEvent event)
          {
      		    
        	  if(event.block == Blocks.yellow_flower)
            	  
              {
            	  
            	  
              	    int rand = new Random().nextInt(1);
                      if(rand == 0){
                    	  event.drops.clear();
          		    event.drops.add(new ItemStack(ItemMod.seedTuto, 1));
          		    
          		    event.dropChance = 0.009F;
                      }
              }
          }
        	  @SubscribeEvent
              public void onDrops5(BlockEvent.HarvestDropsEvent event)
              {
          		    
            	  if(event.block == Blocks.tallgrass)
                	  
                  {
                	  
                	  
                  	    int rand = new Random().nextInt(1);
                          if(rand == 0){
                        	  event.drops.clear();
              		    event.drops.add(new ItemStack(ItemMod.seedTuto, 1));
              		    
              		    event.dropChance = 0.001F;
                          }
                  }
             
     
     
}
    	  
              

      @SubscribeEvent
      public void onDrops1(BlockEvent.HarvestDropsEvent event)
      {
      if(event.block == BlockMod.Sunrounge)
      {
      	    int rand = new Random().nextInt(5);
              if(rand == 0){
            	  event.drops.clear();
  		    event.drops.add(new ItemStack(ItemMod.ai, 1));

  		    event.dropChance = 0.4F;
  	    }
  	    else if(rand == 1){
  	    	event.drops.clear();
  		    event.drops.add(new ItemStack(ItemMod.ri, 1));

  		    event.dropChance = 0.3F;
  	    }
  	    else if(rand == 2){
  	    	event.drops.clear();
  		    event.drops.add(new ItemStack(ItemMod.myleniumIngot, 1));

  		    event.dropChance = 0.02F;
  	    }
  	    else if(rand == 3) {
  	    	event.drops.clear();
  		    event.drops.add(new ItemStack(ItemMod.seedTuto, 1));

  		    event.dropChance = 0.007F;
  	    }
              
  	  else if(rand == 4) {
		    event.drops.clear();
		    event.drops.add(new ItemStack(ItemMod.si, 1));


		    event.dropChance = 0.003F;
     
  	
      }
      }
      }
      @SubscribeEvent
      public void onDrops9(BlockEvent.HarvestDropsEvent event)
      {
  		    
    	  if(event.block == BlockMod.amethyst)
        	  
          {
        	  
        	  
          	    int rand = new Random().nextInt(1);
                  if(rand == 0){
                	  event.drops.clear();
      		    event.drops.add(new ItemStack(ItemMod.ai, 1));
      		    
      		    event.dropChance = 1.0F;
                  }
          }
      }
    	  @SubscribeEvent
          public void onDrops10(BlockEvent.HarvestDropsEvent event)
          {
      		    
        	  if(event.block == BlockMod.ruby)
            	  
              {
            	  
            	  
              	    int rand = new Random().nextInt(1);
                      if(rand == 0){
                    	  event.drops.clear();
          		    event.drops.add(new ItemStack(ItemMod.ri, 1));
          		    
          		    event.dropChance = 1.0F;
                      }
              }
          }
        	  @SubscribeEvent
              public void onDrops11(BlockEvent.HarvestDropsEvent event)
              {
          		    
            	  if(event.block == BlockMod.myleniumore)
                	  
                  {
                	  
                	  
                  	    int rand = new Random().nextInt(1);
                          if(rand == 0){
                        	  event.drops.clear();
              		    event.drops.add(new ItemStack(ItemMod.myleniumIngot, 1));
              		    
              		    event.dropChance = 1.0F;
                          }
                  }
              }
                              
}

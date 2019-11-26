package com.mod.sunwhy.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister 
{

		
		public static void mainRegistry()
		{
			registerWorldGen(new WorldGenTuto(), -1);
			registerWorldGen(new WorldGenTuto(), 0);
			registerWorldGen(new WorldGenTuto(), 1);
			
			
			
			
		}
			public static void registerWorldGen (IWorldGenerator iGenerator, int probability)
			{
				
				GameRegistry.registerWorldGenerator(iGenerator, probability);
				
				
			}
			
	
			
		
	}
	


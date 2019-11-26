package com.mod.sunwhy.init;

import com.mod.sunwhy.blocks.BlockCropsMod;
import com.mod.sunwhy.events.DropsBlock;

import net.minecraftforge.common.MinecraftForge;

public class EventsMod
{
  public static void init()
  {
    MinecraftForge.EVENT_BUS.register(new DropsBlock());
    MinecraftForge.EVENT_BUS.register(new BlockCropsMod());
  }
}

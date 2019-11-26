package com.mod.sunwhy.handlers;

import java.awt.Color;
import java.util.Random;

import com.mod.sunwhy.ModTuto;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandlers
{
    public static void registerMonster(Class entityClass, String string)
    {
        int entiyID = EntityRegistry.findGlobalUniqueEntityId();
        
        EntityRegistry.registerGlobalEntityID(entityClass, string, EntityRegistry.findGlobalUniqueEntityId(), new Color(0, 221, 243).getRGB(), new Color(243, 0, 0).getRGB());
        EntityRegistry.addSpawn(string, 40, 5, 10, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.plains);
        EntityRegistry.registerModEntity(entityClass, string, entiyID, ModTuto.instance, 64, 1, true);
    }
}
package com.mod.sunwhy.dimension;

import java.util.Random;

import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraftforge.event.terraingen.TerrainGen;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.*;

public class dimensionsaphir {
	


	  
	
	
	private Random rand;
	    private NoiseGeneratorOctaves noiseGen1;//les noises
	    private NoiseGeneratorOctaves noiseGen2;
	    private NoiseGeneratorOctaves noiseGen3;
	    private NoiseGeneratorPerlin noiseGen4;
	    public NoiseGeneratorOctaves noiseGen5;
	    public NoiseGeneratorOctaves noiseGen6;
	    public NoiseGeneratorOctaves mobSpawnerNoise;
	    private World worldObj;
	    private WorldType worldType;
	    private final double[] noiseArray;
	    private final float[] parabolicField;
	    private final boolean mapFeaturesEnabled;
	 
	    private MapGenBase caveGenerator = new MapGenCaves();//la génération des caves, remplacer par votre ravin si vous utiliser une autre stone
	    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();//la génération des mineshaft, ""        ""                     ""
	    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
	    private MapGenBase ravineGenerator = new MapGenRavine();//la structure du ravin,          ""             ""                     ""
	 
	    private double[] stoneNoise = new double[256];
	    private BiomeGenBase[] biomesForGeneration;
	    double[] noiseData1; //les noises data
	    double[] noiseData2;
	    double[] noiseData3;
	    double[] noiseData4;
	    {
	        caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, CAVE);
	        mineshaftGenerator = (MapGenMineshaft) TerrainGen.getModdedMapGen(mineshaftGenerator, MINESHAFT);
	        scatteredFeatureGenerator = (MapGenScatteredFeature) TerrainGen.getModdedMapGen(scatteredFeatureGenerator, SCATTERED_FEATURE);
	        ravineGenerator = TerrainGen.getModdedMapGen(ravineGenerator, RAVINE);
	    }
	   
	    public dimensionsaphir(World world, long seed, boolean features)
	    {
	            this.worldObj = world;
	            this.mapFeaturesEnabled = features;
	            this.worldType = world.getWorldInfo().getTerrainType();
	            this.rand = new Random(seed);
	            this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
	            this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
	            this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
	            this.noiseGen4 = new NoiseGeneratorPerlin(this.rand, 4);
	            this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
	            this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
	            this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
	            this.noiseArray = new double[825];
	            this.parabolicField = new float[25];
	 
	            for (int j = -2; j <= 2; ++j)
	            {
	                for (int k = -2; k <= 2; ++k)
	                {
	                    float f = 10.0F / MathHelper.sqrt_float((float)(j * j + k * k) + 0.2F);
	                    this.parabolicField[j + 2 + (k + 2) * 5] = f;
	                }
	            }
	 
	            NoiseGenerator[] noiseGens = {noiseGen1, noiseGen2, noiseGen3, noiseGen4, noiseGen5, noiseGen6, mobSpawnerNoise};
	            noiseGens = TerrainGen.getModdedNoiseGenerators(world, this.rand, noiseGens);
	            this.noiseGen1 = (NoiseGeneratorOctaves)noiseGens[0];
	            this.noiseGen2 = (NoiseGeneratorOctaves)noiseGens[1];
	            this.noiseGen3 = (NoiseGeneratorOctaves)noiseGens[2];
	            this.noiseGen4 = (NoiseGeneratorPerlin)noiseGens[3];
	            this.noiseGen5 = (NoiseGeneratorOctaves)noiseGens[4];
	            this.noiseGen6 = (NoiseGeneratorOctaves)noiseGens[5];
	            this.mobSpawnerNoise = (NoiseGeneratorOctaves)noiseGens[6];
	    }
}
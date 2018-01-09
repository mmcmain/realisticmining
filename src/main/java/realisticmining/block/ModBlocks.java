package realisticmining.block;

import java.util.ArrayList;
import java.util.List;

import realisticmining.RealisticMiningMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import realisticmining.general.ModChecker;
import realisticmining.general.RMLog;
import realisticmining.item.ItemOreDict;
import realisticmining.item.ModItems;
import realisticmining.world.ModBiomeEntry;

public class ModBlocks 
{
	public static List<BlockOre> supportedOres = new ArrayList();
	
	
	// Vanilla
	
	public static BlockOre oreHeavyIron;
	public static BlockHeavyOre blockHeavyIron;

	public static BlockOre oreHeavyGold;
	public static BlockHeavyOre blockHeavyGold;
	
	public static BlockOre oreHeavyDiamond;
	public static BlockHeavyOre blockHeavyDiamond;
	
	public static BlockOre oreHeavyCoal;
	public static BlockHeavyOre blockHeavyCoal;
	
	public static BlockOre oreHeavyLapis;
	public static BlockHeavyOre blockHeavyLapis;
	
	public static BlockOre oreHeavyRedstone;
	public static BlockHeavyOre blockHeavyRedstone;
	
	
	// AE2
	
	public static BlockOre oreHeavyCertus;
	public static BlockHeavyOre blockHeavyCertus;
	
	
	// Railcraft
	
	public static BlockOre oreHeavyCopper;
	public static BlockHeavyOre blockHeavyCopper;
	
	public static BlockOre oreHeavyTin;
	public static BlockHeavyOre blockHeavyTin;

	public static BlockOre oreHeavyNickel;
	public static BlockHeavyOre blockHeavyNickel;

	public static BlockOre oreHeavyLead;
	public static BlockHeavyOre blockHeavyLead;
	
	public static BlockOre oreHeavySilver;
	public static BlockHeavyOre blockHeavySilver;
	
	public static BlockOre oreHeavyZinc;
	public static BlockHeavyOre blockHeavyZinc;

	public static BlockOre oreHeavySulfur;
	public static BlockHeavyOre blockHeavySulfur;

	public static BlockOre oreHeavySaltpeter;
	public static BlockHeavyOre blockHeavySaltpeter;

	

	public static void init()
	{
		// Vanilla

		
		blockHeavyIron = register(new BlockHeavyOre("blockHeavyIron"));
		oreHeavyIron = register(new BlockOre("oreHeavyIron", "oreHeavyIron", blockHeavyIron));
		oreHeavyIron.minY = 5;
		oreHeavyIron.maxY = 66;
		oreHeavyIron.clumpSize = 4;
		oreHeavyIron.veinSize = 30;
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyIron.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		
		
		blockHeavyGold = register(new BlockHeavyOre("blockHeavyGold"));
		oreHeavyGold = register(new BlockOre("oreHeavyGold", "oreHeavyGold", blockHeavyGold));
		oreHeavyGold.minY = 5;
		oreHeavyGold.maxY = 30;
		oreHeavyGold.clumpSize = 2;
		oreHeavyGold.veinSize = 15;
		oreHeavyGold.setHarvestLevel("pickaxe", 2);
		blockHeavyGold.setHarvestLevel("pickaxe", 2);
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyGold.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_RESTRICTED));

		
		
		blockHeavyDiamond = register(new BlockHeavyOre("blockHeavyDiamond"));
		oreHeavyDiamond = register(new BlockOre("oreHeavyDiamond", "oreHeavyDiamond", blockHeavyDiamond));
		oreHeavyDiamond.minY = 5;
		oreHeavyDiamond.maxY = 15;
		oreHeavyDiamond.clumpSize = 2;
		oreHeavyDiamond.veinSize = 8;
		oreHeavyDiamond.setHarvestLevel("pickaxe", 2);
		blockHeavyDiamond.setHarvestLevel("pickaxe", 2);
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyDiamond.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		

		blockHeavyRedstone = register(new BlockHeavyOre("blockHeavyRedstone"));
		oreHeavyRedstone = register(new BlockOre("oreHeavyRedstone", "oreHeavyRedstone", blockHeavyRedstone));
		oreHeavyRedstone.minY = 5;
		oreHeavyRedstone.maxY = 15;
		oreHeavyRedstone.clumpSize = 3;
		oreHeavyRedstone.veinSize = 12;
		oreHeavyRedstone.setHarvestLevel("pickaxe", 3);
		blockHeavyRedstone.setHarvestLevel("pickaxe", 3);
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyRedstone.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		
		blockHeavyCoal = register(new BlockHeavyOre("blockHeavyCoal"));
		oreHeavyCoal = register(new BlockOre("oreHeavyCoal", "oreHeavyCoal", blockHeavyCoal));
		oreHeavyCoal.minY = 5;
		oreHeavyCoal.maxY = 130;
		oreHeavyCoal.clumpSize = 8;
		oreHeavyCoal.veinSize = 30;
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCoal.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		
		blockHeavyLapis = register(new BlockHeavyOre("blockHeavyLapis"));
		oreHeavyLapis = register(new BlockOre("oreHeavyLapis", "oreHeavyLapis", blockHeavyLapis));
		oreHeavyLapis.minY = 14;
		oreHeavyLapis.maxY = 30;
		oreHeavyLapis.clumpSize = 4;
		oreHeavyLapis.veinSize = 18;
		oreHeavyLapis.setHarvestLevel("pickaxe", 2);
		blockHeavyLapis.setHarvestLevel("pickaxe", 2);
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLapis.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		

		// AE2
		
		blockHeavyCertus = register(new BlockHeavyOre("blockHeavyCertus"));
		oreHeavyCertus = register(new BlockOre("oreHeavyCertus", "oreHeavyCertus", blockHeavyCertus));
		oreHeavyCertus.minY = 5;
		oreHeavyCertus.maxY = 30;
		oreHeavyCertus.clumpSize = 3;
		oreHeavyCertus.veinSize = 12;
		oreHeavyCertus.setHarvestLevel("pickaxe", 2);
		blockHeavyCertus.setHarvestLevel("pickaxe", 2);
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCertus.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_RESTRICTED));

		
		
		// Railcraft
		
		blockHeavyCopper = register(new BlockHeavyOre("blockHeavyCopper"));
		oreHeavyCopper = register(new BlockOre("oreHeavyCopper", "oreHeavyCopper", blockHeavyCopper));
		oreHeavyCopper.minY = 40;
		oreHeavyCopper.maxY = 100;
		oreHeavyCopper.clumpSize = 5;
		oreHeavyCopper.veinSize = 30;
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyCopper.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_RESTRICTED));

		blockHeavyTin = register(new BlockHeavyOre("blockHeavyTin"));
		oreHeavyTin = register(new BlockOre("oreHeavyTin", "oreHeavyTin", blockHeavyTin));
		oreHeavyTin.minY = 30;
		oreHeavyTin.maxY = 100;
		oreHeavyTin.clumpSize = 5;
		oreHeavyTin.veinSize = 30;
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyTin.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_PREFERRED));

		blockHeavyLead = register(new BlockHeavyOre("blockHeavyLead"));
		oreHeavyLead = register(new BlockOre("oreHeavyLead", "oreHeavyLead", blockHeavyLead));
		oreHeavyLead.minY = 5;
		oreHeavyLead.maxY = 30;
		oreHeavyLead.clumpSize = 3;
		oreHeavyLead.veinSize = 20;
		oreHeavyLead.setHarvestLevel("pickaxe", 2);
		blockHeavyLead.setHarvestLevel("pickaxe", 2);
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyLead.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_PREFERRED));

		blockHeavySilver = register(new BlockHeavyOre("blockHeavySilver"));
		oreHeavySilver = register(new BlockOre("oreHeavySilver", "oreHeavySilver", blockHeavySilver));
		oreHeavySilver.minY = 5;
		oreHeavySilver.maxY = 30;
		oreHeavySilver.clumpSize = 3;
		oreHeavySilver.veinSize = 15;
		oreHeavySilver.setHarvestLevel("pickaxe", 2);
		blockHeavySilver.setHarvestLevel("pickaxe", 2);
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavySilver.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		
		blockHeavyNickel = register(new BlockHeavyOre("blockHeavyNickel"));
		oreHeavyNickel = register(new BlockOre("oreHeavyNickel", "oreHeavyNickel", blockHeavyNickel));
		oreHeavyNickel.minY = 5;
		oreHeavyNickel.maxY = 15;
		oreHeavyNickel.clumpSize = 5;
		oreHeavyNickel.veinSize = 20;
		oreHeavyNickel.setHarvestLevel("pickaxe", 2);
		blockHeavyNickel.setHarvestLevel("pickaxe", 2);
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyNickel.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_RESTRICTED));

		blockHeavyZinc = register(new BlockHeavyOre("blockHeavyZinc"));
		oreHeavyZinc = register(new BlockOre("oreHeavyZinc", "oreHeavyZinc", blockHeavyZinc));
		oreHeavyZinc.minY = 30;
		oreHeavyZinc.maxY = 65;
		oreHeavyZinc.clumpSize = 3;
		oreHeavyZinc.veinSize = 10;
		oreHeavyZinc.setHarvestLevel("pickaxe", 2);
		blockHeavyZinc.setHarvestLevel("pickaxe", 2);
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Forest", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Desert", ModBiomeEntry.Preferences.BIOME_PREFERRED));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Ocean", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Taiga", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Hills", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Beach", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("River", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Plains", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Swamp", ModBiomeEntry.Preferences.BIOME_DEFAULT));
		oreHeavyZinc.biomeEntries.add(new ModBiomeEntry("Jungle", ModBiomeEntry.Preferences.BIOME_RESTRICTED));
		
		
	}

	
	private static <T extends Block> T register(T block, ItemBlock itemBlock)
	{
		GameRegistry.register(block);
		
		if (itemBlock != null)
		{
			GameRegistry.register(itemBlock);
			
			if (block instanceof BlockBase)
			{
				((BlockBase)block).registerItemModel(itemBlock);
			}

			if (itemBlock instanceof ItemOreDict)
			{
				((ItemOreDict)itemBlock).initOreDict();
			}
			
			if (block instanceof BlockTileEntity)
			{
				GameRegistry.registerTileEntity(((BlockTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());;
			}
			
			return block;
		}

		if (block instanceof ItemOreDict)
		{
			((ItemOreDict)block).initOreDict();
		}
		
		
		return block;
	}
	
	private static <T extends Block> T register(T block)
	{
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

	public static void postInit() 
	{
		// Vanilla

		postInitOre(ModBlocks.oreHeavyIron, Blocks.IRON_ORE);
		postInitOre(ModBlocks.oreHeavyGold, Blocks.GOLD_ORE);
		postInitOre(ModBlocks.oreHeavyDiamond, Blocks.DIAMOND_ORE);
		postInitOre(ModBlocks.oreHeavyCoal, Blocks.COAL_ORE);
		postInitOre(ModBlocks.oreHeavyRedstone, Blocks.REDSTONE_ORE);
		postInitOre(ModBlocks.oreHeavyLapis, Blocks.LAPIS_ORE);
		
		
		// AE2
		
		if ( ModChecker.isAE2Installed )
		{
			postInitOre(ModBlocks.oreHeavyCertus, Block.getBlockFromName("appliedenergistics2:quartz_ore"));
		}
		
		// Railcraft
		
		if ( ModChecker.isRailcraftInstalled )
		{
			Block rcBlock = (Block) Block.getBlockFromName("railcraft:ore_metal");
			
			ModBlocks.oreHeavyCopper.getBlockHeavyOre().setDropMeta(0);
			postInitOre(ModBlocks.oreHeavyCopper, rcBlock);
			
			ModBlocks.oreHeavyTin.getBlockHeavyOre().setDropMeta(1);
			postInitOre(ModBlocks.oreHeavyTin, rcBlock);

			ModBlocks.oreHeavyLead.getBlockHeavyOre().setDropMeta(2);
			postInitOre(ModBlocks.oreHeavyLead, rcBlock);
			
			ModBlocks.oreHeavySilver.getBlockHeavyOre().setDropMeta(3);
			postInitOre(ModBlocks.oreHeavySilver, rcBlock);

			ModBlocks.oreHeavyNickel.getBlockHeavyOre().setDropMeta(4);
			postInitOre(ModBlocks.oreHeavyNickel, rcBlock);

			ModBlocks.oreHeavyZinc.getBlockHeavyOre().setDropMeta(5);
			postInitOre(ModBlocks.oreHeavyZinc, rcBlock);

			
		}
	}
	
	private static void postInitOre(BlockOre blockOre, Block dropProducer)
	{
		blockOre.getBlockHeavyOre().setDropProducer(dropProducer);
		ModBlocks.supportedOres.add(blockOre);
	}
	
}

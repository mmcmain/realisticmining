package realisticmining;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import realisticmining.block.ModBlocks;
import realisticmining.general.ModChecker;
import realisticmining.general.RMLog;
import realisticmining.item.ModItems;
import realisticmining.proxy.CommonProxy;
import realisticmining.recipie.ModRecipies;
import realisticmining.world.ModWorldGen;

@Mod(modid = RealisticMiningMod.modId, name = RealisticMiningMod.name, version = RealisticMiningMod.version, acceptedMinecraftVersions = "[1.10.2]")


public class RealisticMiningMod 
{
	public static final String modId = "realisticmining";
	public static final String name = "Realistic Mining Mod";
	public static final String version = "0.1";
	
	public static final RealisticMiningTab creativeTab = new RealisticMiningTab();
	
	@Mod.Instance(modId)
	public static RealisticMiningMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RMLog.info("Realistic Mining is preinitializing...");
		ModItems.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModRecipies.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		RMLog.info("Realistic Mining is post initializing...");

		ModChecker.postInit();

		ModBlocks.postInit();
	}
	
	@SidedProxy(serverSide = "realisticmining.proxy.CommonProxy", 
			clientSide = "realisticmining.proxy.ClientProxy")
	public static CommonProxy proxy;
	
}

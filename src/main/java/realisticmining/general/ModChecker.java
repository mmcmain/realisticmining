package realisticmining.general;

import net.minecraftforge.fml.common.Loader;

public class ModChecker 
{
	public static boolean isAE2Installed;
	public static boolean isRailcraftInstalled;
	
	public static void postInit()
	{
		ModChecker.isAE2Installed = Loader.isModLoaded("appliedenergistics2");
		ModChecker.isRailcraftInstalled = Loader.isModLoaded("railcraft");
	}
	
}

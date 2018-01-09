package realisticmining.world;



public class ModBiomeEntry 
{
	public static enum Preferences 
	{
		BIOME_RESTRICTED,
		BIOME_PREFERRED,
		BIOME_DEFAULT
	}

	
	public String biomeName;
	public Preferences biomePreference;
	
	
	
	public ModBiomeEntry(String biomeName, Preferences biomePreference)
	{
		this.biomeName = biomeName;
		this.biomePreference = biomePreference;
	}
	
	public boolean isRestricted()
	{
		return biomePreference == Preferences.BIOME_RESTRICTED;
	}
	
	public boolean isPreferred()
	{
		return biomePreference == Preferences.BIOME_PREFERRED;
	}
	
	
}

package realisticmining.recipie;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import realisticmining.block.ModBlocks;
import realisticmining.item.ModItems;

public class ModRecipies 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.oreHeavyIron, new ItemStack(ModItems.dustHeavyIron), 0.7f);
		GameRegistry.addSmelting(ModItems.dustHeavyIron, new ItemStack(Items.IRON_INGOT), 0.7f);
	}
}

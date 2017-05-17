package io.johnjohn.universus.metalla;

import io.johnjohn.universus.block.BlockBase;
import io.johnjohn.universus.block.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MetallaBlocks {
	public static BlockOre oreCopper;
	public static BlockOre oreTin;
	
	public static void init() {
    	oreCopper = register(new BlockOre("oreCopper").setCreativeTab(CreativeTabs.MATERIALS));
    	oreTin    = register(new BlockOre("oreTin").setCreativeTab(CreativeTabs.MATERIALS));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}

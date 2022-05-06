
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddycraft.plankcutter.init;

import net.moddycraft.plankcutter.PlankCutterMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class PlankCutterModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PlankCutterMod.MODID);
	public static final RegistryObject<Item> PLANK_CUTTER = block(PlankCutterModBlocks.PLANK_CUTTER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> IRON_TABLE = block(PlankCutterModBlocks.IRON_TABLE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> IRON_PAWS = block(PlankCutterModBlocks.IRON_PAWS, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

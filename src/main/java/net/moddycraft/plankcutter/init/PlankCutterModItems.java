
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddycraft.plankcutter.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PlankCutterModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item PLANK_CUTTER = register(PlankCutterModBlocks.PLANK_CUTTER, CreativeModeTab.TAB_DECORATIONS);
	public static final Item IRON_TABLE = register(PlankCutterModBlocks.IRON_TABLE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item IRON_PAWS = register(PlankCutterModBlocks.IRON_PAWS, null);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}

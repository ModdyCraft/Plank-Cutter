
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddycraft.plankcutter.init;

import net.moddycraft.plankcutter.block.PlankCutterBlock;
import net.moddycraft.plankcutter.block.IronTableBlock;
import net.moddycraft.plankcutter.block.IronPawsBlock;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PlankCutterModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block PLANK_CUTTER = register(new PlankCutterBlock());
	public static final Block IRON_TABLE = register(new IronTableBlock());
	public static final Block IRON_PAWS = register(new IronPawsBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PlankCutterBlock.registerRenderLayer();
			IronTableBlock.registerRenderLayer();
			IronPawsBlock.registerRenderLayer();
		}
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddycraft.plankcutter.init;

import net.moddycraft.plankcutter.block.PlankCutterBlock;
import net.moddycraft.plankcutter.block.IronTableBlock;
import net.moddycraft.plankcutter.block.IronPawsBlock;
import net.moddycraft.plankcutter.PlankCutterMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class PlankCutterModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PlankCutterMod.MODID);
	public static final RegistryObject<Block> PLANK_CUTTER = REGISTRY.register("plank_cutter", () -> new PlankCutterBlock());
	public static final RegistryObject<Block> IRON_TABLE = REGISTRY.register("iron_table", () -> new IronTableBlock());
	public static final RegistryObject<Block> IRON_PAWS = REGISTRY.register("iron_paws", () -> new IronPawsBlock());

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

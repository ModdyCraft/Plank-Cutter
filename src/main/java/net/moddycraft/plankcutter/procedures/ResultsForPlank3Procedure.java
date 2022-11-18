package net.moddycraft.plankcutter.procedures;

import net.moddycraft.plankcutter.network.PlankCutterModVariables;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class ResultsForPlank3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 8;
			entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Results = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 0) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_STAIRS);
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 1) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_DOOR);
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 2) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_TRAPDOOR);
				_setstack.setCount(3);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 3) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_BUTTON);
				_setstack.setCount(4);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 4) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PRESSURE_PLATE);
				_setstack.setCount(3);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 5) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_FENCE);
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 6) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_FENCE_GATE);
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 7) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_SLAB);
				_setstack.setCount(2);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult == 8) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.JUNGLE_SIGN);
				_setstack.setCount(3);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}

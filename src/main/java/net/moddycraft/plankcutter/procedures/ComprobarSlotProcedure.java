package net.moddycraft.plankcutter.procedures;

import net.moddycraft.plankcutter.network.PlankCutterModVariables;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class ComprobarSlotProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == Blocks.OAK_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 1;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 2;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 3;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 4;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 5;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 6;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 7;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_PLANKS.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 8;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 9;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 10;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 11;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 12;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 13;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 14;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_STEM.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 15;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_STEM.asItem()) {
			PlankCutterModVariables.MapVariables.get(world).tipoDeTablon = 16;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		}
		if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 1
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.OAK_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 2
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 3
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.BIRCH_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 4
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.JUNGLE_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 5
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.ACACIA_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 6
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 7
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.CRIMSON_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 8
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.WARPED_PLANKS.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_STAIRS);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_TRAPDOOR);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_BUTTON);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_PRESSURE_PLATE);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_SLAB);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CHEST);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BARREL);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COMPOSTER);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_SIGN);
					_setstack.setCount(3);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LADDER);
					_setstack.setCount(9);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_FENCE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_FENCE_GATE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 9
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_OAK_LOG);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_OAK_WOOD);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 10
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.SPRUCE_LOG.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_SPRUCE_LOG);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_SPRUCE_WOOD);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 11
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.BIRCH_LOG.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_BIRCH_LOG);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_BIRCH_WOOD);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 12
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.JUNGLE_LOG.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_JUNGLE_LOG);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_JUNGLE_WOOD);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 13
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.ACACIA_LOG.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_ACACIA_LOG);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_ACACIA_WOOD);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 14
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.DARK_OAK_LOG.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_DARK_OAK_WOOD);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 15
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.CRIMSON_STEM.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_CRIMSON_STEM);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_CRIMSON_HYPHAE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (PlankCutterModVariables.MapVariables.get(world).tipoDeTablon == 16
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.WARPED_STEM.asItem()) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_WARPED_STEM);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.STRIPPED_WARPED_HYPHAE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS);
					_setstack.setCount(4);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}

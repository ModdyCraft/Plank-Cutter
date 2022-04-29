package net.moddycraft.plankcutter.procedures;

import net.moddycraft.plankcutter.network.PlankCutterModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class NextObjectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 1 && PlankCutterModVariables.MapVariables.get(world).tipoDeTablon >= 1
				&& PlankCutterModVariables.MapVariables.get(world).tipoDeTablon < 9) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 1;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 2;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 3;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 4;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 5;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 6;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 7;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 8;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 9;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 10;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 11;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 12;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 1 && PlankCutterModVariables.MapVariables.get(world).tipoDeTablon >= 9
				&& PlankCutterModVariables.MapVariables.get(world).tipoDeTablon <= 16) {
			if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 0) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 1;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 1) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 2;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 2) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 3) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 4) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 5) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 6) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 7) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 8) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 9) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 10) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 11) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			} else if (PlankCutterModVariables.MapVariables.get(world).numeroDB == 12) {
				PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
				PlankCutterModVariables.MapVariables.get(world).syncData(world);
			}
		} else {
			PlankCutterModVariables.MapVariables.get(world).numeroDB = 0;
			PlankCutterModVariables.MapVariables.get(world).syncData(world);
		}
	}
}

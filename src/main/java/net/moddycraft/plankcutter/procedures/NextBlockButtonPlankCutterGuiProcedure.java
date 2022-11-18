package net.moddycraft.plankcutter.procedures;

import net.moddycraft.plankcutter.network.PlankCutterModVariables;

import net.minecraft.world.entity.Entity;

public class NextBlockButtonPlankCutterGuiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ResetCurrentResultProcedure.execute(entity);
		{
			double _setval = (entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult + 1;
			entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CurrentResult = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

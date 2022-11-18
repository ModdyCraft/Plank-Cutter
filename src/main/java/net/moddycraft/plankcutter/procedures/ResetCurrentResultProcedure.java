package net.moddycraft.plankcutter.procedures;

import net.moddycraft.plankcutter.network.PlankCutterModVariables;

import net.minecraft.world.entity.Entity;

public class ResetCurrentResultProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlankCutterModVariables.PlayerVariables())).CurrentResult > (entity
						.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PlankCutterModVariables.PlayerVariables())).Results) {
			{
				double _setval = 0;
				entity.getCapability(PlankCutterModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentResult = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

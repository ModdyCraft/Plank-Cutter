
package net.moddycraft.plankcutter.client.gui;

import net.moddycraft.plankcutter.world.inventory.PlankCutterGuiMenu;
import net.moddycraft.plankcutter.network.PlankCutterGuiButtonMessage;
import net.moddycraft.plankcutter.PlankCutterMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PlankCutterGuiScreen extends AbstractContainerScreen<PlankCutterGuiMenu> {
	private final static HashMap<String, Object> guistate = PlankCutterGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PlankCutterGuiScreen(PlankCutterGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("plank_cutter:textures/plank_cutter_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("plank_cutter:textures/plankc_cutter_gui2.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "PLANK CUTTER", 2, 3, -1);
		this.font.draw(poseStack, "Inventory", 6, 73, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 82, this.topPos + 8, 82, 20, new TextComponent("NEXT BLOCK"), e -> {
			if (true) {
				PlankCutterMod.PACKET_HANDLER.sendToServer(new PlankCutterGuiButtonMessage(0, x, y, z));
				PlankCutterGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}

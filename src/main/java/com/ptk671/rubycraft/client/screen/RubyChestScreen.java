package com.ptk671.rubycraft.client.screen;

import com.ptk671.rubycraft.container.RubyChestScreenHandler;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.pitan76.mcpitanlib.api.client.SimpleHandledScreen;
import net.pitan76.mcpitanlib.api.client.render.handledscreen.*;
import net.pitan76.mcpitanlib.api.util.client.RenderUtil;

public class RubyChestScreen extends SimpleHandledScreen {

    private static final Identifier TEXTURE = new Identifier("textures/gui/container/generic_54.png");

    public static int DEFAULT_ROW = RubyChestScreenHandler.DEFAULT_ROW;

    public RubyChestScreen(ScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundHeight = 114 + DEFAULT_ROW * 18;
        this.playerInventoryTitleY = this.backgroundHeight - 94;
    }

    @Override
    public void drawBackgroundOverride(DrawBackgroundArgs args) {
        RenderUtil.setShaderToPositionTexProgram();
        RenderUtil.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        callDrawTexture(args.drawObjectDM, TEXTURE, x, y, 0, 0, backgroundWidth, DEFAULT_ROW * 18 + 17);
        callDrawTexture(args.drawObjectDM, TEXTURE, x, y + DEFAULT_ROW * 18 + 17, 0, 126, backgroundWidth, 96);
    }

    @Override
    public void drawForegroundOverride(DrawForegroundArgs args) {
        super.drawForegroundOverride(args);
    }

    @Override
    public void renderOverride(RenderArgs args) {
        this.callRenderBackground(args);
        super.renderOverride(args);
        this.callDrawMouseoverTooltip(new DrawMouseoverTooltipArgs(args.drawObjectDM, args.mouseX, args.mouseY));
    }
}

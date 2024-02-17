package com.ptk671.rubycraft.client;

import com.ptk671.rubycraft.ScreenHandlers;
import com.ptk671.rubycraft.client.screen.RubyChestScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.pitan76.mcpitanlib.api.client.registry.ArchRegistryClient;

public class Screens {
    @Environment(EnvType.CLIENT)
    public static void register() {
        ArchRegistryClient.registerScreen(ScreenHandlers.RUBY_CHEST_SCREEN_HANDLER.getOrNull(), RubyChestScreen::new);
    }
}

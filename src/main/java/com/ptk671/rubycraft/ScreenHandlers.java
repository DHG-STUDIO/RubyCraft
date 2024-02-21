package com.ptk671.rubycraft;

import com.ptk671.rubycraft.container.RubyChestScreenHandler;

import net.minecraft.screen.ScreenHandlerType;

import net.pitan76.mcpitanlib.api.gui.SimpleScreenHandlerTypeBuilder;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;

public class ScreenHandlers {
    public static RegistryResult<ScreenHandlerType<?>> RUBY_CHEST_SCREEN_HANDLER;

    public static void register() {
        RUBY_CHEST_SCREEN_HANDLER = registry.registerScreenHandlerType(id("ruby_chest"), () -> new SimpleScreenHandlerTypeBuilder<>(RubyChestScreenHandler::new).build());
    }
}

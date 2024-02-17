package com.ptk671.rubycraft.client;

import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.TexturedRenderLayers;

import static com.ptk671.rubycraft.RubyCraft.id;

public class Textures {
    public static void register() {
        ClientSpriteRegistryCallback.event(TexturedRenderLayers.CHEST_ATLAS_TEXTURE).register((texture, registry) -> {
            registry.register(id("model/ruby_chest"));
        });
    }
}

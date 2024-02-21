package com.ptk671.rubycraft.client;

import net.minecraft.client.render.TexturedRenderLayers;

import net.pitan76.mcpitanlib.api.client.registry.ArchRegistryClient;

import static com.ptk671.rubycraft.RubyCraft.id;

public class Textures {
    public static void register() {
        ArchRegistryClient.registryClientSprite(TexturedRenderLayers.CHEST_ATLAS_TEXTURE, id("model/ruby_chest"));
    }
}

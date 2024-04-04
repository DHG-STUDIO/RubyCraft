package com.ptk671.rubycraft.client.renderer;

import com.ptk671.rubycraft.BlockEntities;
import net.pitan76.mcpitanlib.api.client.registry.CompatRegistryClient;

public class BlockEntityRenderers {
    public static void register() {
        CompatRegistryClient.registerBlockEntityRenderer(BlockEntities.RUBY_CHEST.getOrNull(), (ctx -> new RubyChestBlockEntityRenderer(ctx)));
        CompatRegistryClient.registerBlockEntityRenderer(BlockEntities.RUBY_STORAGE.getOrNull(), (ctx -> new RubyStorageBlockEntityRenderer()));
    }
}

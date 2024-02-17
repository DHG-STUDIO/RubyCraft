package com.ptk671.rubycraft.client.renderer;

import com.ptk671.rubycraft.BlockEntities;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.pitan76.mcpitanlib.api.client.registry.ArchRegistryClient;

public class BlockEntityRenderers {
    public static void register() {
        ArchRegistryClient.registerBlockEntityRenderer(BlockEntities.RUBY_CHEST.getOrNull(),
                (ctx -> new RubyChestBlockEntityRenderer(new BlockEntityRendererFactory.Context(ctx.getRenderDispatcher(), ctx.getRenderManager(), ctx.getLayerRenderDispatcher(), ctx.getTextRenderer()))));
    }
}

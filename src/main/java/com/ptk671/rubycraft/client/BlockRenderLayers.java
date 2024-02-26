package com.ptk671.rubycraft.client;

import com.ptk671.rubycraft.Blocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenderLayers {
    public static void register() {
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.RUBY_STORAGE.getOrNull(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.RUBY_STORAGE_MK2.getOrNull(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.RUBY_STORAGE_MK3.getOrNull(), RenderLayer.getCutout());

    }
}
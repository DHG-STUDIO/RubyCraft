package com.ptk671.rubycraft.client;

import com.ptk671.rubycraft.Blocks;
import com.ptk671.rubycraft.EasyRegistry;

public class BlockRenderLayers {
    public static void register() {
        EasyRegistry.easyBlockRenderLayers(Blocks.RUBY_STORAGE.getOrNull());
        EasyRegistry.easyBlockRenderLayers(Blocks.RUBY_STORAGE_MK2.getOrNull());
        EasyRegistry.easyBlockRenderLayers(Blocks.RUBY_STORAGE_MK3.getOrNull());
    }
}
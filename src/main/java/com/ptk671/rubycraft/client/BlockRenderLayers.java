package com.ptk671.rubycraft.client;

import com.ptk671.rubycraft.Blocks;
import com.ptk671.rubycraft.EasyMCPitanlib;

public class BlockRenderLayers {
    public static void register() {
        EasyMCPitanlib.easyBlockRenderLayers(Blocks.RUBY_STORAGE.getOrNull());
        EasyMCPitanlib.easyBlockRenderLayers(Blocks.RUBY_STORAGE_MK2.getOrNull());
        EasyMCPitanlib.easyBlockRenderLayers(Blocks.RUBY_STORAGE_MK3.getOrNull());
    }
}
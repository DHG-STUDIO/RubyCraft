package com.ptk671.rubycraft.client;

import static com.ptk671.rubycraft.Blocks.RUBY_STORAGE;
import static com.ptk671.rubycraft.Blocks.RUBY_STORAGE_MK2;
import static com.ptk671.rubycraft.block.SetCutoutLayer.setCutoutLayer;

public class RegistrySetCutoutLayer {
    public static void register() {
        setCutoutLayer(RUBY_STORAGE.getOrNull());
        setCutoutLayer(RUBY_STORAGE_MK2.getOrNull());
    }
}
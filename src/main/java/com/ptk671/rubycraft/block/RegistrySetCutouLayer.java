package com.ptk671.rubycraft.block;

import static com.ptk671.rubycraft.Blocks.*;
import static com.ptk671.rubycraft.block.SetCutoutLayer.setCutoutLayer;

public class RegistrySetCutouLayer {
    public static void registry() {
        setCutoutLayer(RUBY_STORAGE.getOrNull());
        setCutoutLayer(RUBY_STORAGE_MK_2.getOrNull());
    }
}
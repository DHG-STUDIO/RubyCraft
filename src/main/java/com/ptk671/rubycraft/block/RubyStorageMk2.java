package com.ptk671.rubycraft.block;

import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;

public class RubyStorageMk2 extends RubyStorage {
    public RubyStorageMk2(CompatibleBlockSettings settings) {
        super(settings);
    }

    @Override
    public int getSlotSize() {
        return 64;
    }
}

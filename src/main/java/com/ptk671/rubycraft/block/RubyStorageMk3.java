package com.ptk671.rubycraft.block;

import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;

public class RubyStorageMk3 extends RubyStorage {
    public RubyStorageMk3(CompatibleBlockSettings settings) {
        super(settings);
    }

    @Override
    public int getSlotSize() {
        return 128;
    }
}

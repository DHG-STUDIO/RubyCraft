package com.ptk671.rubycraft.fuels;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import static com.ptk671.rubycraft.Items.SAW_DUST;

public class RegistryAllFuels {
    public static void register()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(() -> SAW_DUST.getOrNull(),100);
    }
}

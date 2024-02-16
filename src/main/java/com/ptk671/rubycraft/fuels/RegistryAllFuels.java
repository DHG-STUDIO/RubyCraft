package com.ptk671.rubycraft.fuels;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import static com.ptk671.rubycraft.Items.saw_dust;

public class RegistryAllFuels {
    public static void register()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(() -> saw_dust.getOrNull(),100);
    }
}

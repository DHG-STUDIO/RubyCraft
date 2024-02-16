package com.ptk671.rubycraft.fuels;
import net.pitan76.mcpitanlib.core.registry.FuelRegistry;
import static com.ptk671.rubycraft.Items.SAW_DUST;

public class RegistryAllFuels {
    public static void register()
    {
        FuelRegistry.register(100, SAW_DUST.getOrNull());

    }
}

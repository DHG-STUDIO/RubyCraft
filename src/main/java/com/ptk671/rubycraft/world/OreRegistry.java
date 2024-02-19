package com.ptk671.rubycraft.world;

import com.ptk671.rubycraft.Blocks;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.pitan76.mcpitanlib.api.registry.WorldGenRegistry;
import net.pitan76.mcpitanlib.api.util.FeatureConfigUtil;
import net.pitan76.mcpitanlib.api.util.PlacedFutureUtil;

import java.util.List;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.worldGenRegistry;

public class OreRegistry {
    private static final List<PlacementModifier> RUBY_ORE_PLACEMENT_MODIFIERS = PlacedFutureUtil.createPlacementModifiers(
            20,
            100
    );

    public static void register() {
        ConfiguredFeature<?, ?> rubyOreConfigured = FeatureConfigUtil.createConfiguredFeature(
                FeatureConfigUtil.createStoneOreFeatureConfig(
                        Blocks.RUBY_ORE.get().getDefaultState(),
                        9
                )
        );
        PlacedFeature rubyOrePlacer = PlacedFutureUtil.create(rubyOreConfigured, RUBY_ORE_PLACEMENT_MODIFIERS);

        worldGenRegistry.registerFeature(id("ruby_ore_overworld"), () -> rubyOreConfigured);
        worldGenRegistry.registerPlacedFeature(id("ruby_ore_overworld"), () -> rubyOrePlacer);

        WorldGenRegistry.replaceProperties(GenerationStep.Feature.UNDERGROUND_ORES, rubyOrePlacer);
    }
}

package com.ptk671.rubycraft.world;

import com.ptk671.rubycraft.Blocks;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.pitan76.mcpitanlib.api.registry.WorldGenRegistry;
import net.pitan76.mcpitanlib.api.util.FeatureConfigUtil;
import net.pitan76.mcpitanlib.api.util.PlacedFutureUtil;
import org.apache.commons.lang3.concurrent.ConcurrentException;
import org.apache.commons.lang3.concurrent.LazyInitializer;

import java.util.List;

import static com.ptk671.rubycraft.RubyCraft.*;

public class OreRegistry {
    private static final List<PlacementModifier> RUBY_ORE_PLACEMENT_MODIFIERS = PlacedFutureUtil.createPlacementModifiers(
            20,
            100
    );

    private static final LazyInitializer<ConfiguredFeature<?, ?>> LAZY_RUBY_ORE_CONFIGURE = new LazyInitializer<>() {
        @Override
        protected ConfiguredFeature<?, ?> initialize() {
            return FeatureConfigUtil.createConfiguredFeature(
                    FeatureConfigUtil.createStoneOreFeatureConfig(
                            Blocks.RUBY_ORE.get().getDefaultState(),
                            9
                    )
            );
        }
    };

    private static final LazyInitializer<PlacedFeature> LAZY_RUBY_ORE_PLACER = new LazyInitializer<>() {
        @Override
        protected PlacedFeature initialize() throws ConcurrentException {
            return PlacedFutureUtil.create(LAZY_RUBY_ORE_CONFIGURE.get(), RUBY_ORE_PLACEMENT_MODIFIERS);
        }
    };

    public static void register() {
        try {
            ConfiguredFeature<?, ?> rubyOreConfigured = LAZY_RUBY_ORE_CONFIGURE.get();
            PlacedFeature rubyOrePlacer = LAZY_RUBY_ORE_PLACER.get();

            worldGenRegistry.registerFeature(id("ruby_ore_overworld"), () -> rubyOreConfigured);
            worldGenRegistry.registerPlacedFeature(id("ruby_ore_overworld"), () -> rubyOrePlacer);

            WorldGenRegistry.replaceProperties(GenerationStep.Feature.UNDERGROUND_ORES, rubyOrePlacer);
        }
        catch (ConcurrentException e) {
            LOGGER.error("Failed to register ruby ore", e);
        }
    }
}

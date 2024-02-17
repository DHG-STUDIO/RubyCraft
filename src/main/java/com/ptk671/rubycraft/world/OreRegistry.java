package com.ptk671.rubycraft.world;

import com.ptk671.rubycraft.Blocks;
import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.MinecraftVersion;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

import static com.ptk671.rubycraft.RubyCraft.id;

public class OreRegistry {
    private static final List<PlacementModifier> RUBY_ORE_PLACEMENT_MODIFIERS = List.of(
            CountPlacementModifier.of(20),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(100))
    );

    //TODO: 1.18.2以外のバージョンにサポート
    public static void register() {
        if(!MinecraftVersion.CURRENT.getName().equals("1.18.2")) {
            return;
        }

        ConfiguredFeature<?, ?> rubyOreConfigure = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, id("ruby_ore_overworld"), new ConfiguredFeature<>(
                Feature.ORE, new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                Blocks.RUBY_ORE.get().getDefaultState(),
                9
        )));

        PlacedFeature rubyOrePlacer = Registry.register(BuiltinRegistries.PLACED_FEATURE, id("ruby_ore_overworld"), new PlacedFeature(
                RegistryEntry.of(rubyOreConfigure),
                RUBY_ORE_PLACEMENT_MODIFIERS
        ));

        BiomeModifications.replaceProperties((ctx, mutable) -> mutable.getGenerationProperties().addFeature(GenerationStep.Feature.UNDERGROUND_ORES, RegistryEntry.of(rubyOrePlacer)));
    }
}

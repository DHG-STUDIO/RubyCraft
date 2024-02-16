package com.ptk671.rubycraft;

import com.ptk671.rubycraft.block.Rubychest;
import com.ptk671.rubycraft.block.Rubyore;
import com.ptk671.rubycraft.block.crushing_machine;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.CompatibleMaterial;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static com.ptk671.rubycraft.Rubycraft.id;
import static com.ptk671.rubycraft.Rubycraft.registry;

public class Blocks {

    public static RegistryResult<Block> ruby_block;
    public static RegistryResult<Block> polished_ruby_block;
    public static RegistryResult<Block> ruby_ore;
    public static RegistryResult<Block> ruby_chest;
    public static RegistryResult<Block> MACHINE_BLOCK;
    public static RegistryResult<Block> crushing_machine;


    public static void Registry() {
        ruby_block = registry.registerBlock(id("ruby_block"), () -> new ExtendBlock(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(5.0F, 6.0F)
        ));

        polished_ruby_block = registry.registerBlock(id("polished_ruby_block"), () -> new ExtendBlock(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(3.5F, 6.0F)
        ));

       ruby_ore = registry.registerBlock(id("ruby_ore"), () -> new Rubyore(CompatibleBlockSettings.of(CompatibleMaterial.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(3.5F)
        ));

      ruby_chest = registry.registerBlock(id("ruby_chest"), () -> new Rubychest(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(3.0F,6.0F)
        ));

        MACHINE_BLOCK = registry.registerBlock(id("machine_block"), () -> new ExtendBlock(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(3.5F, 6.0F)
        ));
        crushing_machine = registry.registerBlock(id("crushing_machine0"), () -> new crushing_machine(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(3.0F)
        ));
    }
}
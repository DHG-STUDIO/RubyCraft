package com.ptk671.rubycraft;

import com.ptk671.rubycraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.CompatibleMaterial;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;

public class Blocks {

    public static RegistryResult<Block> RUBY_BLOCK;
    public static RegistryResult<Block> POLISHED_RUBY_BLOCK;
    public static RegistryResult<Block> RUBY_ORE;
    public static RegistryResult<Block> RUBY_CHEST;
    public static RegistryResult<Block> MACHINE_BLOCK;
    public static RegistryResult<Block> CRUSHING_MACHINE;
    public static RegistryResult<Block> RUBY_STORAGE;
    public static RegistryResult<Block> RUBY_STORAGE_MK2;
    public static RegistryResult<Block> RUBY_STORAGE_MK3;

    public static void registry() {

        RUBY_BLOCK = registry.registerBlock(id("ruby_block"), () -> new ExtendBlock(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(5.0F, 6.0F)
        ));

        POLISHED_RUBY_BLOCK = registry.registerBlock(id("polished_ruby_block"), () -> new ExtendBlock(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(3.5F, 6.0F)
        ));

        RUBY_ORE = registry.registerBlock(id("ruby_ore"), () -> new RubyOre(CompatibleBlockSettings.of(CompatibleMaterial.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(3.5F)
        ));

        RUBY_CHEST = registry.registerBlock(id("ruby_chest"), () -> new RubyChest(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(3.0F, 6.0F)
        ));

        MACHINE_BLOCK = registry.registerBlock(id("machine_block"), () -> new ExtendBlock(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(3.5F, 6.0F)
        ));

        CRUSHING_MACHINE = registry.registerBlock(id("crushing_machine0"), () -> new CrushingMachine(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(3.0F)
        ));

        RUBY_STORAGE = registry.registerBlock(id("ruby_storage"), () -> new RubyStorage(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(3.5F, 6.0F)
                .nonOpaque()
        ));

        RUBY_STORAGE_MK2 = registry.registerBlock(id("ruby_storage_mk2"), () -> new RubyStorageMk2(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(3.5F, 6.0F)
                .nonOpaque()
        ));


        RUBY_STORAGE_MK3 = registry.registerBlock(id("ruby_storage_mk3"), () -> new RubyStorageMk3(CompatibleBlockSettings.of(CompatibleMaterial.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(3.5F, 6.0F)
                .nonOpaque()
        ));

        //ブロックアイテムの登録////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BlockItems.register();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
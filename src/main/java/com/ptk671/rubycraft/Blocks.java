package com.ptk671.rubycraft;

import block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
    //block
    public  static Block ruby_block = new Block(FabricBlockSettings.of
                    (Material.METAL)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL)
            .strength(5.0F,6.0F)


    );



    public  static Block polished_ruby_block = new Block(FabricBlockSettings.of
                    (Material.METAL)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(3.5F,6.0F)

    );



    public  static Block ruby_ore = new Rubyore(FabricBlockSettings.of
                    (Material.METAL)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(3.0F)

    );



    public  static Block ruby_chest = new Rubychest(FabricBlockSettings.of
                    (Material.METAL)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
            .strength(3.0F,6.0F)

    );

    public  static Block MACHINE_BLOCK = new Block(FabricBlockSettings.of
                    (Material.METAL)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
            .strength(3.5F,6.0F)

    );

    public  static Block crushing_machine = new crushing_machine(FabricBlockSettings.of
                    (Material.METAL)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
            .strength(3.0F)

    );




}

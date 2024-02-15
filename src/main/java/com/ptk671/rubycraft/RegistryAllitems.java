package com.ptk671.rubycraft;
import net.minecraft.util.registry.Registry;

import static com.ptk671.rubycraft.BlockItems.*;
import static com.ptk671.rubycraft.Items.*;
import static com.ptk671.rubycraft.Blocks.*;
import static com.ptk671.rubycraft.Rubycraft.id;

public class RegistryAllitems {
    public static void register() {
        //blocks

        Registry.register(Registry.BLOCK, id( "polished_ruby_block"), polished_ruby_block);
        Registry.register(Registry.BLOCK, id( "ruby_ore"), ruby_ore);
        Registry.register(Registry.BLOCK, id( "ruby_chest"), ruby_chest);
        Registry.register(Registry.BLOCK, id( "machine_block"), MACHINE_BLOCK);
        Registry.register(Registry.BLOCK, id( "crushing_machine0"), crushing_machine);
        //items
        Registry.register(Registry.ITEM, id( "ruby"), Ruby);
        Registry.register(Registry.ITEM, id( "ruby_block"), ruby_block_item);
        Registry.register(Registry.ITEM, id( "polished_ruby_block"), polished_ruby_block_item);
        Registry.register(Registry.ITEM, id( "ruby_ore"), ruby_ore_item);
        Registry.register(Registry.ITEM, id( "ruby_dust"), RubyDust);
        Registry.register(Registry.ITEM, id( "saw_dust"), saw_dust);
        Registry.register(Registry.ITEM, id( "ruby_ingot"),Rubyingot);
        Registry.register(Registry.ITEM, id( "ruby_nugget"), Rubynuget);
        Registry.register(Registry.ITEM, id( "ruby_pearl"), Rubypearl);
        Registry.register(Registry.ITEM, id( "ruby_apple"), Rubyapple);
        Registry.register(Registry.ITEM, id( "ruby_cane"), Rubycane);
        Registry.register(Registry.ITEM, id( "ruby_sword"), Rubysword);
        Registry.register(Registry.ITEM, id( "ruby_axe"), Rubyaxe);
        Registry.register(Registry.ITEM, id( "ruby_pickaxe"), Rubypickaxe);
        Registry.register(Registry.ITEM, id( "ruby_shovel"), RubyShovel);
        Registry.register(Registry.ITEM, id( "ruby_hoe"), RubyHoe);
        Registry.register(Registry.ITEM, id( "ruby_helmet"), RubyHelmet);
        Registry.register(Registry.ITEM, id( "ruby_chestplate"), RubyChestplate);
        Registry.register(Registry.ITEM, id( "ruby_leggings"), RubyLEGGINS);
        Registry.register(Registry.ITEM, id( "ruby_boots"), RubyBOOTS);
        Registry.register(Registry.ITEM, id( "ruby_chest"), ruby_chest_item);
        Registry.register(Registry.ITEM, id( "ruby_gear"), Rubygear);
        Registry.register(Registry.ITEM, id( "machine_block"), machine_block_item);
        Registry.register(Registry.ITEM, id( "crushing_machine0"), crushing_machine_item);
    }

}


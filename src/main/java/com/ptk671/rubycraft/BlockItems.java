package com.ptk671.rubycraft;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.ExtendSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static com.ptk671.rubycraft.Rubycraft.id;
import static com.ptk671.rubycraft.Rubycraft.registry;
import static com.ptk671.rubycraft.itemgroup.RubyCraftMenu.rubycraft_menu;

public class BlockItems {
    //blockitem
    public static RegistryResult<Item> ruby_block_item;
    public static RegistryResult<Item> polished_ruby_block_item;
    public static RegistryResult<Item> ruby_ore_item;
    public static RegistryResult<Item> ruby_chest_item;
    public static RegistryResult<Item> machine_block_item;
    public static RegistryResult<Item> crushing_machine_item;

    public static void register() {
        ruby_block_item = registry.registerItem(id("ruby_block"), () -> new BlockItem(Blocks.ruby_block.get(), new ExtendSettings().group(rubycraft_menu)));
        polished_ruby_block_item = registry.registerItem(id("polished_ruby_block"), () -> new BlockItem(Blocks.polished_ruby_block.get(), new ExtendSettings().group(rubycraft_menu)));
        ruby_ore_item = registry.registerItem(id("ruby_ore"), () -> new BlockItem(Blocks.ruby_ore.get(), new ExtendSettings().group(rubycraft_menu)));
        ruby_chest_item = registry.registerItem(id("ruby_chest"), () -> new BlockItem(Blocks.ruby_chest.get(), new ExtendSettings().group(rubycraft_menu)));
        machine_block_item = registry.registerItem(id("machine_block"), () -> new BlockItem(Blocks.MACHINE_BLOCK.get(), new ExtendSettings().group(rubycraft_menu)));
        crushing_machine_item = registry.registerItem(id("crushing_machine"), () -> new BlockItem(Blocks.crushing_machine.get(), new ExtendSettings().group(rubycraft_menu)));
    }
}

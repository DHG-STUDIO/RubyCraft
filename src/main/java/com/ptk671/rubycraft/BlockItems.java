package com.ptk671.rubycraft;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static itemgroup.RubyCraftMenu.rubycraft_menu;

public class BlockItems {
    //blockitem
    public  static Item ruby_block_item = new BlockItem(Blocks.ruby_block,new Item.Settings().group(rubycraft_menu));
    public  static Item polished_ruby_block_item = new BlockItem(Blocks.polished_ruby_block,new Item.Settings().group(rubycraft_menu));
    public  static Item ruby_ore_item = new BlockItem(Blocks.ruby_ore,new Item.Settings().group(rubycraft_menu));
    public  static Item ruby_chest_item = new BlockItem(Blocks.ruby_chest,new Item.Settings().group(rubycraft_menu));
    public  static Item machine_block_item = new BlockItem(Blocks.MACHINE_BLOCK,new Item.Settings().group(rubycraft_menu));
    public  static Item crushing_machine_item = new BlockItem(Blocks.crushing_machine,new Item.Settings().group(rubycraft_menu));


}

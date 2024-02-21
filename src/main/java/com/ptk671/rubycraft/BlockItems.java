package com.ptk671.rubycraft;

import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.ItemUtil;

import static com.ptk671.rubycraft.RubyCraft.*;
import static com.ptk671.rubycraft.itemgroup.CreativeTabs.RUBY_CRAFT_CREATIVE_TAB;

public class BlockItems {
    //blockitem
    public static RegistryResult<Item> RUBY_BLOCK_ITEM;
    public static RegistryResult<Item> POLISHED_RUBY_BLOCK_ITEM;
    public static RegistryResult<Item> RUBY_ORE_ITEM;
    public static RegistryResult<Item> RUBY_CHEST_ITEM;
    public static RegistryResult<Item> MACHINE_BLOCK_ITEM;
    public static RegistryResult<Item> CRUSHING_MACHINE_ITEM;
    public static RegistryResult<Item> RUBY_STORAGE_ITEM;
    public static RegistryResult<Item> RUBY_STORAGE_MK2_ITEM;
    public static RegistryResult<Item> RUBY_STORAGE_MK3_ITEM;
    public static void register() {
        RUBY_BLOCK_ITEM = registry.registerItem(id("ruby_block"), () -> ItemUtil.ofBlock(Blocks.RUBY_BLOCK.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_block"))));
        POLISHED_RUBY_BLOCK_ITEM = registry.registerItem(id("polished_ruby_block"), () -> ItemUtil.ofBlock(Blocks.POLISHED_RUBY_BLOCK.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("polished_ruby_block"))));
        RUBY_ORE_ITEM = registry.registerItem(id("ruby_ore"), () -> ItemUtil.ofBlock(Blocks.RUBY_ORE.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_ore"))));
        RUBY_CHEST_ITEM = registry.registerItem(id("ruby_chest"), () -> ItemUtil.ofBlock(Blocks.RUBY_CHEST.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_chest"))));
        MACHINE_BLOCK_ITEM = registry.registerItem(id("machine_block"), () -> ItemUtil.ofBlock(Blocks.MACHINE_BLOCK.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("machine_block"))));
        CRUSHING_MACHINE_ITEM = registry.registerItem(id("crushing_machine"), () -> ItemUtil.ofBlock(Blocks.CRUSHING_MACHINE.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("crushing_machine"))));
        RUBY_STORAGE_ITEM = registry.registerItem(id("ruby_storage"), () -> ItemUtil.ofBlock(Blocks.RUBY_STORAGE.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_storage"))));
        RUBY_STORAGE_MK2_ITEM = registry.registerItem(id("ruby_storage_mk2"), () -> ItemUtil.ofBlock(Blocks.RUBY_STORAGE_MK2.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_storage_mk2"))));
        RUBY_STORAGE_MK3_ITEM = registry.registerItem(id("ruby_storage_mk3"), () -> ItemUtil.ofBlock(Blocks.RUBY_STORAGE_MK3.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_storage_mk3"))));
    }
}

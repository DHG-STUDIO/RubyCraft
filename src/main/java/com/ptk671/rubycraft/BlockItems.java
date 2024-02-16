package com.ptk671.rubycraft;

import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.ItemUtil;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;
import static com.ptk671.rubycraft.itemgroup.CreativeTabs.RUBY_CRAFT_CREATIVE_TAB;

public class BlockItems {
    //blockitem
    public static RegistryResult<Item> ruby_block_item;
    public static RegistryResult<Item> polished_ruby_block_item;
    public static RegistryResult<Item> ruby_ore_item;
    public static RegistryResult<Item> ruby_chest_item;
    public static RegistryResult<Item> machine_block_item;
    public static RegistryResult<Item> crushing_machine_item;

    public static void register() {
        ruby_block_item = registry.registerItem(id("ruby_block"), () -> ItemUtil.ofBlock(Blocks.RUBY_BLOCK.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_block"))));
        polished_ruby_block_item = registry.registerItem(id("polished_ruby_block"), () -> ItemUtil.ofBlock(Blocks.POLISHED_RUBY_BLOCK.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("polished_ruby_block"))));
        ruby_ore_item = registry.registerItem(id("ruby_ore"), () -> ItemUtil.ofBlock(Blocks.RUBY_ORE.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_ore"))));
        ruby_chest_item = registry.registerItem(id("ruby_chest"), () -> ItemUtil.ofBlock(Blocks.RUBY_CHEST.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_chest"))));
        machine_block_item = registry.registerItem(id("machine_block"), () -> ItemUtil.ofBlock(Blocks.MACHINE_BLOCK.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("machine_block"))));
        crushing_machine_item = registry.registerItem(id("crushing_machine"), () -> ItemUtil.ofBlock(Blocks.CRUSHING_MACHINE.get(), new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("crushing_machine"))));
    }
}

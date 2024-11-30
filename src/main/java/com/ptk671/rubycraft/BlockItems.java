package com.ptk671.rubycraft;

import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.v2.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.item.ItemUtil;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;
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
        RUBY_BLOCK_ITEM = registry.registerItem(id("ruby_block"), () -> ItemUtil.create(Blocks.RUBY_BLOCK.get(), new CompatibleItemSettings(id("ruby_block")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        POLISHED_RUBY_BLOCK_ITEM = registry.registerItem(id("polished_ruby_block"), () -> ItemUtil.create(Blocks.POLISHED_RUBY_BLOCK.get(), new CompatibleItemSettings(id("polished_ruby_block")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_ORE_ITEM = registry.registerItem(id("ruby_ore"), () -> ItemUtil.create(Blocks.RUBY_ORE.get(), new CompatibleItemSettings(id("ruby_ore")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_CHEST_ITEM = registry.registerItem(id("ruby_chest"), () -> ItemUtil.create(Blocks.RUBY_CHEST.get(), new CompatibleItemSettings(id("ruby_chest")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        MACHINE_BLOCK_ITEM = registry.registerItem(id("machine_block"), () -> ItemUtil.create(Blocks.MACHINE_BLOCK.get(), new CompatibleItemSettings(id("machine_block")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        CRUSHING_MACHINE_ITEM = registry.registerItem(id("crushing_machine"), () -> ItemUtil.create(Blocks.CRUSHING_MACHINE.get(), new CompatibleItemSettings(id("crushing_machine")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_STORAGE_ITEM = registry.registerItem(id("ruby_storage"), () -> ItemUtil.create(Blocks.RUBY_STORAGE.get(), new CompatibleItemSettings(id("ruby_storage")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_STORAGE_MK2_ITEM = registry.registerItem(id("ruby_storage_mk2"), () -> ItemUtil.create(Blocks.RUBY_STORAGE_MK2.get(), new CompatibleItemSettings(id("ruby_storage_mk2")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_STORAGE_MK3_ITEM = registry.registerItem(id("ruby_storage_mk3"), () -> ItemUtil.create(Blocks.RUBY_STORAGE_MK3.get(), new CompatibleItemSettings(id("ruby_storage_mk3")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
    }
}

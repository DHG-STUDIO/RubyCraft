package com.ptk671.rubycraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.item.*;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.ItemUtil;

import static com.ptk671.rubycraft.RubyCraft.MOD_ID;

public class EasyMCPitanlib {

    //Easy MCPitanlib 1.1.0
    public static Identifier id(String patch) {
        return new Identifier(MOD_ID, patch);
    }
    //AddRegistry///////////////////////////////////////////////////////////////////////////////////////////////////////


    //AddItem
    public static RegistryResult<Item> addItem(String itemid, CompatibleItemSettings compatibleItemSettings)
    {
        RegistryResult<Item> item =  registry.registerItem(id(itemid), () -> new ExtendItem(compatibleItemSettings));
        return item;
    }

    //AddBlock
    public static RegistryResult<Block> addBlock(String blockid, CompatibleBlockSettings compatibleBlockSettings)
    {
        RegistryResult<Block> block = registry.registerBlock(id(blockid), () -> new  ExtendBlock(compatibleBlockSettings));
        return block;
    }

    //AddBlockItem
    public static RegistryResult<Item> addBlockItem(RegistryResult<Block> blockSupplier, String itemid, CompatibleItemSettings compatibleItemSettings)
    {

        RegistryResult<Item> blockItem =  registry.registerItem(id(itemid), () -> ItemUtil.ofBlock(blockSupplier.getOrNull(), compatibleItemSettings));
        return blockItem;
    }

    //AddCreativeTAB
    public static CreativeTabBuilder addCreativeTab(String tabid)
    {
        CreativeTabBuilder creativeTab = CreativeTabBuilder.create(id(tabid));
        registry.registerItemGroup(creativeTab.getIdentifier(), creativeTab);
        return creativeTab;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    //EasyRegistry//////////////////////////////////////////////////////////////////////////////////////////////////////

    public static CompatRegistry registry = CompatRegistry.createRegistry(MOD_ID);
    //Easy Item
    @Deprecated
    public static RegistryResult<Item> easyItem(String itemid, CreativeTabBuilder tab)
    {
        RegistryResult<Item> item =  registry.registerItem(id(itemid), () -> new ExtendItem(new CompatibleItemSettings().addGroup(tab)));
        return item;
    }

    //EasyBlockItem
    @Deprecated
    public static RegistryResult<Item> easyBlockItem(RegistryResult<Block> blockSupplier, String itemid,CreativeTabBuilder creativeTabBuilder)
    {
        RegistryResult<Item> blockItem =  registry.registerItem(id(itemid), () -> ItemUtil.ofBlock(blockSupplier.getOrNull(), new CompatibleItemSettings().addGroup(creativeTabBuilder)));
        return blockItem;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
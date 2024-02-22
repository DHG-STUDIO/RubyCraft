package com.ptk671.rubycraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraft.item.ItemStack;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.CreativeTabBuilder;
import net.pitan76.mcpitanlib.api.item.CreativeTabManager;
import net.pitan76.mcpitanlib.api.item.ExtendItem;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.ItemUtil;

import static com.ptk671.rubycraft.RubyCraft.*;
import static com.ptk671.rubycraft.RubyCraft.registry;

public class EasyRegistry {
    public static CompatRegistry registry = CompatRegistry.createRegistry(MOD_ID);
    //Easy Item
    public static RegistryResult<Item> easyItem(String itemid, CreativeTabBuilder tab)
    {
        RegistryResult<Item> item =  registry.registerItem(id(itemid), () -> new ExtendItem(new CompatibleItemSettings().addGroup(tab)));
        return item;
    }
    //Easy Block
    public static RegistryResult<Block> easyBlock(String blockid,CompatibleBlockSettings compatibleBlockSettings)
    {
        RegistryResult<Block> block =   registry.registerBlock(id(blockid), () -> new ExtendBlock(compatibleBlockSettings));
        return block;
    }


    //Easy BlockItem
    public static RegistryResult<Item> easyBlockItem(Block block,String itemid,CreativeTabBuilder tab)
    {
        RegistryResult<Item> blockItem =  registry.registerItem(id(itemid), () -> ItemUtil.ofBlock(block, new CompatibleItemSettings().addGroup(tab)));
        return blockItem;
    }

    //Easy Creative tab
   /* public static CreativeTabBuilder easyCreativeTab(String tabid, Item item)
    {
CreativeTabBuilder creativeTabBuilder = CreativeTabBuilder.create(id(tabid)
).setIcon(() -> new ItemStack(item));
        registry.registerItemGroup(creativeTabBuilder.getIdentifier(), creativeTabBuilder);
        return creativeTabBuilder;
    }*/
}

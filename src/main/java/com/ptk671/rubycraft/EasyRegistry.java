package com.ptk671.rubycraft;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;

import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.CreativeTabBuilder;
import net.pitan76.mcpitanlib.api.item.ExtendItem;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.ItemUtil;

import static com.ptk671.rubycraft.RubyCraft.MOD_ID;
import static com.ptk671.rubycraft.RubyCraft.id;

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
    public static CreativeTabBuilder easyCreativeTab(String tabid)
    {
CreativeTabBuilder creativeTab = CreativeTabBuilder.create(id(tabid));
        registry.registerItemGroup(creativeTab.getIdentifier(), creativeTab);
        return creativeTab;
    }
  //  TODO: MCPitanLibでBlockRenderLayerMapが作成されたら変更する
    //Easy Block Render Layers
    public static void easyBlockRenderLayers(Block block)
    {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }
}
package com.ptk671.rubycraft.item;

import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.ExtendItem;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;
import static com.ptk671.rubycraft.itemgroup.CreativeTabs.RUBY_CRAFT_CREATIVE_TAB;

public class EasyAdditem {
    public static void itemRegistry(RegistryResult<Item>item , String itemid)
    {
      item = registry.registerItem(id(itemid), () -> new ExtendItem(new CompatibleItemSettings().addGroup(RUBY_CRAFT_CREATIVE_TAB)));
    }
}

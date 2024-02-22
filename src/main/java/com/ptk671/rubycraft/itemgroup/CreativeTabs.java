package com.ptk671.rubycraft.itemgroup;

import com.ptk671.rubycraft.Items;
import net.minecraft.item.ItemStack;
import net.pitan76.mcpitanlib.api.item.CreativeTabBuilder;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;

public class CreativeTabs {
    public static CreativeTabBuilder RUBY_CRAFT_CREATIVE_TAB = CreativeTabBuilder
            .create(id("all"))
            .setIcon(() -> new ItemStack(Items.RUBY.getOrNull()));;

    public static void register() {
        registry.registerItemGroup(RUBY_CRAFT_CREATIVE_TAB.getIdentifier(), RUBY_CRAFT_CREATIVE_TAB);
    }
}
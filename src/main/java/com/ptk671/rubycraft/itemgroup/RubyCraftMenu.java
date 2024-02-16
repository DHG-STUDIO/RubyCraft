package com.ptk671.rubycraft.itemgroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.pitan76.mcpitanlib.api.item.CreativeTabBuilder;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;

import static com.ptk671.rubycraft.Items.Ruby;
import static com.ptk671.rubycraft.Rubycraft.MOD_ID;
import static com.ptk671.rubycraft.Rubycraft.id;


public class RubyCraftMenu {

    public static CompatRegistry registry = CompatRegistry.createRegistry(MOD_ID);

    public static ItemGroup rubycraft_menu = CreativeTabBuilder.create(id("all")).setIcon(() -> new ItemStack(Ruby.getOrNull(), 1)).build();
    public static void register() {

        registry.registerItemGroup(id("all"), () -> rubycraft_menu);

    }
}
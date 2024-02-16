package com.ptk671.rubycraft.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static com.ptk671.rubycraft.Items.Ruby;
import static com.ptk671.rubycraft.Rubycraft.id;


public class RubyCraftMenu {
    public static ItemGroup rubycraft_menu;

    public static void register() {
        rubycraft_menu = FabricItemGroupBuilder.build(
                id("all"),
                () -> new ItemStack(Ruby.getOrNull())
        );
    }
}
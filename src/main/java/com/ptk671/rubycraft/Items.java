package com.ptk671.rubycraft;
import item.*;
import itemgroup.RubyCraftMenu;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pitan76.mcpitanlib.api.item.CompatibleArmorMaterial;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.DefaultItemGroups;
import net.pitan76.mcpitanlib.api.item.ExtendItem;
import net.pitan76.mcpitanlib.api.item.tool.*;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static itemgroup.RubyCraftMenu.rubycraft_menu;
import static net.pitan76.mcpitanlib.MCPitanLib.id;
import static net.pitan76.mcpitanlib.MCPitanLib.registry;


public class Items {
    //
    public static RegistryResult<Item> Ruby;
    public static RegistryResult<Item> RubyDust;
    public static RegistryResult<Item> Rubyingot;
    public static RegistryResult<Item> Rubynuget;
    public static RegistryResult<Item> Rubypearl;
    public static RegistryResult<Item> Rubyapple;
    public static RegistryResult<Item> Rubycane;
    public static RegistryResult<Item> Rubygear;
    public static RegistryResult<Item> saw_dust;
//

    public static RubyArmorMaterial Armor_MATERIAL = new RubyArmorMaterial();
    public static RubyToolMaterial TOOL_MATERIAL = new RubyToolMaterial();
//
    public static RegistryResult<Item> Rubysword;

    public static RegistryResult <Item> Rubyaxe;
    public static RegistryResult <Item> Rubypickaxe;
    public static RegistryResult <Item> RubyShovel;
    public static RegistryResult <Item> RubyHoe;

    //
    public static RegistryResult <ArmorItem> RubyHelmet;
    public static RegistryResult <ArmorItem> RubyChestplate;
    public static RegistryResult <ArmorItem> RubyLEGGINS;
    public static RegistryResult <ArmorItem> RubyBOOTS;




public static void Registry()
{
    Ruby = registry.registerItem(id("ruby"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby"))));
    RubyDust = registry.registerItem(id("ruby_dust"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_dust"))));
    Rubynuget = registry.registerItem(id("ruby_nugget"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_nugget"))));
    Rubypearl = registry.registerItem(id("ruby_pearl"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_pearl"))));



    Rubyapple = registry.registerItem(id("ruby_apple"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_apple")).food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(5F)
                    .build()
            )));



    Rubyingot = registry.registerItem(id("ruby_ingot"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_ingot"))));
    Rubycane = registry.registerItem(id("ruby_cane"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_cane")).maxCount(1)));
    Rubygear = registry.registerItem(id("ruby_gear"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_gear"))));
    saw_dust = registry.registerItem(id("saw_dust"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("saw_dust"))));

    //TOOLS

    Rubysword = registry.registerItem(id("ruby_sword"), () -> new CompatibleSwordItem(3, -1.0F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_sword"))));
    Rubyaxe = registry.registerItem(id("ruby_axe"), () -> new CompatibleAxeItem(1, -1F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_axe"))));
    Rubypickaxe = registry.registerItem(id("ruby_pickaxe"), () -> new CompatiblePickaxeItem(1, -2.5F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_pickaxe"))));
    RubyShovel= registry.registerItem(id("ruby_shovel"), () -> new CompatibleShovelItem(1F, -3.0F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_shovel"))));
    RubyHoe = registry.registerItem(id("ruby_hoe"), () -> new CompatibleHoeItem(0, -3.0F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_hoe"))));

//armors

  //  RubyHelmet = registry.registerItem(id("ruby_helmet"), () -> new RubyArmorMaterial(EquipmentSlot.HEAD,  new CompatibleItemSettings().addGroup(() -> rubycraft_menu, id("ruby_helmet"))));



}




    //TOOL




    //armor

   /* public static Item RubyHelmet = new ArmorItem(Armor_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(rubycraft_menu));
    public static Item RubyChestplate = new ArmorItem(Armor_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(rubycraft_menu));
    public static Item RubyLEGGINS = new ArmorItem(Armor_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(rubycraft_menu));
    public static Item RubyBOOTS = new ArmorItem(Armor_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(rubycraft_menu));


*/


}
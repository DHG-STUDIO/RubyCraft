package com.ptk671.rubycraft;
import item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static itemgroup.RubyCraftMenu.rubycraft_menu;


public class Items {


    //item
    public static Item Ruby = new Ruby(new Item.Settings().group(rubycraft_menu));
    public static Item RubyDust = new RubyDust(new Item.Settings().group(rubycraft_menu));
    public static Item Rubyingot = new Rubyingot(new Item.Settings().group(rubycraft_menu));
    public static Item Rubynuget = new Rubynuget(new Item.Settings().group(rubycraft_menu));
    public static Item Rubypearl = new RubyPearl(new Item.Settings().group(rubycraft_menu));
    public static Item Rubyapple = new RubyApple(new Item.Settings().food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(5F)
                    .build())
                    .group(rubycraft_menu));
    public static Item Rubycane = new RubyCane(new Item.Settings().group(rubycraft_menu).maxCount(1));
    public static Item Rubygear = new Rubygear(new Item.Settings().group(rubycraft_menu));
    public static Item saw_dust = new Item(new Item.Settings().group(rubycraft_menu));



    //TOOL
    public static RubyToolMaterial TOOL_MATERIAL = new RubyToolMaterial();
    public static Item Rubysword = new SwordItem(TOOL_MATERIAL, 3, -1.0F, new Item.Settings().group(rubycraft_menu));
    public static Item Rubyaxe = new CustomAxeItem(TOOL_MATERIAL, 1, -1F, new Item.Settings().group(rubycraft_menu));
    public static Item Rubypickaxe = new CustomPickaxeItem(TOOL_MATERIAL, 1, -2.5F, new Item.Settings().group(rubycraft_menu));
    public static Item RubyShovel = new CustomShovel(TOOL_MATERIAL, 1F, -3.0F, new Item.Settings().group(rubycraft_menu));
    public static Item RubyHoe = new CustomHoe(TOOL_MATERIAL, 0, -3.0F, new Item.Settings().group(rubycraft_menu));

    //armor
    public static RubyArmorMaterial Armor_MATERIAL = new RubyArmorMaterial();
    public static Item RubyHelmet = new ArmorItem(Armor_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(rubycraft_menu));
    public static Item RubyChestplate = new ArmorItem(Armor_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(rubycraft_menu));
    public static Item RubyLEGGINS = new ArmorItem(Armor_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(rubycraft_menu));
    public static Item RubyBOOTS = new ArmorItem(Armor_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(rubycraft_menu));





}
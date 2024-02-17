package com.ptk671.rubycraft;

import com.ptk671.rubycraft.item.*;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.ArmorEquipmentType;
import net.pitan76.mcpitanlib.api.item.CompatibleArmorItem;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.ExtendItem;
import net.pitan76.mcpitanlib.api.item.tool.*;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static com.ptk671.rubycraft.ArmorToolMaterials.ARMOR_MATERIAL;
import static com.ptk671.rubycraft.ArmorToolMaterials.TOOL_MATERIAL;
import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;
import static com.ptk671.rubycraft.itemgroup.CreativeTabs.RUBY_CRAFT_CREATIVE_TAB;

public class Items {
    // en: Materials , ja: 材料
    public static RegistryResult<Item> RUBY;
    public static RegistryResult<Item> RUBY_DUST;
    public static RegistryResult<Item> RUBY_INGOT;
    public static RegistryResult<Item> RUBY_NUGET;
    public static RegistryResult<Item> RUBY_PEARL;
    public static RegistryResult<Item> RUBY_APPLE;
    public static RegistryResult<Item> RUBY_CANE;
    public static RegistryResult<Item> RUBY_GEAR;
    public static RegistryResult<Item> SAW_DUST;


    // en: Tools , ja: ツール
    public static RegistryResult<Item> RUBY_SWORD;
    public static RegistryResult<Item> RUBY_AXE;
    public static RegistryResult<Item> RUBY_PICKAXE;
    public static RegistryResult<Item> RUBY_SHOVEL;
    public static RegistryResult<Item> RUBY_HOE;

    // en: Armor , ja: 防具
    public static RegistryResult<Item> RUBY_HELMET;
    public static RegistryResult<Item> RUBY_CHESTPLATE;
    public static RegistryResult<Item> RUBY_LEGGINGS;
    public static RegistryResult<Item> RUBY_BOOTS;

    public static void Registry() {
        //Items
        RUBY = registry.registerItem(id("ruby"), () -> new Ruby(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby"))));
        RUBY_DUST = registry.registerItem(id("ruby_dust"), () -> new RubyDust(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_dust"))));
        RUBY_NUGET = registry.registerItem(id("ruby_nugget"), () -> new RubyNugget(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_nugget"))));
        RUBY_PEARL = registry.registerItem(id("ruby_pearl"), () -> new RubyPearl(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_pearl"))));
        RUBY_APPLE = registry.registerItem(id("ruby_apple"), () -> new RubyApple(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_apple")).food(new FoodComponent.Builder()
                .hunger(6)
                .saturationModifier(5F)
                .build()
        )));
        RUBY_INGOT = registry.registerItem(id("ruby_ingot"), () -> new RubyIngot(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_ingot"))));
        RUBY_CANE = registry.registerItem(id("ruby_cane"), () -> new RubyCane(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_cane")).maxCount(1)));
        RUBY_GEAR = registry.registerItem(id("ruby_gear"), () -> new RubyGear(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_gear"))));
        SAW_DUST = registry.registerItem(id("saw_dust"), () -> new ExtendItem(new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("saw_dust"))));

        //TOOLS
        RUBY_SWORD = registry.registerItem(id("ruby_sword"), () -> new CompatibleSwordItem(3, -1.0F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_sword"))));
        RUBY_AXE = registry.registerItem(id("ruby_axe"), () -> new CompatibleAxeItem(1, -1F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_axe"))));
        RUBY_PICKAXE = registry.registerItem(id("ruby_pickaxe"), () -> new CompatiblePickaxeItem(1, -2.5F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_pickaxe"))));
        RUBY_SHOVEL = registry.registerItem(id("ruby_shovel"), () -> new CompatibleShovelItem(1F, -3.0F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_shovel"))));
        RUBY_HOE = registry.registerItem(id("ruby_hoe"), () -> new CompatibleHoeItem(0, -3.0F, TOOL_MATERIAL, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_hoe"))));

        //armors
        RUBY_HELMET = registry.registerItem(id("ruby_helmet"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.HEAD, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_helmet"))));
        RUBY_CHESTPLATE = registry.registerItem(id("ruby_chestplate"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.CHEST, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_chestplate"))));
        RUBY_LEGGINGS = registry.registerItem(id("ruby_leggings"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.LEGS, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_leggings"))));
        RUBY_BOOTS = registry.registerItem(id("ruby_boots"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.FEET, new CompatibleItemSettings().addGroup(() -> RUBY_CRAFT_CREATIVE_TAB, id("ruby_boots"))));
    }
}
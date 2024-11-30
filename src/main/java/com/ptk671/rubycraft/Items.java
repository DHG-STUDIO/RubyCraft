package com.ptk671.rubycraft;

import com.ptk671.rubycraft.item.*;
import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.ArmorEquipmentType;
import net.pitan76.mcpitanlib.api.item.CompatFoodComponent;
import net.pitan76.mcpitanlib.api.item.CompatibleArmorItem;
import net.pitan76.mcpitanlib.api.item.ExtendItem;
import net.pitan76.mcpitanlib.api.item.tool.*;
import net.pitan76.mcpitanlib.api.item.v2.CompatibleItemSettings;
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

    public static void registry() {
        //Items
        RUBY = registry.registerItem(id("ruby"), () -> new Ruby(new CompatibleItemSettings(id("ruby")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_DUST = registry.registerItem(id("ruby_dust"), () -> new RubyDust(new CompatibleItemSettings(id("ruby_dust")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_NUGET = registry.registerItem(id("ruby_nugget"), () -> new RubyNugget(new CompatibleItemSettings(id("ruby_nugget")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_PEARL = registry.registerItem(id("ruby_pearl"), () -> new RubyPearl(new CompatibleItemSettings(id("ruby_pearl")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_APPLE = registry.registerItem(id("ruby_apple"), () -> new RubyApple(new CompatibleItemSettings(id("ruby_apple"))
                .addGroup(RUBY_CRAFT_CREATIVE_TAB)
                .food(new CompatFoodComponent()
                        .setHunger(6)
                        .setSaturation(5F)
                )
        ));

        RUBY_INGOT = registry.registerItem(id("ruby_ingot"), () -> new RubyIngot(new CompatibleItemSettings(id("ruby_ingot")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_CANE = registry.registerItem(id("ruby_cane"), () -> new RubyCane(new CompatibleItemSettings(id("ruby_cane")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_GEAR = registry.registerItem(id("ruby_gear"), () -> new RubyGear(new CompatibleItemSettings(id("ruby_gear")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        SAW_DUST = registry.registerItem(id("saw_dust"), () -> new ExtendItem(new CompatibleItemSettings(id("saw_dust")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));

        //TOOLS
        RUBY_SWORD = registry.registerItem(id("ruby_sword"), () -> new CompatibleSwordItem(TOOL_MATERIAL, 3, -1.0F, new CompatibleItemSettings(id("ruby_sword")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_AXE = registry.registerItem(id("ruby_axe"), () -> new CompatibleAxeItem(TOOL_MATERIAL, 1, -1.0F, new CompatibleItemSettings(id("ruby_axe")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_PICKAXE = registry.registerItem(id("ruby_pickaxe"), () -> new CompatiblePickaxeItem(TOOL_MATERIAL, 1, -2.5F, new CompatibleItemSettings(id("ruby_pickaxe")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_SHOVEL = registry.registerItem(id("ruby_shovel"), () -> new CompatibleShovelItem(TOOL_MATERIAL, 1.5F, -3.0F, new CompatibleItemSettings(id("ruby_shovel")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_HOE = registry.registerItem(id("ruby_hoe"), () -> new CompatibleHoeItem(TOOL_MATERIAL, 0, -3.0F, new CompatibleItemSettings(id("ruby_hoe")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));

        //armors
        RUBY_HELMET = registry.registerItem(id("ruby_helmet"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.HEAD, new CompatibleItemSettings(id("ruby_helmet")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_CHESTPLATE = registry.registerItem(id("ruby_chestplate"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.CHEST, new CompatibleItemSettings(id("ruby_chestplate")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_LEGGINGS = registry.registerItem(id("ruby_leggings"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.LEGS, new CompatibleItemSettings(id("ruby_leggings")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
        RUBY_BOOTS = registry.registerItem(id("ruby_boots"), () -> new CompatibleArmorItem(ARMOR_MATERIAL, ArmorEquipmentType.FEET, new CompatibleItemSettings(id("ruby_boots")).addGroup(RUBY_CRAFT_CREATIVE_TAB)));
    }
}
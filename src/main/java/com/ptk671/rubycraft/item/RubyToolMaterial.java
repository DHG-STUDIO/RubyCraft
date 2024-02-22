package com.ptk671.rubycraft.item;

import com.ptk671.rubycraft.Items;
import net.minecraft.recipe.Ingredient;
import net.pitan76.mcpitanlib.api.item.tool.CompatibleToolMaterial;

public class RubyToolMaterial implements CompatibleToolMaterial {
    //耐久値
    @Override
    public int getCompatDurability() {
        return 1250;
    }

    //採掘速度
    @Override
    public float getCompatMiningSpeedMultiplier() {
        return 8.5F;
    }

    //攻撃力
    @Override
    public float getCompatAttackDamage() {
        return 5F;
    }

    //採掘レベル
    @Override
    public int getCompatMiningLevel() {
        return 3;
    }
    //エンチャント耐性

    @Override
    public int getCompatEnchantability() {
        return 10;
    }

    //金床で修理する時に使うアイテム
    @Override
    public Ingredient getCompatRepairIngredient() {
        return Ingredient.ofItems(() -> Items.RUBY_INGOT.getOrNull());
    }
}

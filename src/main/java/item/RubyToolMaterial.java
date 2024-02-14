package item;

import com.ptk671.rubycraft.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyToolMaterial implements ToolMaterial {
    //耐久値
    @Override
    public int getDurability() {
        return 1250;
    }
//採掘速度
    @Override
    public float getMiningSpeedMultiplier() {
        return 8.5F;
    }
//攻撃力
    @Override
    public float getAttackDamage() {
        return 5F;
    }
//採掘レベル
    @Override
    public int getMiningLevel() {
        return 3;
    }
//エンチャント耐性
    @Override
    public int getEnchantability() {
        return 10;
    }
//金床で修理する時に使うアイテム
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.Rubyingot);
    }
}

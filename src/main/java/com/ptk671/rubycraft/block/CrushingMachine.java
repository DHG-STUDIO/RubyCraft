package com.ptk671.rubycraft.block;

import com.ptk671.rubycraft.item.RubyIngot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.pitan76.mcpitanlib.api.block.v2.CompatBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.event.block.BlockUseEvent;
import net.pitan76.mcpitanlib.api.util.CompatActionResult;
import net.pitan76.mcpitanlib.api.util.TextUtil;
import net.pitan76.mcpitanlib.api.util.item.ItemUtil;

import static com.ptk671.rubycraft.Items.*;

public class CrushingMachine extends CompatBlock {

    int STICK_1 = 1;
    int STICK_2 = 2;
    public CrushingMachine(CompatibleBlockSettings settings) {
        super(settings);
    }

    @Override
    public CompatActionResult onRightClick(BlockUseEvent event) {
        if (event.getWorld().isClient) {
            return CompatActionResult.SUCCESS;
        }

        ItemStack handStack = event.getPlayer().getMainHandStack();

        if (ItemUtil.isInTag(handStack.getItem(), "c:rubies")) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 1));

            return CompatActionResult.SUCCESS;
        }

        if (ItemUtil.isInTag(handStack.getItem(), "c:ruby_blocks")) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 9));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() instanceof RubyIngot) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 1));
            return CompatActionResult.SUCCESS;
        }

        if (ItemUtil.isInTag(handStack.getItem(), "c:ruby_ores")) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 3));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_SWORD.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 1));
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), STICK_1));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_AXE.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 1));
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_PICKAXE.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 1));
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_SHOVEL.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 1));
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_HOE.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 1));
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_HELMET.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_CHESTPLATE.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 4));
            return CompatActionResult.SUCCESS;
        }


        if (handStack.getItem() == RUBY_LEGGINGS.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 3));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_BOOTS.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_GEAR.get()) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(RUBY_DUST.get(), 2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.isIn(ItemTags.PLANKS)) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), 2));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.isIn(ItemTags.LOGS)) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), 8));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == Items.STICK) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), 4));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.isIn(ItemTags.REDSTONE_ORES)) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(Items.REDSTONE, 3));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == Items.REDSTONE_BLOCK) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(Items.REDSTONE, 9));
            return CompatActionResult.SUCCESS;
        }

        if (handStack.getItem() == Items.REDSTONE_TORCH) {
            handStack.setCount(handStack.getCount() - 1);
            event.getPlayer().giveStack(new ItemStack(Items.REDSTONE, 1));
            event.getPlayer().giveStack(new ItemStack(SAW_DUST.get(), STICK_1));
            return CompatActionResult.SUCCESS;
        }

        event.getPlayer().sendMessage(TextUtil.translatable("msg.rubycraft.crushing_machine_error"));
        return CompatActionResult.FAIL;

    }
}
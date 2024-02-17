package com.ptk671.rubycraft.block;

import com.ptk671.rubycraft.item.Ruby;
import com.ptk671.rubycraft.item.RubyIngot;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.util.TextUtil;

import static com.ptk671.rubycraft.BlockItems.RUBY_ORE_ITEM;
import static com.ptk671.rubycraft.Items.*;
public class CrushingMachine extends Block {

    public CrushingMachine(CompatibleBlockSettings settings) {
        super(settings.build());
    }









    int STICK_1 = 4;
    int STICK_2 = 8;

    @Override



    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }


        ItemStack handStack = player.getMainHandStack();


        if (handStack.getItem() instanceof Ruby) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 1));
            return ActionResult.SUCCESS;
        }

        if (handStack.getItem() instanceof RubyIngot) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 1));
            return ActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_ORE_ITEM.get()) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 3));
            return ActionResult.SUCCESS;
        }

        if (handStack.getItem() == RUBY_SWORD.get()) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 2));
            player.giveItemStack(new ItemStack(SAW_DUST.get(), STICK_1));
            return ActionResult.SUCCESS;
        }


        if (handStack.getItem() == RUBY_AXE.get()) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 3));
            player.giveItemStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == RUBY_PICKAXE.get()) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 3));
            player.giveItemStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == RUBY_SHOVEL.get()) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 1));
            player.giveItemStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == RUBY_HOE.get()) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RUBY_DUST.get(), 2));
            player.giveItemStack(new ItemStack(SAW_DUST.get(), STICK_2));
            return ActionResult.SUCCESS;
        }

        if (handStack.isIn(ItemTags.PLANKS)) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(SAW_DUST.get(), 2));
            return ActionResult.SUCCESS;
        }

        if (handStack.isIn(ItemTags.LOGS)) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(SAW_DUST.get(), 8));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == Items.STICK) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(SAW_DUST.get(), 4));
            return ActionResult.SUCCESS;
        }



        player.sendMessage(TextUtil.translatable("msg.rubycraft.crushing_machine_error"), false);
        return ActionResult.FAIL;


    }
}
package block;

import com.ptk671.rubycraft.BlockItems;
import com.ptk671.rubycraft.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;

import static com.ptk671.rubycraft.BlockItems.*;
import static com.ptk671.rubycraft.Items.*;
import static com.ptk671.rubycraft.Blocks.*;
import static net.minecraft.tag.ItemTags.*;

public class crushing_machine extends Block {

    public crushing_machine(CompatibleBlockSettings settings) {
        super(settings.build());
    }



    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,


                              BlockHitResult hit) {
        ItemStack handStack = player.getMainHandStack();



        if (handStack.getItem() == Items.Ruby) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 1));
            return ActionResult.SUCCESS;
        }


        if (handStack.getItem() == Rubyingot) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 1));
            return ActionResult.SUCCESS;
        }



        if (handStack.getItem() == ruby_ore_item) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 3));
            return ActionResult.SUCCESS;
        }

        if (handStack.getItem() == Rubysword) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 2));
            player.giveItemStack(new ItemStack(saw_dust, 1));
            return ActionResult.SUCCESS;
        }

        if (handStack.getItem() == Rubyaxe) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 3));
            player.giveItemStack(new ItemStack(saw_dust, 2));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == Rubypickaxe) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 3));
            player.giveItemStack(new ItemStack(saw_dust, 2));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == RubyShovel) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 1));
            player.giveItemStack(new ItemStack(saw_dust, 2));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == RubyHoe) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 2));
            player.giveItemStack(new ItemStack(saw_dust, 2));
            return ActionResult.SUCCESS;
        }


        if (handStack.getItem() == net.minecraft.item.Items.OAK_PLANKS) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(saw_dust, 2));
            return ActionResult.SUCCESS;
        }
        if (!world.isClient)

        player.sendMessage(new TranslatableText("msg.rubycraft.crushing_machine_error"), false);

        return ActionResult.FAIL;


    }
}
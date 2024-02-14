package block;

import com.ptk671.rubycraft.BlockItems;
import com.ptk671.rubycraft.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import static com.ptk671.rubycraft.Items.*;
import static com.ptk671.rubycraft.Blocks.*;
public class crushing_machine extends Block {
    public crushing_machine(Settings settings) {
        super(settings);


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





        if (handStack.getItem() == BlockItems.ruby_ore_item) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(RubyDust, 3));
            return ActionResult.SUCCESS;
        }

        if (!world.isClient)

        player.sendMessage(new TranslatableText("msg.rubycraft.crushing_machine_error"), false);

        return ActionResult.FAIL;


    }
}
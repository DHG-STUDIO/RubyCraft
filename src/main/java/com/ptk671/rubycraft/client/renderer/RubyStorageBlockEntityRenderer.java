package com.ptk671.rubycraft.client.renderer;

import com.ptk671.rubycraft.block.RubyStorage;
import com.ptk671.rubycraft.client.util.RenderUtil;
import com.ptk671.rubycraft.tile.RubyStorageBlockEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;


public class RubyStorageBlockEntityRenderer<T extends RubyStorageBlockEntity> implements BlockEntityRenderer<T> {

    @Override
    public void render(RubyStorageBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();

        renderItems(entity, matrices, vertexConsumers, light);

        matrices.pop();
    }

    private void renderItems(RubyStorageBlockEntity entity, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.scale(0.5F, 0.5F, 0.5F);

        Direction direction = entity.getCachedState().get(RubyStorage.FACING);

        int currentRenderCount = 0;

        for (int i = 0; i < entity.size(); i++) {
            ItemStack stack = entity.getStack(i);

            if(currentRenderCount >= 9) {
                break;
            }

            if(stack.isEmpty()) {
                continue;
            }

            matrices.push();

            //Offsetを乗法することで、方向側でのみfloorの値が反映される
            double x = 1 + ((Math.floor(currentRenderCount / 3.0) - 1) * Math.abs(direction.getOffsetZ())) * 0.5;
            double y = 0.5 + ((currentRenderCount % 3) * 0.5);
            double z = 1 + ((Math.floor(currentRenderCount / 3.0) - 1) * Math.abs(direction.getOffsetX())) * 0.5;

            matrices.translate(x, y, z);
            RenderUtil.renderItem(stack, entity, matrices, vertexConsumers, light);

            matrices.pop();

            currentRenderCount++;
        }
    }
}

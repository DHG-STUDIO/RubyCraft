package com.ptk671.rubycraft.client.renderer;

import com.ptk671.rubycraft.block.RubyStorage;
import com.ptk671.rubycraft.client.util.RenderUtil;
import com.ptk671.rubycraft.tile.RubyStorageBlockEntity;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;

public class RubyStorageBlockEntityRenderer<T extends RubyStorageBlockEntity> implements BlockEntityRenderer<T> {

    @Override
    public void render(RubyStorageBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();

        renderItems(entity, tickDelta, matrices, vertexConsumers, light);

        matrices.pop();
    }

    private void renderItems(RubyStorageBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.scale(0.5F, 0.5F, 0.5F);

        Direction direction = entity.getCachedState().get(RubyStorage.FACING);

        int currentRenderCount = 0;

        DefaultedList<ItemStack> items = entity.getItems();

        for (ItemStack stack : items) {
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

            //TODO: 三角関数に書き換える
            float rotation = (360F * (System.currentTimeMillis() % 4000) / 4000) - tickDelta;
            matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(rotation));

            RenderUtil.renderItem(stack, entity, matrices, vertexConsumers, light);

            matrices.pop();

            currentRenderCount++;
        }
    }
}

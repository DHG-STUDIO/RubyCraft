package com.ptk671.rubycraft.client.renderer;

import com.ptk671.rubycraft.tile.RubyStorageBlockEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;


public class RubyStorageBlockEntityRenderer<T extends RubyStorageBlockEntity> implements BlockEntityRenderer<T> {

    @Override
    public void render(RubyStorageBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();

        matrices.pop();
    }
}

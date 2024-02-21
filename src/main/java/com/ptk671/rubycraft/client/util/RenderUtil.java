package com.ptk671.rubycraft.client.util;

import com.ptk671.rubycraft.block.RubyStorage;
import com.ptk671.rubycraft.tile.RubyStorageBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;

public class RenderUtil {
    public static void renderItem(ItemStack itemStack, RubyStorageBlockEntity entity, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.multiply(entity.getCachedState().get(RubyStorage.FACING).getRotationQuaternion());
        //アイテムを垂直に回転
        matrices.multiply(Direction.NORTH.getRotationQuaternion());

        MinecraftClient.getInstance().getItemRenderer().renderItem(itemStack, ModelTransformation.Mode.GROUND, light, OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 0);
    }
}

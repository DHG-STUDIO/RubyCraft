package com.ptk671.rubycraft.client.renderer;

import com.ptk671.rubycraft.block.RubyChest;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.minecraft.block.*;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory.Context;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;
import net.minecraft.client.render.block.entity.LightmapCoordinatesRetriever;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;
import net.minecraft.world.World;

import static com.ptk671.rubycraft.RubyCraft.id;

public class RubyChestBlockEntityRenderer<T extends ChestBlockEntity> extends ChestBlockEntityRenderer<T> {

    private static final String BASE = "bottom";
    private static final String LID = "lid";
    private static final String LATCH = "lock";
    private final ModelPart singleChestLid;
    private final ModelPart singleChestBase;
    private final ModelPart singleChestLatch;

    private final ModelPart doubleChestLeftLid;
    private final ModelPart doubleChestLeftBase;
    private final ModelPart doubleChestLeftLatch;
    private final ModelPart doubleChestRightLid;
    private final ModelPart doubleChestRightBase;
    private final ModelPart doubleChestRightLatch;

    public RubyChestBlockEntityRenderer(Context ctx) {
        super(ctx);

        ModelPart modelPart = ctx.getLayerModelPart(EntityModelLayers.CHEST);
        this.singleChestBase = modelPart.getChild(BASE);
        this.singleChestLid = modelPart.getChild(LID);
        this.singleChestLatch = modelPart.getChild(LATCH);

        ModelPart modelPart2 = ctx.getLayerModelPart(EntityModelLayers.DOUBLE_CHEST_LEFT);
        this.doubleChestLeftBase = modelPart2.getChild(BASE);
        this.doubleChestLeftLid = modelPart2.getChild(LID);
        this.doubleChestLeftLatch = modelPart2.getChild(LATCH);
        ModelPart modelPart3 = ctx.getLayerModelPart(EntityModelLayers.DOUBLE_CHEST_RIGHT);
        this.doubleChestRightBase = modelPart3.getChild(BASE);
        this.doubleChestRightLid = modelPart3.getChild(LID);
        this.doubleChestRightLatch = modelPart3.getChild(LATCH);
    }

    @Override
    public void render(T entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        World world = entity.getWorld();
        boolean existWorld = world != null;
        
        BlockState state = existWorld ? entity.getCachedState() : Blocks.CHEST.getDefaultState().with(ChestBlock.FACING, Direction.SOUTH);
        ChestType chestType = state.contains(ChestBlock.CHEST_TYPE) ? state.get(ChestBlock.CHEST_TYPE) : ChestType.SINGLE;
        Block block = state.getBlock();
        if (block instanceof RubyChest) {
            RubyChest chest = (RubyChest) block;
            boolean bl2 = chestType != ChestType.SINGLE;
            matrices.push();
            float f = state.get(ChestBlock.FACING).asRotation();
            matrices.translate(0.5, 0.5, 0.5);
            matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(-f));
            matrices.translate(-0.5, -0.5, -0.5);

            DoubleBlockProperties.PropertySource<? extends ChestBlockEntity> properties;
            if (existWorld) {
                properties = chest.getBlockEntitySource(state, world, entity.getPos(), true);
            } else {
                properties = DoubleBlockProperties.PropertyRetriever::getFallback;
            }

            float g = (properties.apply(ChestBlock.getAnimationProgressRetriever(entity))).get(tickDelta);
            g = 1.0F - g;
            g = 1.0F - g * g * g;
            int i = ((Int2IntFunction)properties.apply(new LightmapCoordinatesRetriever())).applyAsInt(light);
            SpriteIdentifier spriteIdentifier = new SpriteIdentifier(TexturedRenderLayers.CHEST_ATLAS_TEXTURE, id("model/ruby_chest"));
            VertexConsumer vertexConsumer = spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityCutout);
            
            if (bl2) {
                if (chestType == ChestType.LEFT) {
                    this.render(matrices, vertexConsumer, this.doubleChestLeftLid, this.doubleChestLeftLatch, this.doubleChestLeftBase, g, i, overlay);
                } else {
                    this.render(matrices, vertexConsumer, this.doubleChestRightLid, this.doubleChestRightLatch, this.doubleChestRightBase, g, i, overlay);
                }
            } else {
                this.render(matrices, vertexConsumer, this.singleChestLid, this.singleChestLatch, this.singleChestBase, g, i, overlay);
            }

            matrices.pop();
        }
    }
    
    private void render(MatrixStack matrices, VertexConsumer vertices, ModelPart lid, ModelPart latch, ModelPart base, float openFactor, int light, int overlay) {
        lid.pitch = -(openFactor * 1.5707964F);
        latch.pitch = lid.pitch;
        lid.render(matrices, vertices, light, overlay);
        latch.render(matrices, vertices, light, overlay);
        base.render(matrices, vertices, light, overlay);
    }
}

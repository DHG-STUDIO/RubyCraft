package com.ptk671.rubycraft.block;

import com.ptk671.rubycraft.BlockEntities;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.pitan76.mcpitanlib.api.block.ExtendBlockEntityProvider;
import net.pitan76.mcpitanlib.api.block.args.v2.PlacementStateArgs;
import net.pitan76.mcpitanlib.api.block.v2.CompatBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatBlockProvider;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.event.block.AppendPropertiesArgs;
import net.pitan76.mcpitanlib.api.event.block.BlockBreakEvent;
import net.pitan76.mcpitanlib.api.event.block.CollisionShapeEvent;
import net.pitan76.mcpitanlib.api.event.block.result.BlockBreakResult;
import net.pitan76.mcpitanlib.api.state.property.CompatProperties;
import net.pitan76.mcpitanlib.api.state.property.DirectionProperty;
import net.pitan76.mcpitanlib.midohra.block.BlockState;
import org.jetbrains.annotations.Nullable;


public class RubyStorage extends CompatBlock implements ExtendBlockEntityProvider, CompatBlockProvider {
    private final VoxelShape SHAPE_BOTTOM = VoxelShapes.cuboid(0.0, 0.1, 0.0, 0, 0.2, 0);
    private final VoxelShape SHAPE_TOP = VoxelShapes.cuboid(0.0, 15.8, 0.0, 15.9, 15.9, 15.9);
    private final VoxelShape SHAPE = VoxelShapes.union(SHAPE_BOTTOM, SHAPE_TOP);

    public static final DirectionProperty FACING = CompatProperties.HORIZONTAL_FACING;

    public RubyStorage(CompatibleBlockSettings settings) {
        super(settings);
        setDefaultState(getDefaultMidohraState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getCollisionShape(CollisionShapeEvent event) {
        return VoxelShapes.union(VoxelShapes.fullCube(), SHAPE);
    }

    public int getSlotSize() {
        return 32;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityType<T> getBlockEntityType() {
        return (BlockEntityType<T>) BlockEntities.RUBY_STORAGE.getOrNull();
    }

    @Override
    public BlockState getPlacementState(PlacementStateArgs args) {
        BlockState state = super.getPlacementState(args);

        return state.with(FACING, args.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public void appendProperties(AppendPropertiesArgs args) {
        args.addProperty(FACING);
        super.appendProperties(args);
    }

    @Override
    public BlockBreakResult onBreak(BlockBreakEvent event, Options options) {
        if(event.isClient()) {
            return CompatBlockProvider.super.onBreak(event, options);
        }

        BlockEntity blockEntity = event.getWorld().getBlockEntity(event.getPos());

        if(blockEntity == null) {
            return CompatBlockProvider.super.onBreak(event, options);
        }

        NbtCompound nbt = blockEntity.toInitialChunkDataNbt();

        ItemStack stack = new ItemStack(this);
        stack.setSubNbt("BlockEntityTag", nbt);

        event.getWorld().spawnEntity(new ItemEntity(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), stack));

        options.cancel = true;
        event.getWorld().setBlockState(event.getPos(), net.minecraft.block.Blocks.AIR.getDefaultState());

        return new BlockBreakResult(event.getState());
    }

    @Override
    public boolean isTick() {
        return true;
    }
}
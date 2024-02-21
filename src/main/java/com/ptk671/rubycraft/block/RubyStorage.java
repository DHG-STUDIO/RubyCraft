package com.ptk671.rubycraft.block;

import com.ptk671.rubycraft.BlockEntities;

import net.minecraft.block.*;
import net.minecraft.block.entity.*;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.*;

import net.pitan76.mcpitanlib.api.block.*;
import net.pitan76.mcpitanlib.api.event.block.*;
import net.pitan76.mcpitanlib.api.event.block.result.BlockBreakResult;

import org.jetbrains.annotations.Nullable;


public class RubyStorage extends ExtendBlock implements ExtendBlockEntityProvider, ExtendBlockProvider {
    private VoxelShape SHAPE_BOTTOM = VoxelShapes.cuboid(0.0, 0.1, 0.0, 0, 0.2, 0);
    private VoxelShape SHAPE_TOP = VoxelShapes.cuboid(0.0, 15.8, 0.0, 15.9, 15.9, 15.9);
    private VoxelShape SHAPE = VoxelShapes.union(SHAPE_BOTTOM, SHAPE_TOP);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public RubyStorage(CompatibleBlockSettings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
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
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockBreakResult onBreak(BlockBreakEvent event, Options options) {
        if(event.isClient()) {
            return ExtendBlockProvider.super.onBreak(event, options);
        }

        BlockEntity blockEntity = event.getWorld().getBlockEntity(event.getPos());

        if(blockEntity == null) {
            return ExtendBlockProvider.super.onBreak(event, options);
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
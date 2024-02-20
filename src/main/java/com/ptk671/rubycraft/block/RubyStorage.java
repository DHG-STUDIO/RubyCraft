package com.ptk671.rubycraft.block;

import com.ptk671.rubycraft.BlockEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.block.ExtendBlockEntityProvider;
import net.pitan76.mcpitanlib.api.event.block.CollisionShapeEvent;
import org.jetbrains.annotations.Nullable;


public class RubyStorage extends ExtendBlock implements ExtendBlockEntityProvider {
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
}
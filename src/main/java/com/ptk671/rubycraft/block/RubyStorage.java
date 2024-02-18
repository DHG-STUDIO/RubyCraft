package com.ptk671.rubycraft.block;

import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.event.block.CollisionShapeEvent;


public class RubyStorage extends ExtendBlock {

    private VoxelShape SHAPE_BOTTOM = VoxelShapes.cuboid(0.0, 0.1, 0.0, 16.0, 0.2, 16.0);
    private VoxelShape SHAPE_TOP = VoxelShapes.cuboid(0.0, 15.8, 0.0, 16.0, 15.9, 16.0);
    private VoxelShape SHAPE = VoxelShapes.union(SHAPE_BOTTOM, SHAPE_TOP);
    public RubyStorage(CompatibleBlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getCollisionShape(CollisionShapeEvent event) {
        return VoxelShapes.union(VoxelShapes.fullCube(), SHAPE);
    }
}
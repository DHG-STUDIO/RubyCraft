package com.ptk671.rubycraft.block;

import com.ptk671.rubycraft.BlockEntities;
import com.ptk671.rubycraft.tile.RubyChestBlockEntity;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.BlockPos;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.block.ExtendBlock;
import net.pitan76.mcpitanlib.api.block.ExtendBlockEntityProvider;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;
import net.pitan76.mcpitanlib.api.tile.ExtendBlockEntity;

import static com.ptk671.rubycraft.Blocks.RUBY_STORAGE;


public class RubyStorage  extends ExtendBlock {

    public RubyStorage(CompatibleBlockSettings settings) {
        super(settings);
    }


}
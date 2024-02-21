package com.ptk671.rubycraft.block;

import com.ptk671.rubycraft.BlockEntities;
import com.ptk671.rubycraft.tile.RubyChestBlockEntity;

import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.*;
import net.minecraft.util.math.BlockPos;

import net.pitan76.mcpitanlib.api.block.*;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;

import org.jetbrains.annotations.Nullable;

public class RubyChest extends ChestBlock implements ExtendBlockEntityProvider {
    public RubyChest(CompatibleBlockSettings settings) {
        super(settings.build(), () -> (BlockEntityType<? extends ChestBlockEntity>) BlockEntities.RUBY_CHEST.getOrNull());
    }

    /**
     * TODO: MCPitanLibでBlockWithEntityのMixinが作成されたら削除する
     * @deprecated Use {@link #createBlockEntity(TileCreateEvent)} instead.
     */
    @Deprecated
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RubyChestBlockEntity(new TileCreateEvent(pos, state));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(TileCreateEvent e) {
        return new RubyChestBlockEntity(e);
    }
}


package com.ptk671.rubycraft.tile;

import com.ptk671.rubycraft.BlockEntities;
import com.ptk671.rubycraft.container.RubyChestScreenHandler;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;
import net.pitan76.mcpitanlib.api.util.TextUtil;

public class RubyChestBlockEntity extends ChestBlockEntity {
    public RubyChestBlockEntity(BlockEntityType<?> type, TileCreateEvent e) {
        // TODO: MCPitanLibでCompatibleBlockEntityEntityが実装されたら修正する
        super(type, e.getBlockPos(), e.getBlockState());
    }

    public RubyChestBlockEntity(TileCreateEvent e) {
        this(BlockEntities.RUBY_CHEST.getOrNull(), e);
    }

    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new RubyChestScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public Text getContainerName() {
        return TextUtil.translatable("container.rubycraft.ruby_chest");
    }
}

package com.ptk671.rubycraft.tile;

import com.ptk671.rubycraft.BlockEntities;
import com.ptk671.rubycraft.block.RubyStorage;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;
import net.pitan76.mcpitanlib.api.gui.inventory.IInventory;
import net.pitan76.mcpitanlib.api.packet.UpdatePacketType;
import net.pitan76.mcpitanlib.api.tile.ExtendBlockEntity;
import org.jetbrains.annotations.Nullable;

public class RubyStorageBlockEntity extends ExtendBlockEntity implements SidedInventory, IInventory {
    private final DefaultedList<ItemStack> items;
    public RubyStorageBlockEntity(TileCreateEvent event) {
        super(BlockEntities.RUBY_STORAGE.getOrNull(), event);

        int slotSize = ((RubyStorage) event.getBlockState().getBlock()).getSlotSize();
        items = DefaultedList.ofSize(slotSize, ItemStack.EMPTY);
    }

    @Override
    public void readNbtOverride(NbtCompound nbt) {
        super.readNbtOverride(nbt);

        Inventories.readNbt(nbt, items);
    }

    @Override
    public void writeNbtOverride(NbtCompound nbt) {
        super.writeNbtOverride(nbt);

        Inventories.writeNbt(nbt, items);
    }

    @Override
    public UpdatePacketType getUpdatePacketType() {
        return UpdatePacketType.BLOCK_ENTITY_UPDATE_S2C;
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        NbtCompound nbt = super.toInitialChunkDataNbt();
        writeNbtOverride(nbt);

        return nbt;
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        return items.stream().filter(ItemStack::isEmpty).mapToInt(items::indexOf).toArray();
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return dir == Direction.UP && items.get(slot).isEmpty();
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return dir == Direction.DOWN && !items.get(slot).isEmpty();
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return false;
    }

    @Override
    public void markDirty() {
        super.markDirty();

        world.getMinecraftWorld().updateListeners(pos, getCachedState(), getCachedState(), Block.NOTIFY_LISTENERS);
    }
}

package com.ptk671.rubycraft.tile;

import com.ptk671.rubycraft.BlockEntities;
import com.ptk671.rubycraft.block.RubyStorage;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;
import net.pitan76.mcpitanlib.api.tile.ExtendBlockEntity;
import org.jetbrains.annotations.Nullable;

public class RubyStorageBlockEntity extends ExtendBlockEntity implements SidedInventory {
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
    public int[] getAvailableSlots(Direction side) {
        return new int[0];
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return false;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getStack(int slot) {
        return new ItemStack(Items.REDSTONE, 1);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        return null;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return null;
    }

    @Override
    public void setStack(int slot, ItemStack stack) {

    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return false;
    }

    @Override
    public void clear() {
        items.clear();
    }
}

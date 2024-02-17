package com.ptk671.rubycraft.container;

import com.ptk671.rubycraft.ScreenHandlers;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.pitan76.mcpitanlib.api.entity.Player;
import net.pitan76.mcpitanlib.api.gui.SimpleScreenHandler;
import net.pitan76.mcpitanlib.api.gui.slot.CompatibleSlot;

public class RubyChestScreenHandler extends SimpleScreenHandler {

    private final Inventory inventory;

    public static int DEFAULT_ROW = 3;

    public RubyChestScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(27));
    }

    public RubyChestScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(ScreenHandlers.RUBY_CHEST_SCREEN_HANDLER.getOrNull(), syncId);
        this.inventory = inventory;

        addPlayerMainInventorySlots(playerInventory, 8, 139 - DEFAULT_ROW * 18);
        addPlayerHotbarSlots(playerInventory, 8, 197 - DEFAULT_ROW * 18);
        addSlots(inventory, 0, 8, 18, -1, 9, DEFAULT_ROW);
    }

    public ItemStack quickMoveOverride(Player player, int index) {
        ItemStack resultStack;
        Slot slot1 = this.slots.get(index);
        if (!(slot1 instanceof CompatibleSlot)) return ItemStack.EMPTY;

        CompatibleSlot slot = (CompatibleSlot) slot1;
        if (!slot.callHasStack()) return ItemStack.EMPTY;

        ItemStack stack = slot.callGetStack();
        resultStack = stack.copy();
        if (index < 9) {
            if (!this.callInsertItem(stack, 9, 45, true)) {
                return ItemStack.EMPTY;
            }
        } else if (!this.callInsertItem(stack, 0, 9, false)) {
            return ItemStack.EMPTY;
        }

        if (stack.isEmpty()) {
            slot.callSetStack(ItemStack.EMPTY);
        } else {
            slot.markDirty();
        }

        if (stack.getCount() == resultStack.getCount()) return ItemStack.EMPTY;
        slot.onTakeItem(player.getPlayerEntity(), stack);

        return resultStack;
    }

    @Override
    public void close(Player player) {
        super.close(player);
        this.inventory.onClose(player.getPlayerEntity());
    }
}
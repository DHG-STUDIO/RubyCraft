package com.ptk671.rubycraft;

import com.ptk671.rubycraft.tile.*;
import net.minecraft.block.*;
import net.minecraft.block.entity.*;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.tile.BlockEntityTypeBuilder;

import static com.ptk671.rubycraft.RubyCraft.id;
import static com.ptk671.rubycraft.RubyCraft.registry;

public class BlockEntities {
    public static RegistryResult<BlockEntityType<?>> RUBY_CHEST;
    public static RegistryResult<BlockEntityType<?>> RUBY_STORAGE;
    public static void register() {
        RUBY_CHEST = registry.registerBlockEntityType(id("ruby_chest"), () -> create(RubyChestBlockEntity::new, Blocks.RUBY_CHEST.getOrNull()));
        RUBY_STORAGE = registry.registerBlockEntityType(id("ruby_storage"), () -> create(RubyStorageBlockEntity::new,
                Blocks.RUBY_STORAGE.getOrNull(),
                Blocks.RUBY_STORAGE_MK2.getOrNull(),
                Blocks.RUBY_STORAGE_MK3.getOrNull()
        ));
    }

    public static <T extends BlockEntity> BlockEntityType<T> create(BlockEntityTypeBuilder.Factory<T> supplier, Block... blocks) {
        return BlockEntityTypeBuilder.create(supplier, blocks).build();
    }
}

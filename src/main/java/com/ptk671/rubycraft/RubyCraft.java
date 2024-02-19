package com.ptk671.rubycraft;

import com.ptk671.rubycraft.block.RegistrySetCutouLayer;
import com.ptk671.rubycraft.fuels.Fuels;
import com.ptk671.rubycraft.itemgroup.CreativeTabs;
import com.ptk671.rubycraft.world.OreRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;
import net.pitan76.mcpitanlib.api.registry.WorldGenRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyCraft implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static String MOD_ID = "rubycraft";
    public static CompatRegistry registry = CompatRegistry.createRegistry(MOD_ID);
    public static WorldGenRegistry worldGenRegistry = WorldGenRegistry.createRegistry(MOD_ID);

    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String patch) {
        return new Identifier(RubyCraft.MOD_ID, patch);
    }

    @Override
    public void onInitialize() {
        //クリエイティブタブの登録
        CreativeTabs.register();

        // コンテナの登録
        ScreenHandlers.register();

        //アイテム登録
        Items.registry();

        //ブロック登録
        Blocks.registry();

        //鉱石の追加
        OreRegistry.register();

        // ブロックエンティティの登録
        BlockEntities.register();

        //燃料の登録
        Fuels.register();

        //ブロックの透過
        RegistrySetCutouLayer.registry();

        registry.allRegister();
    }

}

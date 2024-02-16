package com.ptk671.rubycraft;

import com.ptk671.rubycraft.fuels.RegistryAllFuels;
import com.ptk671.rubycraft.itemgroup.CreativeTabs;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;


public class RubyCraft implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static String MOD_ID = "rubycraft";
    public static CompatRegistry registry = CompatRegistry.createRegistry(MOD_ID);

    public static Identifier id(String patch) {
        return new Identifier(RubyCraft.MOD_ID, patch);
    }


    @Override
    public void onInitialize() {
        CreativeTabs.register();

        //ブロック登録
        Blocks.Registry();

        //アイテム登録
        RegistryAlIItems.register();

        //燃料の登録
        RegistryAllFuels.register();

        registry.allRegister();
    }

}

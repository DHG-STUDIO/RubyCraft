package com.ptk671.rubycraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;


public class Rubycraft implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static String MOD_ID = "rubycraft";

    public static Identifier id(String patch)
    {
        return new Identifier(Rubycraft.MOD_ID,patch);
    }

    @Override
    public void onInitialize() {

        //全アイテム/ブロック登録
        RegistryAllitems.register();

    }

}

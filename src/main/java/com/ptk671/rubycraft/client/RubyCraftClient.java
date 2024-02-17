package com.ptk671.rubycraft.client;

import com.ptk671.rubycraft.client.renderer.BlockEntityRenderers;
import net.fabricmc.api.ClientModInitializer;


public class RubyCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // スクリーンの登録
        Screens.register();

        // テクスチャの登録
        Textures.register();

        // レンダラーの登録
        BlockEntityRenderers.register();
    }
}

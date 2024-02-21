package com.ptk671.rubycraft.client;

import com.ptk671.rubycraft.client.renderer.BlockEntityRenderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;


@Environment(EnvType.CLIENT)
public class RubyCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // スクリーンの登録
        Screens.register();

        // テクスチャの登録
        Textures.register();

        //BlockRenderLayerの登録
        BlockRenderLayers.register();

        // レンダラーの登録
        BlockEntityRenderers.register();
    }
}

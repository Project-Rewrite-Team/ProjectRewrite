package net.havenselph.projectrewrite;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.havenselph.projectrewrite.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ProjectRewriteClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YUCCA_PALM_SAPLING, RenderLayer.getCutout());
    }
}
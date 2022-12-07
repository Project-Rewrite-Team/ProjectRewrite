package net.havenselph.projectrewrite.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.havenselph.projectrewrite.ProjectRewrite;
import net.havenselph.projectrewrite.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PROJECT_REWRITE = FabricItemGroupBuilder.build(
            new Identifier(ProjectRewrite.MOD_ID, "projectrewrite"), () -> new ItemStack(ModBlocks.YUCCA_PALM_SAPLING.asItem()));
}

package net.havenselph.projectrewrite.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.havenselph.projectrewrite.ProjectRewrite;
import net.havenselph.projectrewrite.block.entity.ModSignTypes;
import net.havenselph.projectrewrite.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    // Layered Sandstone Blocks
    public static final Block LAYERED_SANDSTONE = registerBlock("layered_sandstone",
            new PillarBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)), ModItemGroup.PROJECT_REWRITE);
    public static final Block COBBLED_LAYERED_SANDSTONE = registerBlock("cobbled_layered_sandstone",
            new Block(FabricBlockSettings.copy(Blocks.SANDSTONE)), ModItemGroup.PROJECT_REWRITE);
    // Sandy Dirt
    public static final Block SANDY_COARSE_SOIL = registerBlock("sandy_coarse_soil",
            new Block(FabricBlockSettings.copy(Blocks.SAND)), ModItemGroup.PROJECT_REWRITE);
    public static final Block SANDY_SOIL = registerBlock("sandy_soil",
            new Block(FabricBlockSettings.copy(Blocks.SAND)), ModItemGroup.PROJECT_REWRITE);
    // Yucca Wood
    public static final Block YUCCA_PALM_LOG = registerBlock("yucca_palm_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.PROJECT_REWRITE);
    public static final Block YUCCA_PALM_WOOD = registerBlock("yucca_palm_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.PROJECT_REWRITE);
    public static final Block YUCCA_PALM_STRIPPED_LOG = registerBlock("yucca_palm_stripped_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.PROJECT_REWRITE);
    public static final Block YUCCA_PALM_STRIPPED_WOOD = registerBlock("yucca_palm_stripped_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.PROJECT_REWRITE);
    public static final Block YUCCA_PALM_LEAVES = registerBlock("yucca_palm_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.PROJECT_REWRITE);
    public static final Block YUCCA_PALM_SAPLING = registerBlock("yucca_palm_sapling",
            new Block(FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.PROJECT_REWRITE);
    public static final Block YUCCA_PALM_PLANKS = registerBlock("yucca_palm_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.PROJECT_REWRITE);
    // Yucca Signs
    public static final Block YUCCA_PALM_SIGN = registerBlockWithoutItem("yucca_palm_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.YUCCA_PALM), ModItemGroup.PROJECT_REWRITE);
    public static final Block YUCCA_PALM_WALL_SIGN = registerBlockWithoutItem("yucca_palm_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.YUCCA_PALM), ModItemGroup.PROJECT_REWRITE);

    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(ProjectRewrite.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ProjectRewrite.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectRewrite.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlock() {
        ProjectRewrite.LOGGER.debug("Registering blocks for " + ProjectRewrite.MOD_ID);
    }
}

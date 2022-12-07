package net.havenselph.projectrewrite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.havenselph.projectrewrite.ProjectRewrite;
import net.havenselph.projectrewrite.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Yucca Wood Family
    public static final Item YUCCA_PALM_BOAT = registerItem("yucca_palm_boat", new Item(new FabricItemSettings().group(ModItemGroup.PROJECT_REWRITE)));
    public static final Item YUCCA_PALM_CHEST_BOAT = registerItem("yucca_palm_chest_boat", new Item(new FabricItemSettings().group(ModItemGroup.PROJECT_REWRITE)));
    public static final Item YUCCA_PALM_SIGN = registerItem("yucca_palm_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.PROJECT_REWRITE).maxCount(16), ModBlocks.YUCCA_PALM_SIGN, ModBlocks.YUCCA_PALM_WALL_SIGN));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectRewrite.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ProjectRewrite.LOGGER.debug("Registering items for " + ProjectRewrite.MOD_ID);

    }
}

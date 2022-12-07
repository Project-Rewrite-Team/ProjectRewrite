package net.havenselph.projectrewrite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.havenselph.projectrewrite.ProjectRewrite;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item YUCCA_PALM_BOAT = registerItem("yucca_palm_boat", new Item(new FabricItemSettings().group(ModItemGroup.PROJECTREWRITE)));
    public static final Item YUCCA_PALM_CHEST_BOAT = registerItem("yucca_palm_chest_boat", new Item(new FabricItemSettings().group(ModItemGroup.PROJECTREWRITE)));
    public static final Item YUCCA_PALM_SAPLING = registerItem("yucca_palm_sapling", new Item(new FabricItemSettings().group(ModItemGroup.PROJECTREWRITE)));
    public static final Item YUCCA_PALM_SIGN = registerItem("yucca_palm_sign", new Item(new FabricItemSettings().group(ModItemGroup.PROJECTREWRITE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectRewrite.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ProjectRewrite.LOGGER.debug("Registering items for " + ProjectRewrite.MOD_ID);

    }
}

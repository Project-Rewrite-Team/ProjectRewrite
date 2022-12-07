package net.havenselph.projectrewrite;

import net.fabricmc.api.ModInitializer;
import net.havenselph.projectrewrite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectRewrite implements ModInitializer {
	public static final String MOD_ID = "projectrewrite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

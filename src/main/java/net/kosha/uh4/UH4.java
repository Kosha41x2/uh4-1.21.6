package net.kosha.uh4;

import net.fabricmc.api.ModInitializer;

import net.kosha.uh4.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UH4 implements ModInitializer {
	public static final String MOD_ID = "uh4";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
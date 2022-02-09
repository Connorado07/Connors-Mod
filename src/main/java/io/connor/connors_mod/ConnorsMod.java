package io.connor.connors_mod;

import io.connor.connors_mod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnorsMod implements ModInitializer {
	public static final String MOD_ID = "connors_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("connors_mod");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}

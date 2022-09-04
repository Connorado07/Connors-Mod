package io.connor.connors_mod;

import io.connor.connors_mod.DnD.DndMod;
import io.connor.connors_mod.Star_Wars.blocks.CrystalBlocks;
import io.connor.connors_mod.Star_Wars.items.StarWarsItems;
import io.connor.connors_mod.Star_Wars.lightsabers.SingleLightsabers;
import io.connor.connors_mod.Connor.block.ModBlocks;
import io.connor.connors_mod.Connor.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnorsMod implements ModInitializer {
	public static final String MOD_ID = "connors_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("connors_mod");


	@Override
	public void onInitialize() {
		//Connor
		ModItems.registerModItems();
		ModBlocks.registeryModBlocks();

		//DnD
		DndMod.registerModItems();

		//Star Wars
		SingleLightsabers.registerModItems();
		CrystalBlocks.registeryModBlocks();
		StarWarsItems.registerModItems();


		//Block Render
		BlockRenderLayerMap.INSTANCE.putBlock(CrystalBlocks.RED_ORE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CrystalBlocks.BLUE_ORE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CrystalBlocks.GREEN_ORE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CrystalBlocks.PURPLE_ORE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CrystalBlocks.YELLOW_ORE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CrystalBlocks.WHITE_ORE, RenderLayer.getCutout());
	}
}

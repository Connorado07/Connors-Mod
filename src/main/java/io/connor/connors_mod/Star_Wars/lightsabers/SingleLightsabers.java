package io.connor.connors_mod.Star_Wars.lightsabers;

import io.connor.connors_mod.ConnorsMod;
import io.connor.connors_mod.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SingleLightsabers {

    public static final Item RED_LIGHTSABER = registerItem("red_lightsaber",
            new LightsaberItem(LightsaberToolMaterial.INSTANCE, 19, -2.8F, new Item.Settings().group(ModItemGroups.SABERS_GROUP)));
    public static final Item BLUE_LIGHTSABER = registerItem("blue_lightsaber",
            new LightsaberItem(LightsaberToolMaterial.INSTANCE, 17, -2F, new Item.Settings().group(ModItemGroups.SABERS_GROUP)));
    public static final Item GREEN_LIGHTSABER = registerItem("green_lightsaber",
            new LightsaberItem(LightsaberToolMaterial.INSTANCE, 18, -2.4F, new Item.Settings().group(ModItemGroups.SABERS_GROUP)));
    public static final Item PURPLE_LIGHTSABER = registerItem("purple_lightsaber",
            new LightsaberItem(LightsaberToolMaterial.INSTANCE, 16, -1.8F, new Item.Settings().group(ModItemGroups.SABERS_GROUP)));
    public static final Item YELLOW_LIGHTSABER = registerItem("yellow_lightsaber",
            new LightsaberItem(LightsaberToolMaterial.INSTANCE, 17, -2.2F, new Item.Settings().group(ModItemGroups.SABERS_GROUP)));
    public static final Item WHITE_LIGHTSABER = registerItem("white_lightsaber",
            new LightsaberItem(LightsaberToolMaterial.INSTANCE, 17, -2.2F, new Item.Settings().group(ModItemGroups.SABERS_GROUP)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ConnorsMod.MOD_ID, name), item); }
    public static void registerModItems(){
        System.out.println("Registering Lightsabers for " + ConnorsMod.MOD_ID);
    }
}

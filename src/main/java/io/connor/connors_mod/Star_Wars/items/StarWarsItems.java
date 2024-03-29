package io.connor.connors_mod.Star_Wars.items;

import io.connor.connors_mod.ConnorsMod;
import io.connor.connors_mod.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class StarWarsItems {

    //Kyber Crystals (Color Crystals)
    public static final Item RED_KYBER_CRYSTAL = registerItem("red_kyber_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item BLUE_KYBER_CRYSTAL = registerItem("blue_kyber_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item GREEN_KYBER_CRYSTAL = registerItem("green_kyber_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item PURPLE_KYBER_CRYSTAL = registerItem("purple_kyber_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item YELLOW_KYBER_CRYSTAL = registerItem("yellow_kyber_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item WHITE_KYBER_CRYSTAL = registerItem("white_kyber_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));

    //Materials
    public static final Item DURASTEEL_INGOT = new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP));
    public static final Item PLASTANIUM_INGOT = new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP));
    public static final Item QUADERNIUM_INGOT = new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP));
    public static final Item FOCUS_CRYSTAL = new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).maxCount(1));
    public static final Item BOTTOM_SABER_PART = new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).maxCount(16).rarity(Rarity.UNCOMMON));
    public static final Item TOP_SABER_PART = new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).maxCount(16).rarity(Rarity.UNCOMMON));
    public static final Item PLASTANIUM_BALL = new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ConnorsMod.MOD_ID, name), item); }
    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + ConnorsMod.MOD_ID);
    }
}

package io.connor.connors_mod.Star_Wars.items;

import io.connor.connors_mod.ConnorsMod;
import io.connor.connors_mod.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class StarWarsItems {


    public static final Item KYBER_CRYSTAL_RED = registerItem("kyber_crystal_red",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item KYBER_CRYSTAL_BLUE = registerItem("kyber_crystal_blue",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item KYBER_CRYSTAL_GREEN = registerItem("kyber_crystal_green",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item KYBER_CRYSTAL_PURPLE = registerItem("kyber_crystal_purple",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item KYBER_CRYSTAL_YELLOW = registerItem("kyber_crystal_yellow",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));
    public static final Item KYBER_CRYSTAL_WHITE = registerItem("kyber_crystal_white",
            new Item(new FabricItemSettings().group(ModItemGroups.SABERS_GROUP).rarity(Rarity.RARE).maxCount(1)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ConnorsMod.MOD_ID, name), item); }
    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + ConnorsMod.MOD_ID);
    }
}

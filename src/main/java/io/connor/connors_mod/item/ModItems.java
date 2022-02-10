package io.connor.connors_mod.item;

import io.connor.connors_mod.ConnorsMod;
import io.connor.connors_mod.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FROSTBRASS_INGOT = registerItem("frostbrass_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.CONNOR)));
    public static final Item FROSTBRASS_NUGGET = registerItem("frostbrass_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.CONNOR)));
    public static final Item BRASS_INGOT = registerItem("brass_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.CONNOR)));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.CONNOR)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ConnorsMod.MOD_ID, name), item); }
    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + ConnorsMod.MOD_ID);
    }
}

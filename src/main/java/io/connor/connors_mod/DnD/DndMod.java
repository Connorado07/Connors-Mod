package io.connor.connors_mod.DnD;

import io.connor.connors_mod.ConnorsMod;
import io.connor.connors_mod.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DndMod {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroups.DND_MOD)));
    public static final Item ALEXANDRITE = registerItem("alexandrite",
            new Item(new FabricItemSettings().group(ModItemGroups.DND_MOD)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ConnorsMod.MOD_ID, name), item); }
    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + ModItemGroups.DND_MOD);
    }
}

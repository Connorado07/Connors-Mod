package io.connor.connors_mod;

import io.connor.connors_mod.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CONNOR = FabricItemGroupBuilder.build(new Identifier(ConnorsMod.MOD_ID, "connor"),
            () -> new ItemStack(ModItems.FROSTBRASS_INGOT));
}

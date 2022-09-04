package io.connor.connors_mod;

import io.connor.connors_mod.DnD.DndMod;
import io.connor.connors_mod.Star_Wars.lightsabers.SingleLightsabers;
import io.connor.connors_mod.Connor.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CONNOR = FabricItemGroupBuilder.build(new Identifier(ConnorsMod.MOD_ID, "connor"),
            () -> new ItemStack(ModItems.FROSTBRASS_INGOT));
    public static final ItemGroup SABERS_GROUP = FabricItemGroupBuilder.build(new Identifier(ConnorsMod.MOD_ID, "simplesabers"),
            () -> new ItemStack(SingleLightsabers.RED_LIGHTSABER));

    public static final ItemGroup DND_MOD = FabricItemGroupBuilder.build(new Identifier(ConnorsMod.MOD_ID, "dnd_mod"),
            () -> new ItemStack(DndMod.RUBY));
}

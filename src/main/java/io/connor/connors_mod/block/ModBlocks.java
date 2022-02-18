package io.connor.connors_mod.block;

import io.connor.connors_mod.ConnorsMod;
import io.connor.connors_mod.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block FROSTBRASS_BLOCK = registerBlock("frostbrass_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.CONNOR);
    public static final Block BRASS_ORE = registerBlock("brass_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.CONNOR);
    public static final Block DEEPSLATE_BRASS_ORE = registerBlock("deepslate_brass_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.CONNOR);



    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ConnorsMod.MOD_ID, name), block);}
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ConnorsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));}
    public static void registeryModBlocks(){
        System.out.println("Registering Blocks for " + ConnorsMod.MOD_ID);}
}

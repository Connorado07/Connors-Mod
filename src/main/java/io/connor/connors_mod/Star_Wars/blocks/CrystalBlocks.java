package io.connor.connors_mod.Star_Wars.blocks;

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

public class CrystalBlocks {
    public static final Block RED_ORE = registerBlock("red_ore",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(6f).requiresTool().collidable(false).nonOpaque()), ModItemGroups.SABERS_GROUP);
    public static final Block BLUE_ORE = registerBlock("blue_ore",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(6f).requiresTool().collidable(false).nonOpaque()), ModItemGroups.SABERS_GROUP);
    public static final Block GREEN_ORE = registerBlock("green_ore",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(6f).requiresTool().collidable(false).nonOpaque()), ModItemGroups.SABERS_GROUP);
    public static final Block PURPLE_ORE = registerBlock("purple_ore",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(6f).requiresTool().collidable(false).nonOpaque()), ModItemGroups.SABERS_GROUP);
    public static final Block YELLOW_ORE = registerBlock("yellow_ore",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(6f).requiresTool().collidable(false).nonOpaque()), ModItemGroups.SABERS_GROUP);
    public static final Block WHITE_ORE = registerBlock("white_ore",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(6f).requiresTool().collidable(false).nonOpaque()), ModItemGroups.SABERS_GROUP);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ConnorsMod.MOD_ID, name), block);}
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ConnorsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));}
    public static void registeryModBlocks(){
        System.out.println("Registering Star Wars Blocks for " + ConnorsMod.MOD_ID);}
}

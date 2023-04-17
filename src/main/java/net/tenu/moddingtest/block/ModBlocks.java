package net.tenu.moddingtest.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tenu.moddingtest.ModdingTest;
import net.tenu.moddingtest.item.ModItemGroup;
import net.tenu.moddingtest.world.tree.TruffulaSaplingGenerator;

public class ModBlocks {

    //////////////////////////////////// MISC BLOCKS ////////////////////////////////////
    public static final Block REINFORCED_WOOD = registerBlock("reinforced_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()), ModItemGroup.BADGES);
    public static final Block REINFORCED_STONE = registerBlock("reinforced_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool().luminance(6)), ModItemGroup.BADGES);

    //////////////////////////////////// TRUFFULA TREE ////////////////////////////////////
    public static final Block TRUFFULA_LOG = registerBlock("truffula_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)), ModItemGroup.BADGES);
    public static final Block TRUFFULA_WOOD = registerBlock("truffula_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)), ModItemGroup.BADGES);
    public static final Block STRIPPED_TRUFFULA_LOG = registerBlock("stripped_truffula_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)), ModItemGroup.BADGES);
    public static final Block STRIPPED_TRUFFULA_WOOD = registerBlock("stripped_truffula_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)), ModItemGroup.BADGES);

    public static final Block TRUFFULA_PLANKS = registerBlock("truffula_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.BADGES);
    public static final Block TRUFFULA_TUFT = registerBlock("truffula_tuft",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(4.0f).requiresTool()), ModItemGroup.BADGES);

    public static final Block TRUFFULA_SAPLING = registerBlock("truffula_sapling",
            new SaplingBlock(new TruffulaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.BADGES);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ModdingTest.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ModdingTest.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        ModdingTest.LOGGER.info("Registering ModBlocks for " + ModdingTest.MOD_ID);
    }
}

package net.tenu.moddingtest.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tenu.moddingtest.ModdingTest;
import net.tenu.moddingtest.item.ModItemGroup;

public class ModBlocks {
    public static final Block REINFORCED_WOOD = registerBlock("reinforced_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()), ModItemGroup.BADGES);

    public static final Block REINFORCED_STONE = registerBlock("reinforced_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool().luminance(6)), ModItemGroup.BADGES);


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

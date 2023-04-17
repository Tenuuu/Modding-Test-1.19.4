package net.tenu.moddingtest.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.tenu.moddingtest.block.ModBlocks;
import net.tenu.moddingtest.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.REINFORCED_WOOD);
        addDrop(ModBlocks.REINFORCED_STONE);

        addDrop(ModBlocks.TRUFFULA_LOG);
        addDrop(ModBlocks.TRUFFULA_WOOD);
        addDrop(ModBlocks.STRIPPED_TRUFFULA_LOG);
        addDrop(ModBlocks.STRIPPED_TRUFFULA_WOOD);
        addDrop(ModBlocks.TRUFFULA_PLANKS);
        addDrop(ModBlocks.TRUFFULA_TUFT);
        addDrop(ModBlocks.TRUFFULA_SAPLING);


        addDrop(ModBlocks.REINFORCED_WOOD, oreDrops(ModBlocks.REINFORCED_WOOD, ModItems.SWORD_BADGE));
        addDrop(ModBlocks.REINFORCED_STONE, oreDrops(ModBlocks.REINFORCED_STONE, ModItems.AXE_BADGE));
    }
}

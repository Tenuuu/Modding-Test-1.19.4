package net.tenu.moddingtest.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.tenu.moddingtest.block.ModBlocks;
import net.tenu.moddingtest.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REINFORCED_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REINFORCED_STONE);

        blockStateModelGenerator.registerLog(ModBlocks.TRUFFULA_LOG).log(ModBlocks.TRUFFULA_LOG).wood(ModBlocks.TRUFFULA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_TRUFFULA_LOG).log(ModBlocks.STRIPPED_TRUFFULA_LOG).wood(ModBlocks.STRIPPED_TRUFFULA_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRUFFULA_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRUFFULA_TUFT);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.TRUFFULA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SWORD_BADGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AXE_BADGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COMMON_KEY, Models.GENERATED);

        itemModelGenerator.register(Item.fromBlock(ModBlocks.TRUFFULA_SAPLING), Models.GENERATED);
    }
}

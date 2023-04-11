package net.tenu.moddingtest.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SWORD_BADGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AXE_BADGE, Models.GENERATED);
    }
}

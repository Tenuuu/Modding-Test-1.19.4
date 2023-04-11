package net.tenu.moddingtest.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.tenu.moddingtest.block.ModBlocks;
import net.tenu.moddingtest.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.SWORD_BADGE), RecipeCategory.MISC, ModItems.AXE_BADGE,
                0.7f, 200, "badges");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SWORD_BADGE, RecipeCategory.DECORATIONS,
                ModBlocks.REINFORCED_WOOD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXE_BADGE)
                .pattern("WWW")
                .pattern("WSW")
                .pattern("WSW")
                .input('W', Items.OAK_WOOD)
                .input('S', ModItems.SWORD_BADGE)
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_WOOD),
                        FabricRecipeProvider.conditionsFromItem(Items.OAK_WOOD))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SWORD_BADGE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SWORD_BADGE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXE_BADGE)));
    }
}

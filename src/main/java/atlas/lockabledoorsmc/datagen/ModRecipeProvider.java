package atlas.lockabledoorsmc.datagen;

import atlas.lockabledoorsmc.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_ACACIA_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.ACACIA_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.ACACIA_DOOR), conditionsFromItem(Items.ACACIA_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_BIRCH_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.BIRCH_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                    .criterion(hasItem(Items.BIRCH_DOOR), conditionsFromItem(Items.BIRCH_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_BAMBOO_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.BAMBOO_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.BAMBOO_DOOR), conditionsFromItem(Items.BAMBOO_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_CHERRY_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.CHERRY_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.CHERRY_DOOR), conditionsFromItem(Items.CHERRY_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_CRIMSON_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.CRIMSON_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.CRIMSON_DOOR), conditionsFromItem(Items.CRIMSON_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_DARK_OAK_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.DARK_OAK_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.DARK_OAK_DOOR), conditionsFromItem(Items.DARK_OAK_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_IRON_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Items.IRON_INGOT)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.IRON_DOOR), conditionsFromItem(Items.IRON_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_JUNGLE_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.JUNGLE_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.JUNGLE_DOOR), conditionsFromItem(Items.JUNGLE_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_MANGROVE_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.MANGROVE_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.MANGROVE_DOOR), conditionsFromItem(Items.MANGROVE_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_OAK_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.OAK_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.OAK_DOOR), conditionsFromItem(Items.OAK_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_SPRUCE_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.SPRUCE_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.SPRUCE_DOOR), conditionsFromItem(Items.SPRUCE_DOOR))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKABLE_WARPED_DOOR)
                        .pattern("DD ")
                        .pattern("DDG")
                        .pattern("DD ")
                        .input('D', Blocks.WARPED_PLANKS)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.WARPED_DOOR), conditionsFromItem(Items.WARPED_DOOR))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "LockableDoorsMC Recipes";
    }
}

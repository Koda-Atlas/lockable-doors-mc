package atlas.lockabledoorsmc.datagen;

import atlas.lockabledoorsmc.block.ModBlocks;
import atlas.lockabledoorsmc.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_ACACIA_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_BAMBOO_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_BIRCH_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_CRIMSON_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_DARK_OAK_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_JUNGLE_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_IRON_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_MANGROVE_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_OAK_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_SPRUCE_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LOCKABLE_WARPED_DOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.UNLOCKING_KEY, Models.GENERATED);
    }
}

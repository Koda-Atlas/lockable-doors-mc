package atlas.lockabledoorsmc.datagen;

import atlas.lockabledoorsmc.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LOCKABLE_IRON_DOOR);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LOCKABLE_IRON_DOOR);

        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.LOCKABLE_ACACIA_DOOR)
                .add(ModBlocks.LOCKABLE_BAMBOO_DOOR)
                .add(ModBlocks.LOCKABLE_BIRCH_DOOR)
                .add(ModBlocks.LOCKABLE_CHERRY_DOOR)
                .add(ModBlocks.LOCKABLE_CRIMSON_DOOR)
                .add(ModBlocks.LOCKABLE_DARK_OAK_DOOR)
                .add(ModBlocks.LOCKABLE_JUNGLE_DOOR)
                .add(ModBlocks.LOCKABLE_MANGROVE_DOOR)
                .add(ModBlocks.LOCKABLE_OAK_DOOR)
                .add(ModBlocks.LOCKABLE_SPRUCE_DOOR)
                .add(ModBlocks.LOCKABLE_WARPED_DOOR);
    }

}

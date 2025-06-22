package atlas.lockabledoorsmc.datagen;

import atlas.lockabledoorsmc.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LOCKABLE_ACACIA_DOOR, doorDrops(ModBlocks.LOCKABLE_ACACIA_DOOR));
        addDrop(ModBlocks.LOCKABLE_BAMBOO_DOOR, doorDrops(ModBlocks.LOCKABLE_BAMBOO_DOOR));
        addDrop(ModBlocks.LOCKABLE_BIRCH_DOOR, doorDrops(ModBlocks.LOCKABLE_BIRCH_DOOR));
        addDrop(ModBlocks.LOCKABLE_CHERRY_DOOR, doorDrops(ModBlocks.LOCKABLE_CHERRY_DOOR));
        addDrop(ModBlocks.LOCKABLE_DARK_OAK_DOOR, doorDrops(ModBlocks.LOCKABLE_DARK_OAK_DOOR));
        addDrop(ModBlocks.LOCKABLE_CRIMSON_DOOR, doorDrops(ModBlocks.LOCKABLE_CRIMSON_DOOR));
        addDrop(ModBlocks.LOCKABLE_IRON_DOOR, doorDrops(ModBlocks.LOCKABLE_IRON_DOOR)) ;
        addDrop(ModBlocks.LOCKABLE_JUNGLE_DOOR, doorDrops(ModBlocks.LOCKABLE_JUNGLE_DOOR));
        addDrop(ModBlocks.LOCKABLE_MANGROVE_DOOR, doorDrops(ModBlocks.LOCKABLE_MANGROVE_DOOR));
        addDrop(ModBlocks.LOCKABLE_OAK_DOOR, doorDrops(ModBlocks.LOCKABLE_OAK_DOOR));
        addDrop(ModBlocks.LOCKABLE_SPRUCE_DOOR, doorDrops(ModBlocks.LOCKABLE_SPRUCE_DOOR));
        addDrop(ModBlocks.LOCKABLE_WARPED_DOOR, doorDrops(ModBlocks.LOCKABLE_WARPED_DOOR));


    }
}

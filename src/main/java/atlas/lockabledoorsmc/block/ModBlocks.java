package atlas.lockabledoorsmc.block;

import atlas.lockabledoorsmc.LockableDoorsMC;
import atlas.lockabledoorsmc.block.custom.Lockable_Doors;
import atlas.lockabledoorsmc.item.ModItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, boolean shouldRegisterItem) {

        Block block = blockFactory.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(LockableDoorsMC.MOD_ID, name))));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, Identifier.of(LockableDoorsMC.MOD_ID, name), block);
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LockableDoorsMC.MOD_ID, name));
    }

    public static final Block LOCKABLE_IRON_DOOR = register(
            "lockable-iron-door",
            properties -> new Lockable_Doors(BlockSetType.IRON,
                    properties.sounds(BlockSoundGroup.IRON).requiresTool().nonOpaque()),
            true);

    public static final Block LOCKABLE_OAK_DOOR = register(
            "lockable-oak-door",
            properties -> new Lockable_Doors(BlockSetType.OAK,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_SPRUCE_DOOR = register(
            "lockable-spruce-door",
            properties -> new Lockable_Doors(BlockSetType.SPRUCE,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_BIRCH_DOOR = register(
            "lockable-birch-door",
            properties -> new Lockable_Doors(BlockSetType.BIRCH,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_JUNGLE_DOOR = register(
            "lockable-jungle-door",
            properties -> new Lockable_Doors(BlockSetType.JUNGLE,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_ACACIA_DOOR = register(
            "lockable-acacia-door",
            properties -> new Lockable_Doors(BlockSetType.ACACIA,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_DARK_OAK_DOOR = register(
            "lockable-dark-oak-door",
            properties -> new Lockable_Doors(BlockSetType.DARK_OAK,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_MANGROVE_DOOR = register(
            "lockable-mangrove-door",
            properties -> new Lockable_Doors(BlockSetType.MANGROVE,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_CHERRY_DOOR = register(
            "lockable-cherry-door",
            properties -> new Lockable_Doors(BlockSetType.CHERRY,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_BAMBOO_DOOR = register(
            "lockable-bamboo-door",
            properties -> new Lockable_Doors(BlockSetType.BAMBOO,
                    properties.sounds(BlockSoundGroup.BAMBOO).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_CRIMSON_DOOR = register(
            "lockable-crimson-door",
            properties -> new Lockable_Doors(BlockSetType.CRIMSON,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );
    public static final Block LOCKABLE_WARPED_DOOR = register(
            "lockable-warped-door",
            properties -> new Lockable_Doors(BlockSetType.WARPED,
                    properties.sounds(BlockSoundGroup.WOOD).nonOpaque()),
            true
    );

    //Will add copper at a later date.

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.LOCKABLE_DOORS_MC_KEY).register((itemGroup) -> {
            itemGroup.add(ModBlocks.LOCKABLE_IRON_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_SPRUCE_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_OAK_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_DARK_OAK_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_MANGROVE_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_BAMBOO_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_ACACIA_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_WARPED_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_CRIMSON_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_CHERRY_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_JUNGLE_DOOR.asItem());
            itemGroup.add(ModBlocks.LOCKABLE_BIRCH_DOOR.asItem());
        });
    }
}
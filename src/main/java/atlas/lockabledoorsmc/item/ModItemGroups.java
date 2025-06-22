package atlas.lockabledoorsmc.item;

import atlas.lockabledoorsmc.LockableDoorsMC;
import atlas.lockabledoorsmc.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> LOCKABLE_DOORS_MC_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LockableDoorsMC.MOD_ID, "item_group"));

    public static final ItemGroup LOCKABLE_DOORS_MC = FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.UNLOCKING_KEY))
            .icon(() -> new ItemStack(ModItems.UNLOCKING_KEY))
            .displayName(Text.translatable("itemGroup.lockable-doors-mc"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.UNLOCKING_KEY);

                entries.add(ModBlocks.LOCKABLE_ACACIA_DOOR);
                entries.add(ModBlocks.LOCKABLE_BAMBOO_DOOR);
                entries.add(ModBlocks.LOCKABLE_BIRCH_DOOR);
                entries.add(ModBlocks.LOCKABLE_CHERRY_DOOR);
                entries.add(ModBlocks.LOCKABLE_CRIMSON_DOOR);
                entries.add(ModBlocks.LOCKABLE_DARK_OAK_DOOR);
                entries.add(ModBlocks.LOCKABLE_IRON_DOOR);
                entries.add(ModBlocks.LOCKABLE_JUNGLE_DOOR);
                entries.add(ModBlocks.LOCKABLE_MANGROVE_DOOR);
                entries.add(ModBlocks.LOCKABLE_OAK_DOOR);
                entries.add(ModBlocks.LOCKABLE_SPRUCE_DOOR);
                entries.add(ModBlocks.LOCKABLE_WARPED_DOOR);


            }).build();

    public static void initialize() {

    }
}
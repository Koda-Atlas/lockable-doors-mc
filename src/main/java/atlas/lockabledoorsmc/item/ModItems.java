package atlas.lockabledoorsmc.item;

import atlas.lockabledoorsmc.LockableDoorsMC;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static atlas.lockabledoorsmc.item.ModItemGroups.*;

public class ModItems {

	public static final Item UNLOCKING_KEY = registerItem("key", Item::new, new Item.Settings().maxCount(1));

	private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
		final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LockableDoorsMC.MOD_ID, name));
		return Items.register(registryKey, factory, settings);
	}

	public static void initialize() {
		// Register the group.
		Registry.register(Registries.ITEM_GROUP, LOCKABLE_DOORS_MC_KEY, LOCKABLE_DOORS_MC);

		// Register items to the custom item group.
		ItemGroupEvents.modifyEntriesEvent(LOCKABLE_DOORS_MC_KEY).register(itemGroup -> {
			itemGroup.add(UNLOCKING_KEY);
		});
	}

}

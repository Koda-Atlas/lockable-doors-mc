package atlas.lockabledoorsmc;

import atlas.lockabledoorsmc.block.ModBlocks;
import atlas.lockabledoorsmc.item.ModItemGroups;
import atlas.lockabledoorsmc.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LockableDoorsMC implements ModInitializer {
	public static final String MOD_ID = "lockable-doors-mc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.initialize();
		ModItems.initialize();
		ModBlocks.initialize();
	}
}
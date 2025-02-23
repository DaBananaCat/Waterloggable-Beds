package banana.waterbeds;

import banana.waterbeds.init.BlockInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Waterbeds implements ModInitializer {
	public static final String MOD_ID = "waterbeds";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static ResourceLocation asId(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {

		BlockInit.registerBedBlocks();
	}
}
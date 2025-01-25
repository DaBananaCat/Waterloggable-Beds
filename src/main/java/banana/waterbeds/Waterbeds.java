package banana.waterbeds;

import banana.waterbeds.init.BlockInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Waterbeds implements ModInitializer {
	public static final String MOD_ID = "waterbeds";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// From More Bed Variants
	public static ResourceLocation asID(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.MORE_BED_VARIANT_BLOCK_ENTITY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreBedVariants.asId("more_bed_variants"), BlockEntityType.Builder.of(MoreBedVariantBlockEntity::new, planks_beds.toArray(Block[]::new)).build());
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		BlockInit.registerBedBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
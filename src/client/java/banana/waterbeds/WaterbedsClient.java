package banana.waterbeds;

import banana.waterbeds.init.BlockInit;
import banana.waterbeds.renderer.WaterbedRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class WaterbedsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockEntityRenderers.register(BlockInit.WATERBED_BLOCK_ENTITY, WaterbedRenderer::new);
	}
}
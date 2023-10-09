package net.mcreator.dota.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.dota.client.renderer.BlightStoneRenderer;
import net.mcreator.dota.client.renderer.BandofelvenskinRenderer;
import net.mcreator.dota.client.model.Modelelvenskin2;
import net.mcreator.dota.client.model.Modelblightstone;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DotaModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(DotaModLayerDefinitions.BANDOFELVENSKIN, Modelelvenskin2::createBodyLayer);
		evt.registerLayerDefinition(DotaModLayerDefinitions.BLIGHT_STONE, Modelblightstone::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(DotaModItems.BANDOFELVENSKIN.get(), BandofelvenskinRenderer::new);
		CuriosRendererRegistry.register(DotaModItems.BLIGHT_STONE.get(), BlightStoneRenderer::new);
	}
}

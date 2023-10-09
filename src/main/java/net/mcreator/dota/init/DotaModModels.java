
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dota.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dota.client.model.Modelelvenskin2;
import net.mcreator.dota.client.model.Modelelvenskin;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DotaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelelvenskin2.LAYER_LOCATION, Modelelvenskin2::createBodyLayer);
		event.registerLayerDefinition(Modelelvenskin.LAYER_LOCATION, Modelelvenskin::createBodyLayer);
	}
}

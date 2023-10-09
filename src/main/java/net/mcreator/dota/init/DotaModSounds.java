
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dota.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dota.DotaMod;

public class DotaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DotaMod.MODID);
	public static final RegistryObject<SoundEvent> HAUNT = REGISTRY.register("haunt", () -> new SoundEvent(new ResourceLocation("dota", "haunt")));
}

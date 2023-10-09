
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dota.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dota.item.MusicdischauntItem;
import net.mcreator.dota.DotaMod;

public class DotaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DotaMod.MODID);
	public static final RegistryObject<Item> MUSICDISCHAUNT = REGISTRY.register("musicdischaunt", () -> new MusicdischauntItem());
}

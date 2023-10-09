
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dota.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dota.item.MusicdiscpsibladesItem;
import net.mcreator.dota.item.MusicdischauntItem;
import net.mcreator.dota.item.BlightStoneItem;
import net.mcreator.dota.item.BattlefuryItem;
import net.mcreator.dota.item.BandofelvenskinItem;
import net.mcreator.dota.DotaMod;

public class DotaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DotaMod.MODID);
	public static final RegistryObject<Item> BATTLEFURY = REGISTRY.register("battlefury", () -> new BattlefuryItem());
	public static final RegistryObject<Item> MUSICDISCHAUNT = REGISTRY.register("musicdischaunt", () -> new MusicdischauntItem());
	public static final RegistryObject<Item> MUSICDISCPSIBLADES = REGISTRY.register("musicdiscpsiblades", () -> new MusicdiscpsibladesItem());
	public static final RegistryObject<Item> BANDOFELVENSKIN = REGISTRY.register("bandofelvenskin", () -> new BandofelvenskinItem());
	public static final RegistryObject<Item> BLIGHT_STONE = REGISTRY.register("blight_stone", () -> new BlightStoneItem());
}

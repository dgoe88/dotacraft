
package net.mcreator.dota.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dota.init.DotaModTabs;

public class MusicdischauntItem extends RecordItem {
	public MusicdischauntItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dota:haunt")), new Item.Properties().tab(DotaModTabs.TAB_DOTA_RECORDS).stacksTo(1).rarity(Rarity.RARE), 2100);
	}
}


package net.mcreator.dota.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

public class MusicdischauntItem extends RecordItem {
	public MusicdischauntItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dota:haunt")), new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1).rarity(Rarity.RARE), 2100);
	}
}

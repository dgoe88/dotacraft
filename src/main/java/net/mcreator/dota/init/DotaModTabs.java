
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dota.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DotaModTabs {
	public static CreativeModeTab TAB_DOTA_RECORDS;

	public static void load() {
		TAB_DOTA_RECORDS = new CreativeModeTab("tabdota_records") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DotaModItems.MUSICDISCHAUNT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

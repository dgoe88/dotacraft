
package net.mcreator.dota.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.dota.init.DotaModTabs;

import java.util.List;

public class BlightStoneItem extends Item implements ICurioItem {
	public BlightStoneItem() {
		super(new Item.Properties().tab(DotaModTabs.TAB_DOTA_CURIOS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u041B\u0438\u0448\u0430\u044E\u0449\u0438\u0439 \u0441\u0442\u043E\u0439\u043A\u043E\u0441\u0442\u0438 \u043A\u0430\u043C\u0435\u043D\u044C"));
		list.add(Component.literal("\u043E\u0431\u043D\u0430\u0440\u0443\u0436\u0435\u043D\u043D\u044B\u0439 \u043D\u0430 \u043F\u043E\u043B\u044F\u0445 \u0412\u0435\u0447\u043D\u043E\u0439 \u0431\u043E\u0439\u043D\u0438."));
	}
}

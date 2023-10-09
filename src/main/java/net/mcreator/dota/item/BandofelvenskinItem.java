
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

public class BandofelvenskinItem extends Item implements ICurioItem {
	public BandofelvenskinItem() {
		super(new Item.Properties().tab(DotaModTabs.TAB_DOTA_CURIOS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u042D\u0442\u0443 \u044D\u043B\u0430\u0441\u0442\u0438\u0447\u043D\u0443\u044E \u0442\u043A\u0430\u043D\u044C \u0447\u0430\u0441\u0442\u043E \u0438\u0441\u043F\u043E\u043B\u044C\u0437\u0443\u044E\u0442"));
		list.add(Component
				.literal("\u0442\u0430\u043A \u043A\u0430\u043A \u043E\u043D\u0430 \u043B\u0435\u0433\u043A\u0430 \u0438 \u043D\u0435 \u0441\u043A\u043E\u0432\u044B\u0432\u0430\u0435\u0442 \u0434\u0432\u0438\u0436\u0435\u043D\u0438\u044F."));
	}
}

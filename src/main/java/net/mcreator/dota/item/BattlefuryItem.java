
package net.mcreator.dota.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.dota.init.DotaModTabs;

import java.util.List;

public class BattlefuryItem extends AxeItem {
	public BattlefuryItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3.15f, new Item.Properties().tab(DotaModTabs.TAB_DOTA_WEAPON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal(
				"\u0412\u043B\u0430\u0434\u0435\u043B\u0435\u0446 \u044D\u0442\u043E\u0433\u043E \u043C\u043E\u0433\u0443\u0447\u0435\u0433\u043E \u0442\u043E\u043F\u043E\u0440\u0430 \u043C\u043E\u0436\u0435\u0442 \u0432\u044B\u043A\u0430\u0448\u0438\u0432\u0430\u0442\u044C \u0432\u0440\u0430\u0433\u043E\u0432 \u0446\u0435\u043B\u044B\u043C\u0438 \u0440\u044F\u0434\u0430\u043C\u0438."));
	}
}

package net.mcreator.mossarmor.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.mossarmor.init.MossArmorModItems;

public class MossAxeItem extends AxeItem {
	public MossAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1150;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MossArmorModItems.MOSS_PART.get()));
			}
		}, 1, -2.3f, new Item.Properties());
	}
}
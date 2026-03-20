package net.mcreator.mossarmor.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mossarmor.init.MossArmorModItems;

public class MossPickaxeItem extends PickaxeItem {
	public MossPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1150;
			}

			public float getSpeed() {
				return 7.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 1, -3f, new Item.Properties());
	}
}
package net.mcreator.mossarmor.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mossarmor.init.MossArmorModItems;

public class MossSwordItem extends SwordItem {
	public MossSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1150;
			}

			public float getSpeed() {
				return 4.5f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MossArmorModItems.MOSS_PART.get()));
			}
		}, 3, -2.5f, new Item.Properties());
	}
}
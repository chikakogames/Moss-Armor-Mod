/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mossarmor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mossarmor.item.MossSwordItem;
import net.mcreator.mossarmor.item.MossShovelItem;
import net.mcreator.mossarmor.item.MossPickaxeItem;
import net.mcreator.mossarmor.item.MossPartItem;
import net.mcreator.mossarmor.item.MossHoeItem;
import net.mcreator.mossarmor.item.MossAxeItem;
import net.mcreator.mossarmor.item.MossArmorItem;
import net.mcreator.mossarmor.MossArmorMod;

public class MossArmorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MossArmorMod.MODID);
	public static final RegistryObject<Item> MOSS_ARMOR_HELMET = REGISTRY.register("moss_armor_helmet", () -> new MossArmorItem.Helmet());
	public static final RegistryObject<Item> MOSS_ARMOR_CHESTPLATE = REGISTRY.register("moss_armor_chestplate", () -> new MossArmorItem.Chestplate());
	public static final RegistryObject<Item> MOSS_ARMOR_LEGGINGS = REGISTRY.register("moss_armor_leggings", () -> new MossArmorItem.Leggings());
	public static final RegistryObject<Item> MOSS_ARMOR_BOOTS = REGISTRY.register("moss_armor_boots", () -> new MossArmorItem.Boots());
	public static final RegistryObject<Item> MOSS_PART = REGISTRY.register("moss_part", () -> new MossPartItem());
	public static final RegistryObject<Item> MOSS_SWORD = REGISTRY.register("moss_sword", () -> new MossSwordItem());
	public static final RegistryObject<Item> MOSS_AXE = REGISTRY.register("moss_axe", () -> new MossAxeItem());
	public static final RegistryObject<Item> MOSS_PICKAXE = REGISTRY.register("moss_pickaxe", () -> new MossPickaxeItem());
	public static final RegistryObject<Item> MOSS_SHOVEL = REGISTRY.register("moss_shovel", () -> new MossShovelItem());
	public static final RegistryObject<Item> MOSS_HOE = REGISTRY.register("moss_hoe", () -> new MossHoeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mossarmor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mossarmor.MossArmorMod;

public class MossArmorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MossArmorMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOSS_UTILITIES = REGISTRY.register("moss_utilities",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.moss_armor.moss_utilities")).icon(() -> new ItemStack(MossArmorModItems.MOSS_PART.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MossArmorModItems.MOSS_ARMOR_HELMET.get());
				tabData.accept(MossArmorModItems.MOSS_ARMOR_CHESTPLATE.get());
				tabData.accept(MossArmorModItems.MOSS_ARMOR_LEGGINGS.get());
				tabData.accept(MossArmorModItems.MOSS_ARMOR_BOOTS.get());
				tabData.accept(MossArmorModItems.MOSS_PART.get());
				tabData.accept(MossArmorModItems.MOSS_SWORD.get());
				tabData.accept(MossArmorModItems.MOSS_AXE.get());
				tabData.accept(MossArmorModItems.MOSS_PICKAXE.get());
				tabData.accept(MossArmorModItems.MOSS_SHOVEL.get());
				tabData.accept(MossArmorModItems.MOSS_HOE.get());
			}).build());
}
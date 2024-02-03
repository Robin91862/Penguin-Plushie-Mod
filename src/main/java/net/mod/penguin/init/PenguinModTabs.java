
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.penguin.init;

import net.mod.penguin.PenguinMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class PenguinModTabs {
	public static ResourceKey<CreativeModeTab> TAB_PENGUIN_ADDON = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(PenguinMod.MODID, "penguin_addon"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_PENGUIN_ADDON,
				FabricItemGroup.builder().title(Component.translatable("item_group." + PenguinMod.MODID + ".penguin_addon")).icon(() -> new ItemStack(PenguinModBlocks.PENGUIN_PLUSHIE)).build());
	}
}

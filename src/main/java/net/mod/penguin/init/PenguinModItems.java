/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.penguin.init;

import net.mod.penguin.PenguinMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class PenguinModItems {
	public static Item PENGUIN_PLUSHIE;

	public static void load() {
		PENGUIN_PLUSHIE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PenguinMod.MODID, "penguin_plushie"), new BlockItem(PenguinModBlocks.PENGUIN_PLUSHIE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(PenguinModTabs.TAB_PENGUIN_ADDON).register(content -> content.accept(PENGUIN_PLUSHIE));
	}

	public static void clientLoad() {
	}
}

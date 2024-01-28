
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.penguin.init;

import net.mod.penguin.PenguinMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class PenguinModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PenguinMod.MODID);
	public static final RegistryObject<Item> PENGUIN_PLUSHIE = block(PenguinModBlocks.PENGUIN_PLUSHIE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

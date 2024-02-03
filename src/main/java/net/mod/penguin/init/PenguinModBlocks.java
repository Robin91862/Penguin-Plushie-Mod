
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.penguin.init;

import net.mod.penguin.block.PenguinPlushieBlock;
import net.mod.penguin.PenguinMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PenguinModBlocks {
	public static Block PENGUIN_PLUSHIE;

	public static void load() {
		PENGUIN_PLUSHIE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PenguinMod.MODID, "penguin_plushie"), new PenguinPlushieBlock());
	}

	public static void clientLoad() {
		PenguinPlushieBlock.clientInit();
	}
}

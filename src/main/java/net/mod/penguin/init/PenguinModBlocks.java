
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.penguin.init;

import net.mod.penguin.block.PenguinPlushieBlock;
import net.mod.penguin.PenguinMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PenguinModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PenguinMod.MODID);
	public static final RegistryObject<Block> PENGUIN_PLUSHIE = REGISTRY.register("penguin_plushie", () -> new PenguinPlushieBlock());
}

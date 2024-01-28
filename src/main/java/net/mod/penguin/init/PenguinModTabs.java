
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.penguin.init;

import net.mod.penguin.PenguinMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class PenguinModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PenguinMod.MODID);
	public static final RegistryObject<CreativeModeTab> PENGUIN_ADDON = REGISTRY.register("penguin_addon",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.penguin.penguin_addon")).icon(() -> new ItemStack(PenguinModBlocks.PENGUIN_PLUSHIE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PenguinModBlocks.PENGUIN_PLUSHIE.get().asItem());
			})

					.build());
}

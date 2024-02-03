/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mod.penguin;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mod.penguin.init.PenguinModTabs;
import net.mod.penguin.init.PenguinModItems;
import net.mod.penguin.init.PenguinModBlocks;

import net.fabricmc.api.ModInitializer;

public class PenguinMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "penguin";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PenguinMod");

		PenguinModTabs.load();

		PenguinModBlocks.load();
		PenguinModItems.load();

	}
}

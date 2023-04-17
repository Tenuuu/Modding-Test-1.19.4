package net.tenu.moddingtest;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.tenu.moddingtest.block.ModBlocks;
import net.tenu.moddingtest.block.ModFlammableBlockRegistry;
import net.tenu.moddingtest.item.ModItemGroup;
import net.tenu.moddingtest.item.ModItems;
import net.tenu.moddingtest.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingTest implements ModInitializer {
	public static final String MOD_ID = "moddingtest";
	public static final Logger LOGGER = LoggerFactory.getLogger("moddingtest");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlocks();

		StrippableBlockRegistry.register(ModBlocks.TRUFFULA_LOG, ModBlocks.STRIPPED_TRUFFULA_LOG);
		StrippableBlockRegistry.register(ModBlocks.TRUFFULA_WOOD, ModBlocks.STRIPPED_TRUFFULA_WOOD);
	}
}
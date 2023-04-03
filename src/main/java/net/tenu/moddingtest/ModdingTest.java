package net.tenu.moddingtest;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemGroup;
import net.tenu.moddingtest.item.ModItemGroup;
import net.tenu.moddingtest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingTest implements ModInitializer {
	public static final String MOD_ID = "moddingtest";
	public static final Logger LOGGER = LoggerFactory.getLogger("moddingtest");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}
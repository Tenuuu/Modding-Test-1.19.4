package net.tenu.moddingtest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tenu.moddingtest.ModdingTest;

public class ModItems {
    public static final Item SWORD_BADGE = registerItem("sword_badge",
            new Item(new FabricItemSettings()));
    public static final Item AXE_BADGE = registerItem("axe_badge",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModdingTest.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, SWORD_BADGE);
        addToItemGroup(ItemGroups.INGREDIENTS, AXE_BADGE);

        addToItemGroup(ModItemGroup.BADGES, SWORD_BADGE);
        addToItemGroup(ModItemGroup.BADGES, AXE_BADGE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        ModdingTest.LOGGER.info("Registering mod items for " + ModdingTest.MOD_ID);

        addItemsToItemGroup();
    }
}

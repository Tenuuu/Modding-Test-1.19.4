package net.tenu.moddingtest.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.TRUFFULA_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_TRUFFULA_LOG, 5, 5);
        registry.add(ModBlocks.TRUFFULA_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_TRUFFULA_WOOD, 5, 5);

        registry.add(ModBlocks.TRUFFULA_PLANKS, 5, 20);
        registry.add(ModBlocks.TRUFFULA_TUFT, 30, 60);
    }
}

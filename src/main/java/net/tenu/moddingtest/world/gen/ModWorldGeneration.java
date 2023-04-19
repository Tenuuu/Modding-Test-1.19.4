package net.tenu.moddingtest.world.gen;

import net.tenu.moddingtest.world.ModOrePlacement;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();
    }

}

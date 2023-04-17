package net.tenu.moddingtest.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.tenu.moddingtest.world.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class TruffulaSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.TRUFFULA_KEY;
    }
}

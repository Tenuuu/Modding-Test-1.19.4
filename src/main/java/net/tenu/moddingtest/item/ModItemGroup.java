package net.tenu.moddingtest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tenu.moddingtest.ModdingTest;

public class ModItemGroup {
    public static ItemGroup BADGES;

    public static void registerItemGroups() {
        BADGES = FabricItemGroup.builder(new Identifier(ModdingTest.MOD_ID, "badges"))
                .displayName(Text.translatable("itemgroup.badges"))
                .icon(() -> new ItemStack(ModItems.SWORD_BADGE)).build();

    }

}

package net.tenu.moddingtest.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tenu.moddingtest.item.ModItems;

public class RightClickDetectionBlock extends Block {
    public RightClickDetectionBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (hand == Hand.MAIN_HAND && !world.isClient()) {
            if (itemStack.isOf(ModItems.COMMON_KEY)) {
                player.sendMessage(Text.literal("Got your key >:)"), false);
                itemStack.decrement(1);

                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }
}

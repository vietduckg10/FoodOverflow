package com.ducvn.foodoverflow.item.equipment.pickaxe;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class CaramelPickaxe extends FoodOverflowPickaxe {
    public CaramelPickaxe(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
        tooltip.add(new TranslationTextComponent(
                        "\u00A7dTasty\u00A7r"
                )
        );
    }

    @Override
    public boolean mineBlock(ItemStack stack, World world, BlockState p_179218_3_, BlockPos pos, LivingEntity p_179218_5_) {
        if (!world.isClientSide){
            Random roll = new Random();
            if (roll.nextInt(100) < 10){
                if (world.getBlockEntity(pos.above()) == null){
                    pos = pos.above();
                }
                ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), Items.SUGAR.getDefaultInstance());
                itemEntity.spawnAtLocation(itemEntity.getItem());
            }
        }
        return super.mineBlock(stack, world, p_179218_3_, pos, p_179218_5_);
    }
}

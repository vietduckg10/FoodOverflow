package com.ducvn.foodoverflow.item.food.sweet;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class ChorusFruitJamItem extends FoodOverflowSweetItem{
    public ChorusFruitJamItem(Item.Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
        ItemStack itemstack = super.finishUsingItem(p_77654_1_, p_77654_2_, p_77654_3_);
        if (!p_77654_2_.isClientSide) {
            Random  roll = new Random();
            if (roll.nextInt(10) < 3) {
                double d0 = p_77654_3_.getX();
                double d1 = p_77654_3_.getY();
                double d2 = p_77654_3_.getZ();

                for (int i = 0; i < 16; ++i) {
                    double d3 = p_77654_3_.getX() + (p_77654_3_.getRandom().nextDouble() - 0.5D) * 16.0D;
                    double d4 = MathHelper.clamp(p_77654_3_.getY() + (double) (p_77654_3_.getRandom().nextInt(16) - 8), 0.0D, (double) (p_77654_2_.getHeight() - 1));
                    double d5 = p_77654_3_.getZ() + (p_77654_3_.getRandom().nextDouble() - 0.5D) * 16.0D;
                    if (p_77654_3_.isPassenger()) {
                        p_77654_3_.stopRiding();
                    }

                    net.minecraftforge.event.entity.living.EntityTeleportEvent.ChorusFruit event = net.minecraftforge.event.ForgeEventFactory.onChorusFruitTeleport(p_77654_3_, d3, d4, d5);
                    if (event.isCanceled()) return itemstack;
                    if (p_77654_3_.randomTeleport(event.getTargetX(), event.getTargetY(), event.getTargetZ(), true)) {
                        SoundEvent soundevent = p_77654_3_ instanceof FoxEntity ? SoundEvents.FOX_TELEPORT : SoundEvents.CHORUS_FRUIT_TELEPORT;
                        p_77654_2_.playSound((PlayerEntity) null, d0, d1, d2, soundevent, SoundCategory.PLAYERS, 1.0F, 1.0F);
                        p_77654_3_.playSound(soundevent, 1.0F, 1.0F);
                        break;
                    }
                }

                if (p_77654_3_ instanceof PlayerEntity) {
                    ((PlayerEntity) p_77654_3_).getCooldowns().addCooldown(this, 20);
                }
            }
        }

        return itemstack;
    }
}

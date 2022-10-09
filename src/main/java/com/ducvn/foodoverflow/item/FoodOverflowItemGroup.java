package com.ducvn.foodoverflow.item;

import com.ducvn.foodoverflow.registry.FoodOverflowItemsRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FoodOverflowItemGroup {
    public static final ItemGroup FOOD_OVERFLOW_GROUP = new ItemGroup("foodoverflow") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoodOverflowItemsRegister.LOLLIPOP.get());
        }
    };
}

package com.ducvn.foodoverflow.world;

import com.ducvn.foodoverflow.FoodOverflowMod;
import com.ducvn.foodoverflow.world.gen.FoodOverflowOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FoodOverflowMod.MODID)
public class FoodOverflowWorldEvent {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        FoodOverflowOreGeneration.generateOres(event);
    }
}

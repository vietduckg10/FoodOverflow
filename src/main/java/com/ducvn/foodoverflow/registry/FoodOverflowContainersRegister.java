package com.ducvn.foodoverflow.registry;

import com.ducvn.foodoverflow.FoodOverflowMod;
import com.ducvn.foodoverflow.container.FoodProcessorContainer;
import com.ducvn.foodoverflow.container.OvenContainer;
import com.ducvn.foodoverflow.container.AgingChamberContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodOverflowContainersRegister {

    public static DeferredRegister<ContainerType<?>> CONTAINERS
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, FoodOverflowMod.MODID);
    public static void init(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }

    public static final RegistryObject<ContainerType<AgingChamberContainer>> AGING_CHAMBER_CONTAINER
            = CONTAINERS.register("aging_chamber_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.level;
                return new AgingChamberContainer(windowId, world, pos, inv, inv.player);
            })));

    public static final RegistryObject<ContainerType<OvenContainer>> OVEN_CONTAINER
            = CONTAINERS.register("oven_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.level;
                return new OvenContainer(windowId, world, pos, inv, inv.player);
            })));

    public static final RegistryObject<ContainerType<FoodProcessorContainer>> FOOD_PROCESSOR_CONTAINER
            = CONTAINERS.register("food_processor_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.level;
                return new FoodProcessorContainer(windowId, world, pos, inv, inv.player);
            })));
}

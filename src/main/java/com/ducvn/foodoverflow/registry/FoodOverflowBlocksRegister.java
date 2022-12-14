package com.ducvn.foodoverflow.registry;

import com.ducvn.foodoverflow.FoodOverflowMod;
import com.ducvn.foodoverflow.block.AgingChamberBlock;
import com.ducvn.foodoverflow.block.FoodOverflowBlock;
import com.ducvn.foodoverflow.block.FoodProcessorBlock;
import com.ducvn.foodoverflow.block.OvenBlock;
import com.ducvn.foodoverflow.item.FoodOverflowItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class FoodOverflowBlocksRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodOverflowMod.MODID);
    public static void init(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        FoodOverflowItemsRegister.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)));
    }

    public static final RegistryObject<Block> AGING_CHAMBER = registerBlock("aging_chamber",
            () -> new AgingChamberBlock(AbstractBlock.Properties.of(Material.METAL)
                    .strength(2.0F, 6.0F)
            ));

    public static final RegistryObject<Block> OVEN = registerBlock("oven",
            () -> new OvenBlock(AbstractBlock.Properties.of(Material.METAL)
                    .strength(2.0F, 6.0F)
            ));

    public static final RegistryObject<Block> FOOD_PROCESSOR = registerBlock("food_processor",
            () -> new FoodProcessorBlock(AbstractBlock.Properties.of(Material.METAL)
                    .strength(2.0F, 6.0F)
            ));

    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new FoodOverflowBlock(AbstractBlock.Properties.of(Material.STONE)
                    .strength(4.0F, 6.0F)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));

    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new FoodOverflowBlock(AbstractBlock.Properties.of(Material.STONE)
                    .strength(4.0F, 6.0F)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
}

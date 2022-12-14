package com.ducvn.foodoverflow.registry;

import com.ducvn.foodoverflow.FoodOverflowMod;
import com.ducvn.foodoverflow.item.FoodOverflowItemGroup;
import com.ducvn.foodoverflow.item.equipment.FoodOverflowItemTier;
import com.ducvn.foodoverflow.item.equipment.armor.CaramelArmorItem;
import com.ducvn.foodoverflow.item.equipment.armor.FoodOverflowArmorMaterial;
import com.ducvn.foodoverflow.item.equipment.armor.WheatArmorItem;
import com.ducvn.foodoverflow.item.equipment.axe.CaramelAxe;
import com.ducvn.foodoverflow.item.equipment.pickaxe.CaramelPickaxe;
import com.ducvn.foodoverflow.item.equipment.shovel.CaramelShovel;
import com.ducvn.foodoverflow.item.equipment.sword.CaramelSword;
import com.ducvn.foodoverflow.item.food.FoodOverflowFoodItem;
import com.ducvn.foodoverflow.item.food.bland.FoodOverflowBlandItem;
import com.ducvn.foodoverflow.item.food.savory.FoodOverflowSavoryItem;
import com.ducvn.foodoverflow.item.food.special.FortuneCookieItem;
import com.ducvn.foodoverflow.item.food.sweet.ChorusFruitJamItem;
import com.ducvn.foodoverflow.item.food.sweet.FoodOverflowSweetItem;
import com.ducvn.foodoverflow.item.food.healthy.FoodOverflowHealthyItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodOverflowItemsRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodOverflowMod.MODID);
    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_BAR = ITEMS.register("caramel_bar", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_HELMET = ITEMS.register("caramel_helmet", () ->
            new CaramelArmorItem(FoodOverflowArmorMaterial.CARAMEL, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_CHESTPLATE = ITEMS.register("caramel_chestplate", () ->
            new CaramelArmorItem(FoodOverflowArmorMaterial.CARAMEL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_LEGGINGS = ITEMS.register("caramel_leggings", () ->
            new CaramelArmorItem(FoodOverflowArmorMaterial.CARAMEL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_BOOTS = ITEMS.register("caramel_boots", () ->
            new CaramelArmorItem(FoodOverflowArmorMaterial.CARAMEL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );
//(harvestLevel, maxUse, efficiency, attackDamage, enchantability, repairMaterial)
//    CARAMEL(1, 100, 4.5F, 1.5F, 8, ()
//            -> Ingredient.of(FoodOverflowItemsRegister.CARAMEL_BAR.get()));

    public static final RegistryObject<Item> CARAMEL_SWORD = ITEMS.register("caramel_sword", () ->
            new CaramelSword(FoodOverflowItemTier.CARAMEL, 3, -2.2F,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_PICKAXE = ITEMS.register("caramel_pickaxe", () ->
            new CaramelPickaxe(FoodOverflowItemTier.CARAMEL, 1, -2.6F,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_AXE = ITEMS.register("caramel_axe", () ->
            new CaramelAxe(FoodOverflowItemTier.CARAMEL, 7, -3.0F,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CARAMEL_SHOVEL = ITEMS.register("caramel_shovel", () ->
            new CaramelShovel(FoodOverflowItemTier.CARAMEL, 1, -2.6F,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> LOLLIPOP = ITEMS.register("lollipop", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(2)
                                    .saturationMod(1f)
                                    .fast()
                                    .build())
            ).displayEatingEffect()
    );

    public static final RegistryObject<Item> GUMMY_WORM = ITEMS.register("gummy_worm", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(1)
                                    .saturationMod(2f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyHaste(100, 0)
                    .modifySpeedUp(-200,0)
    );

    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(1)
                                    .saturationMod(2f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyHaste(-200, 0)
                    .modifySpeedUp(100,0)
    );

    public static final RegistryObject<Item> APPLE_JAM = ITEMS.register("apple_jam", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .drinkable()
    );

    public static final RegistryObject<Item> BEETROOT_JAM = ITEMS.register("beetroot_jam", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(2)
                                    .saturationMod(0.5f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .drinkable()
                    .modifySpeedUp(-100,0)
                    .modifyHaste(-100,0)
    );

    public static final RegistryObject<Item> CHORUS_FRUIT_JAM = ITEMS.register("chorus_fruit_jam", () ->
            new ChorusFruitJamItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .drinkable()
    );

    public static final RegistryObject<Item> SWEET_BERRY_JAM = ITEMS.register("sweet_berry_jam", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(3)
                                    .saturationMod(0.2f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .drinkable()
                    .modifySpeedUp(-100,0)
                    .modifyHaste(-100,0)
    );

    public static final RegistryObject<Item> CARAMEL_PASTE = ITEMS.register("caramel_paste", () ->
            new FoodOverflowSweetItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(3)
                                    .saturationMod(0.2f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .drinkable()
                    .modifySpeedUp(100,0)
                    .modifyHaste(-100,0)
    );

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () ->
            new FoodOverflowBlandItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            ).alsoSavory()
    );

    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice", () ->
            new FoodOverflowBlandItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(1)
                                    .saturationMod(1f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .alsoSavory()
                    .modifyDamageRes(-100,0)
                    .modifyAbsorption(-100,0)
    );

    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(6)
                                    .saturationMod(1f)
                                    .build())
            )
                    .displayEatingEffect()
                    .alsoBland()
    );

    public static final RegistryObject<Item> PIG_FAT = ITEMS.register("pig_fat", () ->
            new FoodOverflowFoodItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> COOKING_OIL = ITEMS.register("cooking_oil", () ->
            new FoodOverflowFoodItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CRISPY_PORK_RIND = ITEMS.register("crispy_pork_rind", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(1)
                                    .saturationMod(0.5f)
                                    .fast()
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(-100,0)
                    .modifyAbsorption(-100,0)
    );

    public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(10)
                                    .saturationMod(0.8f)
                                    .build())
            )
                    .displayEatingEffect()
    );

    public static final RegistryObject<Item> KELP_SOUP = ITEMS.register("kelp_soup", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(9)
                                    .saturationMod(0.6f)
                                    .build())
            )
                    .displayEatingEffect()
                    .alsoHealthy()
    );

    public static final RegistryObject<Item> WHEAT_HELMET = ITEMS.register("wheat_helmet", () ->
            new WheatArmorItem(FoodOverflowArmorMaterial.WHEAT, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> WHEAT_CHESTPLATE = ITEMS.register("wheat_chestplate", () ->
            new WheatArmorItem(FoodOverflowArmorMaterial.WHEAT, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> WHEAT_LEGGINGS = ITEMS.register("wheat_leggings", () ->
            new WheatArmorItem(FoodOverflowArmorMaterial.WHEAT, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> WHEAT_BOOTS = ITEMS.register("wheat_boots", () ->
            new WheatArmorItem(FoodOverflowArmorMaterial.WHEAT, EquipmentSlotType.FEET,
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () ->
            new FoodOverflowFoodItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () ->
            new FoodOverflowFoodItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
            )
    );

    public static final RegistryObject<Item> CHOPED_STEAK = ITEMS.register("choped_steak", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(3)
                                    .saturationMod(0.8f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(-50,0)
                    .modifyAbsorption(-50,0)
    );

    public static final RegistryObject<Item> COOKED_CACTUS = ITEMS.register("cooked_cactus", () ->
            new FoodOverflowHealthyItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(2)
                                    .saturationMod(0.25f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyRegeneration(-100, 0)
                    .alsoBland()
    );

    public static final RegistryObject<Item> CACTUS_TACO = ITEMS.register("cactus_taco", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(6)
                                    .saturationMod(0.8f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(100, 0)
                    .modifyAbsorption(100, 0)
                    .modifyRegeneration(100, 0)
                    .alsoHealthy()
                    .alsoBland()
    );

    public static final RegistryObject<Item> FRENCH_FRIES = ITEMS.register("french_fries", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(2)
                                    .saturationMod(0.6f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(-100, 0)
                    .modifyAbsorption(-100, 0)
                    .alsoBland()
    );

    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(2)
                                    .saturationMod(0.6f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(-100, 0)
                    .modifyAbsorption(-100, 0)
                    .alsoBland()
    );

    public static final RegistryObject<Item> EGG_FRIED_RICE = ITEMS.register("egg_fried_rice", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(100, 1)
                    .modifyAbsorption(100, 1)
                    .modifySpeeddown(100, 2)
                    .alsoBland()
    );

    public static final RegistryObject<Item> CARAMELIZED_PORK_AND_EGGS = ITEMS.register("caramelized_pork_and_eggs", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(10)
                                    .saturationMod(0.6f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(100, 2)
                    .modifySpeeddown(100, 2)
                    .alsoBland()
    );

    public static final RegistryObject<Item> PHO = ITEMS.register("pho", () ->
            new FoodOverflowSavoryItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(10)
                                    .saturationMod(0.8f)
                                    .build())
            )
                    .displayEatingEffect()
                    .modifyDamageRes(200, 0)
                    .modifySpeeddown(100, 1)
                    .alsoBland()
    );

    public static final RegistryObject<Item> FORTUNE_COOKIE = ITEMS.register("fortune_cookie", () ->
            new FortuneCookieItem(
                    new Item.Properties().tab(FoodOverflowItemGroup.FOOD_OVERFLOW_GROUP)
                            .food(new Food.Builder()
                                    .nutrition(1)
                                    .saturationMod(1f)
                                    .fast()
                                    .build())
            )
    );
}
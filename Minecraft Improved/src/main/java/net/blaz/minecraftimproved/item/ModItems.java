package net.blaz.minecraftimproved.item;

import net.blaz.minecraftimproved.block.custom.*;
import net.blaz.minecraftimproved.item.custom.Scanner;
import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,minecraftimproved.MOD_ID);
//INGOTS
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB)));
    public static final RegistryObject<Item> END_INGOT = ITEMS.register("end_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB)));
    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB)));


//CHROMIUM ARMOR
    public static final RegistryObject<Item> CHROMIUM_BOOTS = ITEMS.register("chromium_boots",
            () -> new ChromiumArmorSet(ModArmorMaterial.Chromium, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1150)));
    public static final RegistryObject<Item> CHROMIUM_LEGGINGS = ITEMS.register("chromium_leggings",
            () -> new ChromiumArmorSet(ModArmorMaterial.Chromium, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1150)));
    public static final RegistryObject<Item> CHROMIUM_CHESTPLATE = ITEMS.register("chromium_chestplate",
            () -> new ChromiumArmorSet(ModArmorMaterial.Chromium, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1350)));
    public static final RegistryObject<Item> CHROMIUM_HELMET = ITEMS.register("chromium_helmet",
            () -> new ChromiumArmorSet(ModArmorMaterial.Chromium, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1100)));
//SILVER ARMOR
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new SilverArmorSet(ModArmorMaterial.Silver, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(750)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new SilverArmorSet(ModArmorMaterial.Silver, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(850)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new SilverArmorSet(ModArmorMaterial.Silver, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(900)));
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new SilverArmorSet(ModArmorMaterial.Silver, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(750)));
//END
    public static final RegistryObject<Item> END_BOOTS = ITEMS.register("end_boots",
            () -> new EndArmorSet(ModArmorMaterial.End, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1500)));
    public static final RegistryObject<Item> END_LEGGINGS = ITEMS.register("end_leggings",
            () -> new EndArmorSet(ModArmorMaterial.End, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(2000)));
    public static final RegistryObject<Item> END_CHESTPLATE = ITEMS.register("end_chestplate",
            () -> new EndArmorSet(ModArmorMaterial.End, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1750)));
    public static final RegistryObject<Item> END_HELMET = ITEMS.register("end_helmet",
            () -> new EndArmorSet(ModArmorMaterial.End, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1500)));
    public static final RegistryObject<Item> END_SWORD = ITEMS.register("end_sword",
            () -> new EndSwordItem(ModTiers.END, 8, 0,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(3000)));
//SILVER
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new ChromiumSwordItem(ModTiers.SILVER, 3, -2,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(650)));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModTiers.SILVER, 0, -2,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(750)));
    public static final RegistryObject<Item> SILVER_SHOVEL= ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModTiers.SILVER, -1, -2,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(350)));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModTiers.SILVER, 5, -3,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(500)));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModTiers.SILVER, -2, -1,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(450)));
 //CHROMIUM
    public static final RegistryObject<Item> CHROMIUM_SWORD = ITEMS.register("chromium_sword",
            () -> new ChromiumSwordItem(ModTiers.CHROMIUM, 5, -2,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1500)));
    public static final RegistryObject<Item> CHROMIUM_PICKAXE = ITEMS.register("chromium_pickaxe",
            () -> new PickaxeItem(ModTiers.CHROMIUM, 1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1500)));
    public static final RegistryObject<Item> CHROMIUM_SHOVEL= ITEMS.register("chromium_shovel",
            () -> new ShovelItem(ModTiers.CHROMIUM, 0, -2,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(850)));
    public static final RegistryObject<Item> CHROMIUM_AXE = ITEMS.register("chromium_axe",
            () -> new AxeItem(ModTiers.CHROMIUM, 6, -2,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(1250)));
    public static final RegistryObject<Item> CHROMIUM_HOE = ITEMS.register("chromium_hoe",
            () -> new HoeItem(ModTiers.CHROMIUM, -1, 0,
                    new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(750)));
  //Custom
    public static final RegistryObject<Item> SCANNER = ITEMS.register("scanner",
            () -> new Scanner(new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB).durability(150)));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }




}

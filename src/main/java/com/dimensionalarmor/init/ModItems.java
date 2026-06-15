package com.dimensionalarmor.init;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.dimensionalarmor.item.DimensionalArmorItem;
import com.dimensionalarmor.item.ModArmorMaterial;

public class ModItems {

    public static DimensionalArmorItem DIMENSIONAL_HELMET;
    public static DimensionalArmorItem DIMENSIONAL_CHESTPLATE;
    public static DimensionalArmorItem DIMENSIONAL_LEGGINGS;
    public static DimensionalArmorItem DIMENSIONAL_BOOTS;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        DIMENSIONAL_HELMET = new DimensionalArmorItem(
                ModArmorMaterial.DIMENSIONAL_HELMET, EntityEquipmentSlot.HEAD, "dimensional_helmet");
        DIMENSIONAL_CHESTPLATE = new DimensionalArmorItem(
                ModArmorMaterial.DIMENSIONAL_CHESTPLATE, EntityEquipmentSlot.CHEST, "dimensional_chestplate");
        DIMENSIONAL_LEGGINGS = new DimensionalArmorItem(
                ModArmorMaterial.DIMENSIONAL_LEGGINGS, EntityEquipmentSlot.LEGS, "dimensional_leggings");
        DIMENSIONAL_BOOTS = new DimensionalArmorItem(
                ModArmorMaterial.DIMENSIONAL_BOOTS, EntityEquipmentSlot.FEET, "dimensional_boots");

        event.getRegistry().registerAll(
                DIMENSIONAL_HELMET,
                DIMENSIONAL_CHESTPLATE,
                DIMENSIONAL_LEGGINGS,
                DIMENSIONAL_BOOTS
        );
    }
}
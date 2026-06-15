package com.dimensionalarmor.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmorMaterial {

    public static final ItemArmor.ArmorMaterial DIMENSIONAL_HELMET =
            EnumHelper.addArmorMaterial(
                    "DIMENSIONAL_HELMET",
                    "dimensionalarmor:dimensional",
                    400,
                    new int[]{8, 13, 11, 8},
                    1000,
                    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
                    8.0F
            );

    public static final ItemArmor.ArmorMaterial DIMENSIONAL_CHESTPLATE =
            EnumHelper.addArmorMaterial(
                    "DIMENSIONAL_CHESTPLATE",
                    "dimensionalarmor:dimensional",
                    400,
                    new int[]{8, 13, 11, 8},
                    1000,
                    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
                    10.0F
            );

    public static final ItemArmor.ArmorMaterial DIMENSIONAL_LEGGINGS =
            EnumHelper.addArmorMaterial(
                    "DIMENSIONAL_LEGGINGS",
                    "dimensionalarmor:dimensional",
                    400,
                    new int[]{8, 13, 11, 8},
                    1000,
                    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
                    8.0F
            );

    public static final ItemArmor.ArmorMaterial DIMENSIONAL_BOOTS =
            EnumHelper.addArmorMaterial(
                    "DIMENSIONAL_BOOTS",
                    "dimensionalarmor:dimensional",
                    400,
                    new int[]{8, 13, 11, 8},
                    1000,
                    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
                    4.0F
            );
}
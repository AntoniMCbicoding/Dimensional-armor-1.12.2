package com.dimensionalarmor.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class DimensionalArmorItem extends ItemArmor {

    public DimensionalArmorItem(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName("dimensionalarmor", name);
        setUnlocalizedName(name);
    }
}
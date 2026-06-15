package com.dimensionalarmor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import com.dimensionalarmor.init.ModItems;

public class ArmorEventHandler {

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        EntityPlayer player = event.player;

        if (isWearingFullSet(player)) {
    // Absorción II (2)
    player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 60, 1, true, false));
    
    // Velocidad II (2)
    player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 60, 1, true, false));
    
    // Resistencia I (1)
    player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 60, 0, true, false));
    
    // Fuerza III (3)
    player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 60, 2, true, false));
        }
    }

    private boolean isWearingFullSet(EntityPlayer player) {
        ItemStack helmet = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

        return helmet.getItem() == ModItems.DIMENSIONAL_HELMET &&
               chestplate.getItem() == ModItems.DIMENSIONAL_CHESTPLATE &&
               leggings.getItem() == ModItems.DIMENSIONAL_LEGGINGS &&
               boots.getItem() == ModItems.DIMENSIONAL_BOOTS;
    }
}
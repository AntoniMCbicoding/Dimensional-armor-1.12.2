package com.dimensionalarmor.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
import com.dimensionalarmor.init.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    public void init() {
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        registerItemModel(ModItems.DIMENSIONAL_HELMET, "dimensional_helmet");
        registerItemModel(ModItems.DIMENSIONAL_CHESTPLATE, "dimensional_chestplate");
        registerItemModel(ModItems.DIMENSIONAL_LEGGINGS, "dimensional_leggings");
        registerItemModel(ModItems.DIMENSIONAL_BOOTS, "dimensional_boots");
    }

    private void registerItemModel(Item item, String name) {
        ModelLoader.setCustomModelResourceLocation(
                item, 0,
                new ModelResourceLocation("dimensionalarmor:" + name, "inventory")
        );
    }
}
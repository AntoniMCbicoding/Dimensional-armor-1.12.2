package com.dimensionalarmor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import com.dimensionalarmor.init.ModItems;
import com.dimensionalarmor.proxy.CommonProxy;

@Mod(modid = DimensionalArmor.MODID, name = DimensionalArmor.NAME, version = DimensionalArmor.VERSION,
     dependencies = "required-after:avaritia;required-after:customblight;required-after:ee")
public class DimensionalArmor {

    public static final String MODID = "dimensionalarmor";
    public static final String NAME = "Dimensional Armor";
    public static final String VERSION = "1.8";

    @SidedProxy(
        clientSide = "com.dimensionalarmor.proxy.ClientProxy",
        serverSide = "com.dimensionalarmor.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.Instance
    public static DimensionalArmor instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(ModItems.class);
        MinecraftForge.EVENT_BUS.register(new ArmorEventHandler());
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }
}
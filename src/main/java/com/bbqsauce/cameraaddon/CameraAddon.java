package com.bbqsauce.cameraaddon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("camera_addon")
public class CameraAddon {
    public static final String MOD_ID = "camera_addon";

    public CameraAddon() {
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

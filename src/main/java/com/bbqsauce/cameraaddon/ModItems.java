package com.bbqsauce.cameraaddon;

import java.rmi.registry.Registry;

import com.bbqsauce.cameraaddon.HandheldCameraItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, CameraAddon.MOD_ID);
    
    public static final RegistryObject<Item> HANDHELD_CAMERA =
        ITEMS.register("handheld_camera",
            () -> new HandheldCameraItem(new Item.Properties().stacksTo(1))
        );
}

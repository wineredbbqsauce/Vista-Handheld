package com.bbqsauce.cameraaddon;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod("camera_addon")
public class CameraAddon {
    public static final String MOD_ID = "camera_addon";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> CAMERA_TAB =
        CREATIVE_TABS.register("camera_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.camera_addon"))
            .icon(() -> ModItems.HANDHELD_CAMERA.get().getDefaultInstance())
            .displayItems((params, output) -> {
                output.accept(ModItems.HANDHELD_CAMERA.get());
            })
            .build());

    public CameraAddon() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        CREATIVE_TABS.register(bus);
    }
}
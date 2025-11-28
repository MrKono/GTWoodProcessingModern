package kono.gtwp;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;

import kono.gtwp.api.util.Mods;

@Mod.EventBusSubscriber(modid = Mods.Names.GREGTECH_WOOD_PROCESSING, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GTWPEventHandler {

    public static void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {}

    public static void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {}
}

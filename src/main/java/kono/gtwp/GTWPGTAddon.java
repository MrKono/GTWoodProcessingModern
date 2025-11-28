package kono.gtwp;

import java.util.function.Consumer;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

import kono.gtwp.api.util.Mods;
import kono.gtwp.common.data.GTWPRegistration;

public class GTWPGTAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return GTWPRegistration.REGISTRATE;
    }

    @Override
    public void initializeAddon() {}

    @Override
    public String addonModId() {
        return Mods.Names.GREGTECH_WOOD_PROCESSING;
    }

    @Override
    public void registerTagPrefixes() {}

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {}

    @Override
    public void removeRecipes(Consumer<ResourceLocation> consumer) {}
}

package kono.gtwp;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;

import kono.gtwp.api.util.Mods;
import kono.gtwp.client.ClientProxy;
import kono.gtwp.common.CommonProxy;

@Mod(Mods.Names.GREGTECH_WOOD_PROCESSING)
public class GTWoodProcessing {

    public GTWoodProcessing() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register Machine
        modEventBus.addGenericListener(MachineDefinition.class, GTWPEventHandler::registerMachines);
        // Register RecipeType
        modEventBus.addGenericListener(GTRecipeType.class, GTWPEventHandler::registerRecipeTypes);

        DistExecutor.unsafeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    }
}

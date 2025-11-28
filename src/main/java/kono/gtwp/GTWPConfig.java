package kono.gtwp;

import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.format.ConfigFormats;

import kono.gtwp.api.util.Mods;

@Config(id = Mods.Names.GREGTECH_WOOD_PROCESSING)
public class GTWPConfig {

    public static GTWPConfig INSTANCE;

    public static void init() {
        INSTANCE = Configuration.registerConfig(GTWPConfig.class, ConfigFormats.yaml())
                .getConfigInstance();
    }

    @Configurable
    public static final GregtechOverride GTOverride = new GregtechOverride();
    @Configurable
    public static final Integrations integration = new Integrations();

    public static class GregtechOverride {

        @Configurable
        @Configurable.Comment({ "Making Planks even more difficult.",
                "CEu's hardWoodRecipes & nerfWoodCrafting to true to reflect.", "Default: false" })
        public boolean moreNerfPlankCrafting = false;

        @Configurable
        @Configurable.Comment({ "Making Sticks even more difficult.",
                "CEu's harderRods to true to reflect.", "Default: false" })
        public boolean moreNerfStickCrafting = false;
    }

    public static class Integrations {}
}

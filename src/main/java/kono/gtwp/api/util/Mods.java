package kono.gtwp.api.util;

import java.util.function.Function;

import net.minecraftforge.fml.ModList;

public enum Mods {

    GTCEu(Names.GREGTECH),
    GTWP(Names.GREGTECH_WOOD_PROCESSING);

    public static class Names {

        public static final String GREGTECH = "gtceu";
        public static final String GREGTECH_WOOD_PROCESSING = "gtwp";
    }

    private final String ID;
    private final Function<Mods, Boolean> extraCheck;
    protected Boolean modLoaded;

    Mods(String ID) {
        this.ID = ID;
        this.extraCheck = null;
    }

    /**
     * @param extraCheck A supplier that can be used to test additional factors, such as
     *                   checking if a mod is at a specific version, or a sub-mod is loaded.
     *                   Used in cases like NC vs NCO, where the mod id is the same
     *                   so the version has to be parsed to test which is loaded.
     *                   Another case is checking for specific Forestry modules, checking
     *                   if Forestry is loaded and if a specific module is enabled.
     */
    Mods(String ID, Function<Mods, Boolean> extraCheck) {
        this.ID = ID;
        this.extraCheck = extraCheck;
    }

    public boolean isModLoaded() {
        if (this.modLoaded == null) {
            this.modLoaded = ModList.get().isLoaded(this.ID);
            if (this.modLoaded) {
                if (this.extraCheck != null && !this.extraCheck.apply(this)) {
                    this.modLoaded = false;
                }
            }
        }
        return this.modLoaded;
    }
}

package github.com.quebec;

import net.fabricmc.api.ModInitializer;

public class Quebec implements ModInitializer {
    public static final String MOD_ID = "quebec";

    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}

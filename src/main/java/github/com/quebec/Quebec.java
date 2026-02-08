package github.com.quebec;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quebec implements ModInitializer {
    public static final String MOD_ID = "quebec";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}

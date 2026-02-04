package github.com.quebec;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class ModItems {
    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Settings, GenericItem> itemFactory, Item.Settings settings) {
        // create the identifier
        Identifier id = Identifier.of(Quebec.MOD_ID, name);

        // create item instance
        GenericItem item = itemFactory.apply(settings);

        // register the item
        Registry.register(Registries.ITEM, id, item);


        return item;
    }
    

    public static void initialize() {
    }
}
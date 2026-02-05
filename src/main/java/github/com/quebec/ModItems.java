package github.com.quebec;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class ModItems {

    public static final Item MapleSyrup = registerItem(name = "Maple Syrup", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Quebec.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Quebec.LOGGER.info(" register a mod item" + Quebec.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add((MapleSyrup));
        });
    }

    public static void initialize() {

    }
}
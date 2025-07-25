package net.kosha.uh4.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kosha.uh4.UH4;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EMPTY_CODING_HEART = registerItem("empty_coding_heart", new Item(new Item.Settings()));
    public static final Item STRENGTH_CODING_HEART = registerItem("strength_coding_heart", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(UH4.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UH4.LOGGER.info("Registering Mod Items for" + UH4.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(EMPTY_CODING_HEART);
            fabricItemGroupEntries.add(STRENGTH_CODING_HEART);
        });
    }
}

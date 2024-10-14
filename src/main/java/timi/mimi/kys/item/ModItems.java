package timi.mimi.kys.item;

import timi.mimi.kys.Kys;
// import timi.mimi.kys.item.ModToolMaterials;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item DIRT_COIN = registerItem("dirt_coin", new Item(new Item.Settings()));


    public static final Item DIRT_SWORD = registerItem("dirt_sword",
            new SwordItem(ModToolMaterials.DIRT_TOOL, new Item.Settings()));

    private static Item registerItem(String id, Item item) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(Kys.MOD_ID, id);
        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        // Return the registered item!
        return registeredItem;
    }

    private static void addItemsToFirstItemGroup(FabricItemGroupEntries entries) {
        entries.add(Items.STONE);
    }

    public static void registerModItems() {
        Kys.LOGGER.debug("Registering mod items for " + Kys.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToFirstItemGroup);
    }
}

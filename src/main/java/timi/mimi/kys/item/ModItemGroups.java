package timi.mimi.kys.item;

import timi.mimi.kys.Kys;
import timi.mimi.kys.item.ModItems;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup.DisplayContext;

public class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
        // Create the identifier for the item.
        Identifier.of(Kys.MOD_ID, "mod_item_group"), 
        FabricItemGroup.builder()
            .displayName(Text.translatable("kys.itemgroup"))
            .icon(() -> new ItemStack(Items.APPLE))
            .entries((DisplayContext, entries) -> {
                entries.add(ModItems.DIRT_COIN);
            })
            .build());

    public static void registerItemGroups() {
        Kys.LOGGER.info("Registering Item Groups for " + Kys.MOD_ID);
    }

}

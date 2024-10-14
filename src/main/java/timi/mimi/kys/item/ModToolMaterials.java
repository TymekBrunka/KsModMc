package timi.mimi.kys.item;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum ModToolMaterials implements ToolMaterial {
    DIRT_TOOL(455, 1.9f, 2f, 5, BlockTags.AIR, () -> Ingredient.ofItems(ModItems.DIRT_COIN));

    // private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantibility;
    private final TagKey<Block> inverseTag;
    private final Supplier<Ingredient> repairIngridient;

    ModToolMaterials(/*int miningLevel,*/ int itemDurability, float miningSpeed, float attackDamage, int enchantibility, TagKey<Block> inverseTag, Supplier<Ingredient> repairIngridient) {
        // this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantibility = enchantibility;
        this.inverseTag = inverseTag;
        this.repairIngridient = repairIngridient;
    }

    // @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    // @Override
    public int getDurability() {
        return this.itemDurability;
    }

    // @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    // @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    // public int getMiningLevel() {
    //     return this.miningLevel;
    // }

    // @Override
    public int getEnchantability() {
        return this.enchantibility;
    }

    // @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngridient.get();
    }

}

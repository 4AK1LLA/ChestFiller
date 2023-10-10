package com.rustret.chestfiller.items;

import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;

public class OverworldItems extends ItemManager {
    @Override
    protected void initEntries() {
        entries.add(new RandomEntry(99, Item.AIR, 1));

        entries.add(new RandomEntry(25, Item.BEETROOT_SEEDS, 3));
        entries.add(new RandomEntry(25, Item.MELON_SEEDS, 3));
        entries.add(new RandomEntry(25, Item.PUMPKIN_SEEDS, 3));
        entries.add(new RandomEntry(25, Item.STRING, 3));
        entries.add(new RandomEntry(25, Item.BONE, 3));
        entries.add(new RandomEntry(25, Item.ROTTEN_FLESH, 3));
        entries.add(new RandomEntry(25, Item.GUNPOWDER, 3));
        entries.add(new RandomEntry(25, Item.WHEAT, 3));
        entries.add(new RandomEntry(25, Item.BREAD, 3));
        entries.add(new RandomEntry(25, Item.COAL, 3));
        entries.add(new RandomEntry(25, Item.GOLD_INGOT, 3));
        entries.add(new RandomEntry(25, Item.IRON_INGOT, 3));
        entries.add(new RandomEntry(25, Item.REDSTONE_DUST, 3));

        entries.add(new RandomEntry(20, Item.BUCKET, 1));
        entries.add(new RandomEntry(15, Item.NAME_TAG, 1));

        entries.add(new RandomEntry(20, Item.IRON_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(20, Item.GOLDEN_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(10, Item.DIAMOND_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(20, Item.SADDLE, 1));

        entries.add(new RandomEntry(25, Item.GOLDEN_APPLE, 1));
        entries.add(new RandomEntry(5, Item.ENCHANTED_GOLDEN_APPLE, 1));

        entries.add(new RandomEntry(5, Item.RECORD_13, 1));
        entries.add(new RandomEntry(5, Item.RECORD_CAT, 1));
        entries.add(new RandomEntry(5, Item.RECORD_OTHERSIDE, 1));

        entries.add(new RandomEntry(70, Item.ENCHANT_BOOK, false, Enchantment.ID_MENDING,
                Enchantment.ID_DURABILITY, Enchantment.ID_VANISHING_CURSE, Enchantment.ID_WATER_WORKER,
                Enchantment.ID_PROTECTION_EXPLOSION, Enchantment.ID_WATER_WALKER, Enchantment.ID_PROTECTION_FALL,
                Enchantment.ID_PROTECTION_FIRE, Enchantment.ID_PROTECTION_PROJECTILE, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_WATER_BREATHING, Enchantment.ID_THORNS, Enchantment.ID_DAMAGE_ARTHROPODS,
                Enchantment.ID_EFFICIENCY, Enchantment.ID_FIRE_ASPECT, Enchantment.ID_LOOTING, Enchantment.ID_KNOCKBACK,
                Enchantment.ID_DAMAGE_ALL, Enchantment.ID_DAMAGE_SMITE, Enchantment.ID_BOW_FLAME,
                Enchantment.ID_BOW_INFINITY, Enchantment.ID_BOW_POWER, Enchantment.ID_BOW_KNOCKBACK));
    }
}

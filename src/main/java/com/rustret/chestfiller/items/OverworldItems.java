package com.rustret.chestfiller.items;

import cn.nukkit.inventory.ChestInventory;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OverworldItems implements ItemManager {
    private final List<RandomEntry> entries = new ArrayList<>();
    private final Random random = new Random();

    public OverworldItems() {
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

        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_MENDING));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_DURABILITY));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_WATER_WORKER));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_PROTECTION_EXPLOSION));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_WATER_WALKER));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_PROTECTION_FALL));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_PROTECTION_FIRE));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_PROTECTION_PROJECTILE));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_PROTECTION_ALL));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_WATER_BREATHING));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_THORNS));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_DAMAGE_ARTHROPODS));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_EFFICIENCY));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_FIRE_ASPECT));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_LOOTING));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_KNOCKBACK));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_DAMAGE_ALL));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_DAMAGE_SMITE));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_BOW_FLAME));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_BOW_INFINITY));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_BOW_POWER));
        entries.add(new RandomEntry(5, Item.ENCHANT_BOOK, 1, Enchantment.ID_BOW_KNOCKBACK));
    }

    @Override
    public void fillChest(ChestInventory inventory) {
        int totalChance = entries.stream().mapToInt(RandomEntry::getChance).sum();
        int slots = inventory.getSize();

        for (int i = 0; i < slots; i++) {
            int randomChance = random.nextInt(totalChance) + 1;
            int cumulativeChance = 0;

            for (RandomEntry entry : entries) {
                cumulativeChance += entry.getChance();
                if (randomChance <= cumulativeChance) {
                    inventory.setItem(i, entry.createItem(random));
                    break;
                }
            }
        }
    }
}

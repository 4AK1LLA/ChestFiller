package com.rustret.chestfiller.items;

import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;

import java.util.Random;

public class RandomEntry {
    private final int chance, itemId, maxCount, enchantmentId;

    public RandomEntry(int chance, int itemId, int maxCount) {
        this(chance, itemId, maxCount, -1);
    }

    public RandomEntry(int chance, int itemId, int maxCount, int enchantmentId) {
        this.chance = chance;
        this.itemId = itemId;
        this.maxCount = maxCount;
        this.enchantmentId = enchantmentId;
    }

    public int getChance() {
        return chance;
    }

    public Item createItem(Random random) {
        if (enchantmentId < 0 && maxCount == 1) {
            return new Item(itemId);
        }
        else if (enchantmentId < 0 && maxCount > 1) {
            return new Item(itemId, 0, random.nextInt(maxCount) + 1);
        }
        else {
            Item item = new Item(itemId);
            Enchantment enchantment = Enchantment.getEnchantment(enchantmentId);
            enchantment.setLevel(random.nextInt(enchantment.getMaxLevel()) + 1);
            item.addEnchantment(enchantment);
            return item;
        }
    }
}

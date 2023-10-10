package com.rustret.chestfiller.items;

import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;

import java.util.Random;

public class RandomEntry {
    private final int chance, itemId, maxCount;
    private boolean multiple;
    private int[] enchantmentIds;

    public RandomEntry(int chance, int itemId, int maxCount) {
        this.chance = chance;
        this.itemId = itemId;
        this.maxCount = maxCount;
    }

    public RandomEntry(int chance, int itemId, boolean multiple, int... enchantmentIds) {
        this.chance = chance;
        this.itemId = itemId;
        this.maxCount = 1;
        this.multiple = multiple;
        this.enchantmentIds = enchantmentIds;
    }

    public int getChance() {
        return chance;
    }

    public Item createItem(Random random) {
        if (enchantmentIds == null && maxCount == 1) {
            return new Item(itemId);
        }
        else if (enchantmentIds == null && maxCount > 1) {
            return new Item(itemId, 0, random.nextInt(maxCount) + 1);
        }
        else if (enchantmentIds != null) {
            Item item = new Item(itemId);
            int total = enchantmentIds.length;
            if (!multiple) {
                Enchantment enchantment = Enchantment.getEnchantment(random.nextInt(total) + 1);
                enchantment.setLevel(random.nextInt(enchantment.getMaxLevel()) + 1);
                item.addEnchantment(enchantment);
            }
            else {
                int amount = random.nextInt(total) + 1;
                int i = 0;
                while (i < amount) {
                    int id = enchantmentIds[random.nextInt(total)];
                    if (item.getEnchantment(id) != null) {
                        continue;
                    }
                    Enchantment enchantment = Enchantment.getEnchantment(id);
                    enchantment.setLevel(random.nextInt(enchantment.getMaxLevel()) + 1);
                    item.addEnchantment(enchantment);
                    i++;
                }
            }
            return item;
        }
        throw new UnsupportedOperationException();
    }
}

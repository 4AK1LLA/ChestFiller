package com.rustret.chestfiller.items;

import cn.nukkit.inventory.ChestInventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class ItemManager {
    protected final List<RandomEntry> entries = new ArrayList<>();
    protected final Random random = new Random();

    public ItemManager() {
        initEntries();
    }

    protected abstract void initEntries();

    public final void fillChest(ChestInventory inventory) {
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

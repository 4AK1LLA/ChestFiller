package com.rustret.chestfiller.items;

import cn.nukkit.item.Item;

public class NetherItems extends ItemManager {
    @Override
    protected void initEntries() {
        entries.add(new RandomEntry(99, Item.AIR, 1));
        entries.add(new RandomEntry(49, Item.GOLD_INGOT, 3));
        entries.add(new RandomEntry(25, Item.SADDLE, 1));
        entries.add(new RandomEntry(25, Item.NETHER_WART, 7));
        entries.add(new RandomEntry(19, Item.IRON_INGOT, 5));
        entries.add(new RandomEntry(19, Item.DIAMOND, 3));
        entries.add(new RandomEntry(11, Item.FLINT_AND_STEEL, 1));
        entries.add(new RandomEntry(11, Item.GOLDEN_SWORD, 1));
        entries.add(new RandomEntry(11, Item.GOLDEN_CHESTPLATE, 1));
        entries.add(new RandomEntry(11, Item.GOLDEN_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(11, Item.IRON_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(11, Item.DIAMOND_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(11, Item.OBSIDIAN, 4));
    }
}

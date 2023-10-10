package com.rustret.chestfiller.items;

import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;

public class TheEndItems extends ItemManager {
    @Override
    protected void initEntries() {
        entries.add(new RandomEntry(99, Item.AIR, 1));
        entries.add(new RandomEntry(52, Item.GOLD_INGOT, 7));
        entries.add(new RandomEntry(38, Item.IRON_INGOT, 8));
        entries.add(new RandomEntry(21, Item.BEETROOT_SEEDS, 10));
        entries.add(new RandomEntry(21, Item.DIAMOND, 7));
        entries.add(new RandomEntry(13, Item.SADDLE, 1));
        entries.add(new RandomEntry(9, Item.EMERALD, 6));
        entries.add(new RandomEntry(4, Item.IRON_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(4, Item.GOLDEN_HORSE_ARMOR, 1));
        entries.add(new RandomEntry(4, Item.DIAMOND_HORSE_ARMOR, 1));

        entries.add(new RandomEntry(2, Item.IRON_PICKAXE, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_FORTUNE_DIGGING, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_PICKAXE, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_SILK_TOUCH, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_SHOVEL, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_SILK_TOUCH, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_SHOVEL, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_FORTUNE_DIGGING, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_SWORD, true, Enchantment.ID_DAMAGE_ARTHROPODS,
                Enchantment.ID_FIRE_ASPECT, Enchantment.ID_LOOTING, Enchantment.ID_KNOCKBACK, Enchantment.ID_DURABILITY,
                Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_SWORD, true, Enchantment.ID_DAMAGE_SMITE,
                Enchantment.ID_FIRE_ASPECT, Enchantment.ID_LOOTING, Enchantment.ID_KNOCKBACK, Enchantment.ID_DURABILITY,
                Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_SWORD, true, Enchantment.ID_DAMAGE_ALL,
                Enchantment.ID_FIRE_ASPECT, Enchantment.ID_LOOTING, Enchantment.ID_KNOCKBACK, Enchantment.ID_DURABILITY,
                Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_HELMET, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_WATER_WORKER,
                Enchantment.ID_WATER_BREATHING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_CHESTPLATE, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_CHESTPLATE, true, Enchantment.ID_PROTECTION_FIRE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_CHESTPLATE, true, Enchantment.ID_PROTECTION_EXPLOSION,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_CHESTPLATE, true, Enchantment.ID_PROTECTION_PROJECTILE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_LEGGINGS, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_LEGGINGS, true, Enchantment.ID_PROTECTION_FIRE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_LEGGINGS, true, Enchantment.ID_PROTECTION_EXPLOSION,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_LEGGINGS, true, Enchantment.ID_PROTECTION_PROJECTILE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.IRON_BOOTS, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_THORNS, Enchantment.ID_PROTECTION_FALL, Enchantment.ID_WATER_WALKER,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));

        entries.add(new RandomEntry(2, Item.DIAMOND_PICKAXE, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_FORTUNE_DIGGING, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_PICKAXE, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_SILK_TOUCH, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_SHOVEL, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_SILK_TOUCH, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_SHOVEL, true, Enchantment.ID_EFFICIENCY,
                Enchantment.ID_FORTUNE_DIGGING, Enchantment.ID_DURABILITY, Enchantment.ID_MENDING,
                Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_SWORD, true, Enchantment.ID_DAMAGE_ARTHROPODS,
                Enchantment.ID_FIRE_ASPECT, Enchantment.ID_LOOTING, Enchantment.ID_KNOCKBACK, Enchantment.ID_DURABILITY,
                Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_SWORD, true, Enchantment.ID_DAMAGE_SMITE,
                Enchantment.ID_FIRE_ASPECT, Enchantment.ID_LOOTING, Enchantment.ID_KNOCKBACK, Enchantment.ID_DURABILITY,
                Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_SWORD, true, Enchantment.ID_DAMAGE_ALL,
                Enchantment.ID_FIRE_ASPECT, Enchantment.ID_LOOTING, Enchantment.ID_KNOCKBACK, Enchantment.ID_DURABILITY,
                Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_HELMET, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_WATER_WORKER,
                Enchantment.ID_WATER_BREATHING, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_CHESTPLATE, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_CHESTPLATE, true, Enchantment.ID_PROTECTION_FIRE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_CHESTPLATE, true, Enchantment.ID_PROTECTION_EXPLOSION,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_CHESTPLATE, true, Enchantment.ID_PROTECTION_PROJECTILE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_LEGGINGS, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_LEGGINGS, true, Enchantment.ID_PROTECTION_FIRE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_LEGGINGS, true, Enchantment.ID_PROTECTION_EXPLOSION,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_LEGGINGS, true, Enchantment.ID_PROTECTION_PROJECTILE,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_THORNS, Enchantment.ID_VANISHING_CURSE));
        entries.add(new RandomEntry(2, Item.DIAMOND_BOOTS, true, Enchantment.ID_PROTECTION_ALL,
                Enchantment.ID_THORNS, Enchantment.ID_PROTECTION_FALL, Enchantment.ID_WATER_WALKER,
                Enchantment.ID_DURABILITY, Enchantment.ID_MENDING, Enchantment.ID_VANISHING_CURSE));
    }
}

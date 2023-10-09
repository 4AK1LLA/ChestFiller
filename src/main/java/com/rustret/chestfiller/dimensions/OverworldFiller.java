package com.rustret.chestfiller.dimensions;

import cn.nukkit.block.Block;
import cn.nukkit.blockentity.BlockEntityChest;
import cn.nukkit.inventory.ChestInventory;
import cn.nukkit.level.Level;
import cn.nukkit.math.Vector3;
import com.rustret.chestfiller.items.ItemManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OverworldFiller extends DimensionFiller {
    private final int max = getMax();
    private final int minY = 5;

    public OverworldFiller(Level level, ItemManager itemManager) {
        super(level, itemManager);
    }

    @Override
    public void doFill() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            int found = 0;
            int totalX = max * 2;
            for (int x = -max; x <= max; x++) {
                for (int z = -max; z <= max; z++) {
                    int maxY = level.getHighestBlockAt(x, z);
                    for (int y = minY; y <= maxY; y++) {
                        if (level.getBlock(x, y, z).getId() == Block.CHEST) {
                            found++;
                            chests.add(new Vector3(x, y, z));
                        }
                    }
                }
                double progress = ((double)(x + max) / totalX) * 100.0;
                logger.info(String.format("Searching for chests | Dimension: Overworld | Chests found: %d Done: %.2f%%", found, progress));
            }

            logger.info("Started filling chests...");
            for (Vector3 pos : chests) {
                ChestInventory inventory = ((BlockEntityChest) level.getBlockEntity(pos)).getRealInventory();
                itemManager.fillChest(inventory);
            }
            logger.info("ChestFiller finished successfully");
        });
        executor.shutdown();
    }

    private int getMax() {
        int i;
        for (i = 0; level.getBlock(i, 0, 0).getId() != Block.AIR; i++) { }
        return i;
    }
}

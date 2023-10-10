package com.rustret.chestfiller.dimensions;

import cn.nukkit.block.Block;
import cn.nukkit.blockentity.BlockEntityChest;
import cn.nukkit.blockentity.BlockEntityItemFrame;
import cn.nukkit.inventory.ChestInventory;
import cn.nukkit.item.Item;
import cn.nukkit.level.Level;
import cn.nukkit.math.Vector3;
import com.rustret.chestfiller.items.ItemManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheEndFiller extends DimensionFiller {
    private final List<Vector3> itemFrames = new ArrayList<>();

    public TheEndFiller(Level level, ItemManager itemManager) {
        super(level, itemManager);
    }

    @Override
    public void doFill() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            final int minY = 30;
            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {
                    int maxY = level.getHighestBlockAt(x, z);
                    for (int y = minY; y <= maxY; y++) {
                        int id = level.getBlock(x, y, z).getId();
                        if (id == Block.CHEST) {
                            chests.add(new Vector3(x, y, z));
                        }
                        if (id == Block.ITEM_FRAME_BLOCK) {
                            itemFrames.add(new Vector3(x, y, z));
                        }
                    }
                }
                double progress = ((double)(x + radius) / sideLength) * 100.0;
                logger.info(String.format("Searching for chests and frames | Dimension: The End | Found: %d chests, %d item frames | Done: %.2f%%", chests.size(), itemFrames.size(), progress));
            }

            logger.info("Filling chests...");
            for (Vector3 pos : chests) {
                ChestInventory inventory = ((BlockEntityChest) level.getBlockEntity(pos)).getRealInventory();
                itemManager.fillChest(inventory);
            }
            logger.info("Placing elytras in item frames...");
            for (Vector3 pos : itemFrames) {
                ((BlockEntityItemFrame) level.getBlockEntity(pos)).setItem(new Item(Item.ELYTRA));
            }
            logger.info("ChestFiller finished successfully");
        });
        executor.shutdown();
    }
}

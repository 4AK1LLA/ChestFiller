package com.rustret.chestfiller.dimensions;

import cn.nukkit.Server;
import cn.nukkit.level.Level;
import cn.nukkit.math.Vector3;
import cn.nukkit.utils.MainLogger;
import com.rustret.chestfiller.items.ItemManager;

import java.util.ArrayList;
import java.util.List;

public abstract class DimensionFiller {
    protected final Level level;
    protected final ItemManager itemManager;
    protected final int radius;
    protected final int sideLength;
    protected final List<Vector3> chests = new ArrayList<>();
    protected final MainLogger logger = Server.getInstance().getLogger();
    protected final int CHUNK_BLOCKS = 16;

    public DimensionFiller(Level level, ItemManager itemManager) {
        this.level = level;
        this.itemManager = itemManager;
        this.radius = calculateRadius();
        this.sideLength = radius * 2;
    }

    public abstract void doFill();

    protected final int calculateRadius() {
        int i;
        for (i = 0; level.getChunk(i, 0) != null; i++) { }
        return i * CHUNK_BLOCKS;
    }
}

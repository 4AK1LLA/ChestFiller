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
    protected final List<Vector3> chests = new ArrayList<>();
    protected final MainLogger logger = Server.getInstance().getLogger();

    public DimensionFiller(Level level, ItemManager itemManager) {
        this.level = level;
        this.itemManager = itemManager;
    }

    public abstract void doFill();
}

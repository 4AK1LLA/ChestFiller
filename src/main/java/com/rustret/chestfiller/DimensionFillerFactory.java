package com.rustret.chestfiller;

import cn.nukkit.level.Level;
import com.rustret.chestfiller.dimensions.*;
import com.rustret.chestfiller.items.ItemManager;

public class DimensionFillerFactory {
    public static DimensionFiller createFiller(Level level, ItemManager itemManager) {

        switch (level.getDimension()) {
            case Level.DIMENSION_OVERWORLD:
                return new OverworldFiller(level, itemManager);
            case Level.DIMENSION_NETHER:
                return new NetherFiller(level, itemManager);
            case Level.DIMENSION_THE_END:
                return new TheEndFiller(level, itemManager);
            default:
                throw new IllegalArgumentException("Unsupported dimension: " + level.getDimension());
        }
    }
}

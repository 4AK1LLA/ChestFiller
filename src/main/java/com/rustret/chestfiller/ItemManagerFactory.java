package com.rustret.chestfiller;

import cn.nukkit.level.Level;
import com.rustret.chestfiller.items.*;

public class ItemManagerFactory {
    public static ItemManager createManager(Level level) {

        switch (level.getDimension()) {
            case Level.DIMENSION_OVERWORLD:
                return new OverworldItems();
            default:
                throw new IllegalArgumentException("Unsupported dimension: " + level.getDimension());
        }
    }
}

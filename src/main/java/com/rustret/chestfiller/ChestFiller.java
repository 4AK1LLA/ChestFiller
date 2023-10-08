package com.rustret.chestfiller;

import cn.nukkit.Server;
import cn.nukkit.plugin.PluginBase;

public class ChestFiller extends PluginBase {
    @Override
    public void onEnable() {
        Server.getInstance().getLogger().info("ChestFiller enabled!");
    }
}

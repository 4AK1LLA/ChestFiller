package com.rustret.chestfiller;

import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.level.Level;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import com.rustret.chestfiller.dimensions.DimensionFiller;
import com.rustret.chestfiller.items.ItemManager;

public class ChestFiller extends PluginBase {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isPlayer()) {
            sender.sendMessage(TextFormat.RED + "Command " + command.getName() + " has to be executed in console");
            return false;
        }

        if (args.length != 1) {
            sender.sendMessage(TextFormat.RED + "Wrong syntax for /chestfiller <world name>");
            return false;
        }

        String worldName = args[0];
        Level level = Server.getInstance().getLevelByName(worldName);

        if (level == null) {
            sender.sendMessage(TextFormat.RED + "There is no world with name " + worldName);
            return false;
        }

        ItemManager itemManager = ItemManagerFactory.createManager(level);
        DimensionFiller filler = DimensionFillerFactory.createFiller(level, itemManager);
        filler.doFill();

        return true;
    }
}

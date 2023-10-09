package com.rustret.chestfiller;

import cn.nukkit.Server;
import cn.nukkit.block.Block;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.level.Level;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.MainLogger;
import cn.nukkit.utils.TextFormat;
import com.rustret.chestfiller.dimensions.DimensionFiller;
import com.rustret.chestfiller.dimensions.Nether;
import com.rustret.chestfiller.dimensions.Overworld;
import com.rustret.chestfiller.dimensions.TheEnd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ChestFiller extends PluginBase {
    @Override
    public void onEnable() {
        MainLogger logger = Server.getInstance().getLogger();
        Level world = Server.getInstance().getLevelByName("world");
        logger.info("ChestFiller enabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isPlayer()) {
            sender.sendMessage(TextFormat.RED + "Command " + command.getName() + " has to be executed in console");
            return false;
        }

        DimensionFiller[] fillers = new DimensionFiller[] { new Overworld(), new Nether(), new TheEnd() };
        for (DimensionFiller filler : fillers) {
            filler.doFill();
        }

        Level overworld = Server.getInstance().getLevelByName("world");

        AtomicInteger max = new AtomicInteger();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            int i;
            for (i = 0; overworld.getBlock(i, 0, 0).getId() != Block.AIR; i++) { }
            max.set(i);
        });
        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        executor2.execute(() -> {
            int count = 0;
            int m = max.get();
            for (int x = -m; x <= m; x++) {
                for (int z = -m; z <= m; z++) {
                    int maxY = overworld.getHighestBlockAt(x, z);
                    for (int y = 5; y <= maxY; y++) {
                        Block block = overworld.getBlock(x, y, z);
                        if (block.getId() == Block.CHEST) {
                            count++;
                        }
                    }
                }
                Server.getInstance().getLogger().info(""+x);
            }
            Server.getInstance().getLogger().info(""+count);
        });
        executor2.shutdown();

//        int i;
//        for (i = 0; overworld.getChunk(0, i) != null; i++) { }
//        int maxCoordinate = i - 1;
//
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        executor.execute(() -> {
//            int chests = 0;
//            for (int x = -maxCoordinate; x <= maxCoordinate; x++) {
//                try {
//                    for (int z = -maxCoordinate; z <= maxCoordinate; z++) {
//                        BaseFullChunk chunk = overworld.getChunk(x, z);
////                        for (int id : chunk.getBlockIdArray()) {
////                            if (id == Block.CHEST) {
////                                chests++;
////                            }
////                        }
//                        Server.getInstance().getLogger().info("Processing chunk X : " + chunk.getX() + " Z : " + chunk.getZ());
//                        StringBuilder s = new StringBuilder();
//                        for (byte b : chunk.getBlockIdArray()) {
//                            s.append(String.valueOf(b));
//                        }
//                        Server.getInstance().getLogger().info(s.toString());
//                    }
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            Server.getInstance().getLogger().warning("Chests : " + chests);
//        });
//
//        executor.shutdown();

        return true;
    }
}

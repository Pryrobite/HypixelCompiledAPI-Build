package net.hypixel.api.skyblock.skyblock;

import net.hypixel.api.skyblock.ExampleUtil;

public class GetBingoDataExample {
    public static void main(String[] args) {
        ExampleUtil.API.getSkyblockBingoData(ExampleUtil.HYPIXEL).whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

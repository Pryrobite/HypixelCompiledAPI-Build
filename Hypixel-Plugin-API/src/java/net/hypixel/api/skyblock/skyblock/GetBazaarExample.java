package net.hypixel.api.skyblock.skyblock;

import net.hypixel.api.skyblock.ExampleUtil;

public class GetBazaarExample {
    public static void main(String[] args) {
        ExampleUtil.API.getSkyBlockBazaar().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

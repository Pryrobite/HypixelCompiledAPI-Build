package net.hypixel.api.skyblock.skyblock;

import net.hypixel.api.skyblock.ExampleUtil;

public class GetNewsExample {
    public static void main(String[] args) {
        ExampleUtil.API.getSkyBlockNews().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

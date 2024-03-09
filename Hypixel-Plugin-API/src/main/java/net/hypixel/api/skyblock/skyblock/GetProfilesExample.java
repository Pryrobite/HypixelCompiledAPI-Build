package net.hypixel.api.skyblock.skyblock;

import net.hypixel.api.skyblock.ExampleUtil;

public class GetProfilesExample {
    public static void main(String[] args) {
        ExampleUtil.API.getSkyBlockProfiles(ExampleUtil.HYPIXEL).whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

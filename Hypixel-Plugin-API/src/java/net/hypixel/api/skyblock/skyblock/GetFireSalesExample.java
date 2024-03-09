package net.hypixel.api.skyblock.skyblock;

import net.hypixel.api.skyblock.ExampleUtil;

public class GetFireSalesExample {
    public static void main(String[] args) {
        ExampleUtil.API.getSkyBlockFireSales().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

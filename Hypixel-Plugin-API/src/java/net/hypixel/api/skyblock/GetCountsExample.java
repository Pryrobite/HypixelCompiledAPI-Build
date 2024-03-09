package net.hypixel.api.skyblock;

public class GetCountsExample {
    public static void main(String[] args) {
        ExampleUtil.API.getCounts().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

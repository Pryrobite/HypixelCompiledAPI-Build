package net.hypixel.api.skyblock;

public class GetLeaderboardsExample {
    public static void main(String[] args) {
        ExampleUtil.API.getLeaderboards().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

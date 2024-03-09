package net.hypixel.api.skyblock;

public class GetRecentGamesExample {

    public static void main(String[] args) {
        ExampleUtil.API.getRecentGames(ExampleUtil.HYPIXEL).whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

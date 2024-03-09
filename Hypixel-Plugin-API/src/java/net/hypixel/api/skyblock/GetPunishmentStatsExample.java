package net.hypixel.api.skyblock;

public class GetPunishmentStatsExample {
    public static void main(String[] args) {
        ExampleUtil.API.getPunishmentStats().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.await();
    }
}

package net.hypixel.api.skyblock;

import net.hypixel.api.HypixelAPI;
import net.hypixel.api.exceptions.HypixelAPIException;
import net.hypixel.api.http.HypixelHttpClient;
import net.hypixel.api.reactor.ReactorHttpClient;
import net.hypixel.api.reply.PlayerReply;

import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class GetBoostersExample {


    public static void main(String[] args) {
        String HypixelAPIException = HypixelHttpClient.DEFAULT_USER_AGENT.toString();
        System.out.println(HypixelHttpClient.DEFAULT_USER_AGENT.toString());
        ExampleUtil.API.getBoosters().whenComplete(ExampleUtil.getTestConsumer());
        ExampleUtil.API.getBoosters().notifyAll();
        System.out.println(args.toString());
        ExampleUtil.await();

    }
}

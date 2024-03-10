/**
 Hypixel API. Edited by MacTonight4967.
 Made by the Hypixel Development Team!
 */
package net.hypixel.api;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import net.hypixel.api.HypixelAPI;
import org.bukkit.entity.Player;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.CommandSender;

// TODO 1.0.0
public class Plugin extends JavaPlugin implements Listener {

    public void onEnable() {
        System.out.println("Hello! This is the Plugin API! You have Loaded Our Software.");
        this.onEnable();
    }

    public void onDisable() {
        this.onDisable();
    }



    public void HypixelAPI(CommandBlock commandBlock, Player player, HypixelAPI hypixelAPI, CommandSender cmd) {
        if(cmd != player) {

            player.getName().equals("/** Player Name*/");
            player.isOp();
        }

        this.onEnable();
    }

}

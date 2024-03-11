package net.hypixel.api.data.type;

import net.hypixel.api.data.type.GameType;
import org.bukkit.event.Player;

public class Player extends GameType {
  public Player(Class<T> player, GameType gameType) {
    if(player.isOnline() && gameType == GameType.BEDWARS) {
      player.getAllowedFlight(false);
         player.connection.getConnection();
      /** 
      * @Hypixel {link}
      *
      *  Minecraft.getInstance();
      *  Enable Mixins in Project Module Settings @Hypixel
   */
    }
    super(player);
  }
}



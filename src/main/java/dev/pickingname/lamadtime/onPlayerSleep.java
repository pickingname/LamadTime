package dev.pickingname.lamadtime;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class onPlayerSleep extends JavaPlugin implements Listener {

    // Event handler for PlayerBedEnterEvent
    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        Player username = event.getPlayer();
        String name = username.getName();
        player.sendMessage("§oNo lamad??? "+name+" touched the bed");
    }
}
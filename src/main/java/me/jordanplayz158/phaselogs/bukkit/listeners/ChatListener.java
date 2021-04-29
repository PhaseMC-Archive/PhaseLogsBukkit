package me.jordanplayz158.phaselogs.bukkit.listeners;

import me.jordanplayz158.phaselogs.bukkit.PhaseLogs;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    @EventHandler
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        PhaseLogs.sendMessage(PhaseLogs.getChat().getPlayerPrefix(event.getPlayer()) + " " + event.getPlayer().getName() + ": " + event.getMessage());
    }
}

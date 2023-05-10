package dev.pickingname.lamadtime;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
    
import java.util.Objects;

public final class LamadTime extends JavaPlugin {

    @Override
    public void onEnable() {
        // if prod
        // prod 1 = release
        // prod 0 = beta dev build

        int prod = 1;

        String ver = "1.1_release5_build12_untested";
        String vname = ver + "_DEV";
        String channel = "Dev";
        if (prod == 1) { // is a release
            vname = ver + "_PROD";
            channel = "Release";
        }

        if (prod == 0){ // is a dev build
            Bukkit.getConsoleSender().sendMessage("§c[lamadtime developer is talking to you] This is a dev build which means that there might be some errors!!1!1");
        }
        
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] lamadtime is being enabled");
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] You are currently on: " + channel + " channel!");
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] lamadtime v"+vname);
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] all of the time are static!!! the time will not change cause i am too lazy to get the sun position");
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] color of the lamad text is from google bard again!!!!!!!");
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] contact pickingname for bug reports");
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] pickingname#3117");
        Bukkit.getConsoleSender().sendMessage("§a[lamadtime] The sleep handler is removed btw, if you want that, see older builds that have this feature"); // start the on player sleep handler thing
        // Schedule the task to run every 20 ticks (1 second)
        int taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                long tick = Objects.requireNonNull(Bukkit.getWorld("world")).getTime();
                int totalMinutes = (int) (tick / 20); // Calculate the total number of minutes
                int hours = totalMinutes / 60; // Calculate the number of hours
                int minutes = totalMinutes % 60; // Calculate the remaining minutes
                String timeString = String.format("%02d:%02d", hours, minutes); // Format the time string



                // use this for print Bukkit.getConsoleSender().sendMessage("§ctick: " + tick +"§r");// Get the current world time
                // use this for print too Bukkit.getConsoleSender().sendMessage("§ctimestring: " + timeString +"§r");

                if (Objects.equals(timeString, "19:10")) { // Fajr: 5:00 AM tuned
                    Bukkit.getConsoleSender().sendMessage("§bFirst Lamad of the day (Fajr) tick: " + tick);
                    for (Player p : Bukkit.getOnlinePlayers()) {
                        p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10f, 1.0f);
                        p.sendMessage("§oIt is 5:00 AM, which means..");
                        p.sendMessage("§bAstagfullah habibi it is time for lamad. Take a break and pray to the one and only god allah. Time for First Lamad of the day (Fajr)!!");
                    }
                }

                if (Objects.equals(timeString, "05:00")) { // Dhuhr: 12:00 PM tuned
                    Bukkit.getConsoleSender().sendMessage("§fSecond Lamad of the day (Dhuhr) tick: " + tick);
                    for (Player p : Bukkit.getOnlinePlayers()) {
                        p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10f, 1.0f);
                        p.sendMessage("§oIt is 12:00 PM, which means..");
                        p.sendMessage("§fAstagfullah habibi it is time for lamad. Take a break and pray to the one and only god allah. Time for Second Lamad of the day (Dhuhr)!!");
                    }
                }

                if (Objects.equals(timeString, "08:20")) { // Asr: 4:00 PM tuned
                    Bukkit.getConsoleSender().sendMessage("§eThird Lamad of the day (Asr) tick: " + tick);
                    for (Player p : Bukkit.getOnlinePlayers()) {
                        p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10f, 1.0f);
                        p.sendMessage("§oIt is 4:00 PM, which means..");
                        p.sendMessage("§eAstagfullah habibi it is time for lamad. Take a break and pray to the one and only god allah. Time for Third Lamad of the day (Asr)!!");
                    }
                }

                if (Objects.equals(timeString, "10:50")) { // Maghrib: 7:00 PM tuned
                    Bukkit.getConsoleSender().sendMessage("§6Forth Lamad of the day (Maghrib) tick: " + tick);
                    for (Player p : Bukkit.getOnlinePlayers()) {
                        p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10f, 1.0f);
                        p.sendMessage("§oIt is 7:00 PM, which means..");
                        p.sendMessage("§6Astagfullah habibi it is time for lamad. Take a break and pray to the one and only god allah. Time for Forth Lamad of the day (Maghrib)!!");
                    }
                }

                if (Objects.equals(timeString, "12:30")) { // Isha: 9:00 PM
                    Bukkit.getConsoleSender().sendMessage("§9Last Lamad of the day (Isha) tick: " + tick);
                    for (Player p : Bukkit.getOnlinePlayers()) {
                        p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10f, 1.0f);
                        p.sendMessage("§oIt is 9:00 PM, which means..");
                        p.sendMessage("§9Astagfullah habibi it is time for lamad. Take a break and pray to the one and only god allah. Time for Last Lamad of the day (Isha)!!");
                    }
                }
            }
        }, 0L, 20L);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[lamadtime] lamadtime is being disabled!, thanks for using fr fr§r");
    }
}

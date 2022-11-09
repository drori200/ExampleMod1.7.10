package me.CrowGhost.stafflog;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.*;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.hooks.*;
import net.dv8tion.jda.api.utils.*;
import net.dv8tion.jda.api.utils.cache.*;

public class ExampleBot extends ListenerAdapter {
    public static void Start() {
        JDA jda = JDABuilder.createDefault("MTAzNDkzNDM0MDk5NzYxNTY0Ng.GzUhID.EM_G888eDYf9ZTwvm3Il47-EWJEUwO97qpYSvU").addEventListeners(new ExampleBot())
                // Disable parts of the cache
                .disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE)
                // Enable the bulk delete event
                .setBulkDeleteSplittingEnabled(false)
                // Disable compression (not recommended)
                .setCompression(Compression.NONE)
                // Set activity (like "playing Something")
                .setActivity(Activity.watching("TV")).build();
        jda.upsertCommand("ping", "Calculate the ping of the bot").queue();
        System.out.println("started and online");

    }

    @SubscribeEvent
    public void playerJoin(PlayerEvent.PlayerLoggedInEvent event) {

    }

}

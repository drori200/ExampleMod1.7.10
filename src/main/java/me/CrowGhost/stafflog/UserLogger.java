package me.CrowGhost.stafflog;

import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.*;
import net.dv8tion.jda.api.hooks.*;

import java.util.*;

public class UserLogger extends ListenerAdapter {

    //listen to messages, if a message is sent by a user with a specific role then log it to the console
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        if(!event.getMessage().getContentRaw().startsWith(";;")) return;
        String message = event.getMessage().getContentRaw().replace(";;", "");
        if (Objects.requireNonNull(event.getMember()).getRoles().contains(event.getGuild().getRoleById(""))) {

        }
    }
}

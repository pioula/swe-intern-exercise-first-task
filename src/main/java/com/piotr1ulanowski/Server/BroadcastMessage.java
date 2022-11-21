package com.piotr1ulanowski.Server;

import java.util.HashMap;
import java.util.HashSet;

public class BroadcastMessage {
    private final HashSet<String> userFriends;
    private final String userID;
    private final HashMap<String, String> values;
    private final Integer timestamp;

    @Override
    public String toString() {
        if (userFriends.isEmpty() || values.isEmpty())
            return "";

        StringBuilder s = new StringBuilder();
        s.append("{ \"broadcast\": [ ");
        userFriends.forEach((friend) -> s.append("\"").append(friend).append("\", "));
        s.deleteCharAt(s.length() - 2);
        s.append("], \"user\": \"").append(userID).append("\", \"timestamp\": ").append(timestamp)
                .append(", \"values\": { ");
        values.forEach((name, value) -> s.append("\"").append(name).append("\": \"").append(value)
                .append("\", "));
        s.deleteCharAt(s.length() - 2);
        s.append("}}");
        return s.toString();
    }

    public BroadcastMessage(final HashSet<String> userFriends, final String userID,
                            final HashMap<String, String> values, final Integer timestamp) {
        this.userFriends = userFriends;
        this.userID = userID;
        this.values = values;
        this.timestamp = timestamp;
    }
}

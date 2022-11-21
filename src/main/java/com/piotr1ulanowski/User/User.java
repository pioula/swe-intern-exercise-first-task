package com.piotr1ulanowski.User;

import java.util.HashMap;
import java.util.HashSet;

public class User {
    final private String ID;
    private HashSet<String> friends; // Stores friend IDs
    private HashMap<String, UserProperty> properties;

    public HashMap<String, UserProperty> getProperties() {
        return properties;
    }

    public Boolean addProperty(String name, UserProperty value) {
        if (!properties.containsKey(name) || properties.get(name).getTimestamp() < value.getTimestamp()) {
            properties.put(name, value);
        }

        return false;
    }

    public void addFriend(String friendId) {
        friends.add(friendId);
    }

    public void removeFriend(String friendId) {
        friends.remove(friendId);
    }

    public HashSet<String> getFriends() {
        return friends;
    }

    public String getID() {
        return ID;
    }

    public User(String ID) {
        this.ID = ID;
    }
}

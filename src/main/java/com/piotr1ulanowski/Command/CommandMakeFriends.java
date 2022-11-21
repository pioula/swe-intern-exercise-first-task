package com.piotr1ulanowski.Command;

import com.piotr1ulanowski.User.User;

import java.util.HashMap;
import java.util.Optional;

public class CommandMakeFriends implements CommandI {
    private final String user1;
    private final String user2;
    public CommandMakeFriends(final String user1, final String user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    // Removing users from friend lists of each user.
    @Override
    public Optional<String> execute(HashMap<String, User> users) {
        users.get(user1).addFriend(user2);
        users.get(user2).addFriend(user1);

        return Optional.empty();
    }

    @Override
    public String toString() {
        return "CommandMakeFriends{" +
                "user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                '}';
    }
}

package com.piotr1ulanowski.Command;

import com.piotr1ulanowski.User.User;

import java.util.HashMap;
import java.util.Optional;

public class CommandMakeFriends implements CommandI {
    private String user1;
    private String user2;
    public CommandMakeFriends(String _user1, String _user2) {
        user1 = _user1;
        user2 = _user2;
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

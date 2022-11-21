package com.piotr1ulanowski.Command;

import com.piotr1ulanowski.User.User;

import java.util.HashMap;
import java.util.Optional;

public class CommandDelFriends implements CommandI {
    private String user1;
    private String user2;

    public CommandDelFriends(String _user1, String _user2) {
        user1 = _user1;
        user2 = _user2;
    }

    // Removing users from friend lists of each user.
    @Override
    public Optional<String> execute(HashMap<String, User> users) {
        users.get(user1).removeFriend(user2);
        users.get(user2).removeFriend(user1);

        return Optional.empty();
    }

    @Override
    public String toString() {
        return "CommandDelFriends{" +
                "user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                '}';
    }
}

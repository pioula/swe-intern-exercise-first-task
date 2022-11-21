package com.piotr1ulanowski.Command;

import com.piotr1ulanowski.User.User;

import java.util.HashMap;
import java.util.Optional;

public class CommandDelFriends implements CommandI {
    private String user1;
    private String user2;
    @Override
    Optional<String> execute(HashMap<String, User> users) {

    }

    @Override
    public String toString() {
        return "CommandDelFriends{" +
                "user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                '}';
    }
}

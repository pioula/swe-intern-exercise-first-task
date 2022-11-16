package com.piotr1ulanowski.Command;

public class CommandDelFriends implements CommandI {
    private String user1;
    private String user2;
    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "CommandDelFriends{" +
                "user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                '}';
    }
}

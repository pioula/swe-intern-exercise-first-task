package com.piotr1ulanowski.Command;

public class CommandMakeFriends implements CommandI {
    private String user1;
    private String user2;
    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "CommandMakeFriends{" +
                "user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                '}';
    }
}

package com.piotr1ulanowski.Command;

import java.util.HashMap;

public class CommandUpdate implements CommandI {
    private String user;
    private Integer timestamp;
    private HashMap<String, String> values;
    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "CommandUpdate{" +
                "user='" + user + '\'' +
                ", timestamp=" + timestamp +
                ", values=" + values +
                '}';
    }
}

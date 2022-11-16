package com.piotr1ulanowski;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.piotr1ulanowski.Command.CommandI;
import com.piotr1ulanowski.Command.CommandMakeFriends;

import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String s = "{\"type\":\"make_friends\",\"user1\":\"12-345\",\"user2\":\"67-890\"}";
        JsonReader jsonReader = new JsonReader(new StringReader(s));
        CommandI command = gson.fromJson(s, CommandMakeFriends.class);
        System.out.println(command);
    }
}
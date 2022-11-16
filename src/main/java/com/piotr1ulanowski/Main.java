package com.piotr1ulanowski;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.piotr1ulanowski.Command.CommandDeserializer;
import com.piotr1ulanowski.Command.CommandI;
import com.piotr1ulanowski.Command.CommandMakeFriends;

import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(CommandI.class, new CommandDeserializer());
        Gson gson = gsonBuilder.create();
        String s = "{ \"type\": \"update\", \"user\": \"ab\", \"timestamp\": 99, \"values\": { \"foo\": \"bar\", \"baz\": \"crux\" }}";
        JsonReader jsonReader = new JsonReader(new StringReader(s));
        CommandI command = gson.fromJson(s, CommandI.class);
        System.out.println(command);
    }
}
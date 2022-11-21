package com.piotr1ulanowski;

import com.piotr1ulanowski.Server.Server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server("ex1/input3.txt");
        server.startSimulation();
    }
}
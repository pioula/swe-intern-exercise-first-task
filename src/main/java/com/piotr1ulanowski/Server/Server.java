package com.piotr1ulanowski.Server;

import com.piotr1ulanowski.Command.CommandI;
import com.piotr1ulanowski.Command.CommandJSONParser;
import com.piotr1ulanowski.FIleReader.FileReader;
import com.piotr1ulanowski.User.User;

public class Server {
    private final CommandJSONParser parser = new CommandJSONParser();
    private final FileReader reader;
    private User users;

    public Server(final String path) {
        reader = new FileReader(path);
    }
    // Starts the simulation of receiving the requests.
    public void startSimulation() {
        while (reader.hasLine()) {
            CommandI command = parser.deserialize(reader.readLine());
            var t = command.execute(users);
        }
    }
}

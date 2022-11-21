package com.piotr1ulanowski.Command;

import com.piotr1ulanowski.User.User;
import com.piotr1ulanowski.User.UserProperty;

import java.util.HashMap;
import java.util.Optional;

public class CommandUpdate implements CommandI {
    private final String user;
    private final Integer timestamp;
    private final HashMap<String, String> values;
    public CommandUpdate(final String user, final Integer timestamp,
                         final HashMap<String, String> values) {
        this.user = user;
        this.timestamp = timestamp;
        this.values = values;
    }

    // Removing users from friend lists of each user.
    @Override
    public Optional<String> execute(HashMap<String, User> users) {
        HashMap<String, String> addedValues = new HashMap<>();
        values.forEach((propertyName, value) -> {
            if (users.get(user).addProperty(propertyName, new UserProperty(value, timestamp)))
                addedValues.put(propertyName, value);
        });

        return Optional.ofNullable(addedValues.toString() == null ? addedValues.toString() : "");
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

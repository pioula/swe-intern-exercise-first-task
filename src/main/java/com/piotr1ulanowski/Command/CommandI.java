package com.piotr1ulanowski.Command;

import com.piotr1ulanowski.User.User;

import java.util.Optional;

public interface CommandI {
    Optional<String> execute(User users);
}

package com.piotr1ulanowski.UserTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.piotr1ulanowski.User.User;
import com.piotr1ulanowski.User.UserProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class UserTests {
    @DisplayName("Should add a property with a bigger timestamp.")
    @Test
    void testAddingProperty_WhenBiggerTimestamp_ShouldUpdateTheProperty() {
        final String USER_ID = "test_id";
        final String PROPERTY_NAME = "test_property";
        final UserProperty FIRST_UPDATE = new UserProperty("test", 1);
        final UserProperty SECOND_UPDATE = new UserProperty("test", 2);

        User testUser = new User("test_id");

        testUser.addProperty("test_property", FIRST_UPDATE);
        testUser.addProperty("test_property", SECOND_UPDATE);

        assertTrue(testUser.getProperties().containsKey(PROPERTY_NAME) &&
                Objects.equals(testUser.getProperties().get(PROPERTY_NAME).getTimestamp(),
                        SECOND_UPDATE.getTimestamp()));
    }

}


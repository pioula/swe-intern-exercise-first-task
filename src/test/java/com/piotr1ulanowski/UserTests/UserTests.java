package com.piotr1ulanowski.UserTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.piotr1ulanowski.User.User;
import com.piotr1ulanowski.User.UserProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Properties;

class UserTests {
    @DisplayName("Should add a property with a bigger timestamp.")
    @Test
    void testAddingProperty_WhenBiggerTimestamp_ShouldUpdateTheProperty() {
        final String USER_ID = "test_id";
        final String PROPERTY_NAME = "test_property";
        final UserProperty FIRST_UPDATE = new UserProperty("test1", 1);
        final UserProperty SECOND_UPDATE = new UserProperty("test2", 2);

        User testUser = new User(USER_ID);

        testUser.addProperty("test_property", FIRST_UPDATE);
        testUser.addProperty("test_property", SECOND_UPDATE);

        assertTrue(testUser.getProperties().containsKey(PROPERTY_NAME) &&
                Objects.equals(testUser.getProperties().get(PROPERTY_NAME).getTimestamp(),
                        SECOND_UPDATE.getTimestamp()) &&
                testUser.getProperties().get(PROPERTY_NAME).getName().equals(SECOND_UPDATE.getName()));
    }

    @DisplayName("Should not add a property with a smaller timestamp.")
    @Test
    void testAddingProperty_WhenSmallerTimestamp_ShouldNotUpdateTheProperty() {
        final String USER_ID = "test_id";
        final String PROPERTY_NAME = "test_property";
        final UserProperty FIRST_UPDATE = new UserProperty("test1", 2);
        final UserProperty SECOND_UPDATE = new UserProperty("test2", 1);

        User testUser = new User(USER_ID);

        testUser.addProperty("test_property", FIRST_UPDATE);
        testUser.addProperty("test_property", SECOND_UPDATE);

        assertTrue(testUser.getProperties().containsKey(PROPERTY_NAME) &&
                Objects.equals(testUser.getProperties().get(PROPERTY_NAME).getTimestamp(),
                        FIRST_UPDATE.getTimestamp()) &&
                testUser.getProperties().get(PROPERTY_NAME).getName().equals(FIRST_UPDATE.getName()));
    }

}


package com.smarthome.management;

import com.smarthome.users.User;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that manages the users in the smart home system.
 */
public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getUsername() + " added to the system.");
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("User " + user.getUsername() + " removed from the system.");
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}

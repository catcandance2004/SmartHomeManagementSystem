package com.smarthome.users;

/**
 * A class representing a regular user in the system.
 */
public class RegularUser extends User{
	public RegularUser(String username, String password) {
        super(username, password, "USER");
    }
}

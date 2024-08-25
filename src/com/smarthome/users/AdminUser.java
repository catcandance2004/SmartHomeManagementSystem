package com.smarthome.users;

import com.smarthome.management.UserManager;
import com.smarthome.devices.Device;
import com.smarthome.management.DeviceManager;

/**
 * A class representing an admin user in the system.
 */
public class AdminUser extends User {
	private UserManager userManager;
    private DeviceManager deviceManager;

    public AdminUser(String username, String password) {
        super(username, password, "ADMIN");
        userManager = new UserManager();
        deviceManager = new DeviceManager();
    }

    public void addUser(User user) {
        if (userManager.findUserByUsername(user.getUsername()) == null) {
            userManager.addUser(user);
        } else {
            System.out.println("User " + user.getUsername() + " already exists.");
        }
    }

    public void removeUser(User user) {
        userManager.removeUser(user);
    }

    public void addDevice(Device device) {
        deviceManager.addDevice(device);
    }

    public void removeDevice(Device device) {
        deviceManager.removeDevice(device);
    }

    public void listAllUsers() {
        for (User user : userManager.getAllUsers()) {
            System.out.println("Username: " + user.getUsername() + ", Role: " + user.getRole());
        }
    }

    public void listAllDevices() {
        for (Device device : deviceManager.getAllDevices()) {
            System.out.println("Device Name: " + device.getDeviceName() + ", Status: " + (device.getStatus() ? "ON" : "OFF"));
        }
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public DeviceManager getDeviceManager() {
        return deviceManager;
    }
}

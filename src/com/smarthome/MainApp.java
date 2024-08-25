package com.smarthome;

import com.smarthome.devices.SmartLight;
import com.smarthome.devices.Thermostat;
import com.smarthome.devices.SmartDoorLock;
import com.smarthome.devices.SecurityCamera;
import com.smarthome.management.DeviceManager;
import com.smarthome.management.UserManager;
import com.smarthome.users.AdminUser;
import com.smarthome.users.RegularUser;

public class MainApp {

    public static void main(String[] args) {
        // Initialize user manager and device manager
        UserManager userManager = new UserManager();
        DeviceManager deviceManager = new DeviceManager();

        // Create an admin user
        AdminUser admin = new AdminUser("admin", "admin123");
        userManager.addUser(admin);

        // Create and add devices
        SmartLight light = new SmartLight("Living Room Light");
        Thermostat thermostat = new Thermostat("Main Thermostat", 22);
        SmartDoorLock doorLock = new SmartDoorLock("Front Door Lock");
        SecurityCamera camera = new SecurityCamera("Backyard Camera");

        admin.addDevice(light);
        admin.addDevice(thermostat);
        admin.addDevice(doorLock);
        admin.addDevice(camera);

        // Create a regular user
        RegularUser user = new RegularUser("user1", "password");
        admin.addUser(user);

        // Test operating devices
        light.turnOn();
        light.operate();
        thermostat.setTemperature(24);
        thermostat.turnOn();
        thermostat.operate();
        doorLock.unlock();
        doorLock.turnOn();
        doorLock.operate();
        camera.turnOn();
        camera.startRecording();
        camera.operate();

        // Display all devices and users
        admin.listAllDevices();
        admin.listAllUsers();
    }
}

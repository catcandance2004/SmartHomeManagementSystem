package com.smarthome.analytics;

import com.smarthome.devices.Device;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that logs device usage and provides analytics.
 */
public class DeviceLogger {
    private List<String> logs;

    public DeviceLogger() {
        logs = new ArrayList<>();
    }

    public void logDeviceUsage(Device device, String action) {
        String logEntry = "Device: " + device.getDeviceName() + " | Action: " + action + " | Status: " + (device.getStatus() ? "ON" : "OFF");
        logs.add(logEntry);
        System.out.println("Logged: " + logEntry);
    }

    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }
}

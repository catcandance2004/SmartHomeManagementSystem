package com.smarthome.management;

import com.smarthome.devices.Device;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that manages the devices in the smart home.
 */
public class DeviceManager {
	private List<Device> devices;

    public DeviceManager() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getDeviceName() + " added to the system.");
    }

    public void removeDevice(Device device) {
        devices.remove(device);
        System.out.println(device.getDeviceName() + " removed from the system.");
    }

    public Device getDeviceByName(String name) {
        for (Device device : devices) {
            if (device.getDeviceName().equals(name)) {
                return device;
            }
        }
        return null;
    }

    public List<Device> getAllDevices() {
        return new ArrayList<>(devices);
    }
}

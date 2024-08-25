package com.smarthome.devices;

/**
 * Abstract class representing a generic smart home device.
 * All specific devices (e.g., SmartLight, Thermostat) should extend this class.
 */
public abstract class Device {
    private String deviceName;
    private boolean status;

    /**
     * Constructs a new device with the given name.
     *
     * @param deviceName the name of the device
     */
    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.status = false;
    }

    /**
     * Returns the name of the device.
     *
     * @return the device name
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Returns the current status of the device.
     *
     * @return true if the device is on, false otherwise
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Turns the device on and logs the action.
     */
    public void turnOn() {
        this.status = true;
        System.out.println(deviceName + " is now ON.");
    }

    /**
     * Turns the device off and logs the action.
     */
    public void turnOff() {
        this.status = false;
        System.out.println(deviceName + " is now OFF.");
    }

    /**
     * Abstract method to operate the device. Must be implemented by subclasses.
     */
    public abstract void operate();
}

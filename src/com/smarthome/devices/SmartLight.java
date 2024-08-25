package com.smarthome.devices;

/**
 * A class representing a Smart Light, which extends the generic Device class.
 */
public class SmartLight extends Device {
	public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        if (getStatus()) {
            System.out.println(getDeviceName() + " is lighting up the room.");
        } else {
            System.out.println(getDeviceName() + " is off, cannot operate.");
        }
    }
}

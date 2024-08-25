package com.smarthome.devices;

/**
 * A class representing a Smart Door Lock, which extends the generic Device class.
 */
public class SmartDoorLock extends Device {
	private boolean locked;

    public SmartDoorLock(String deviceName) {
        super(deviceName);
        this.locked = true; // Initially locked
    }

    public void lock() {
        this.locked = true;
        System.out.println(getDeviceName() + " is now locked.");
    }

    public void unlock() {
        this.locked = false;
        System.out.println(getDeviceName() + " is now unlocked.");
    }

    @Override
    public void operate() {
        if (getStatus()) {
            System.out.println(getDeviceName() + " is " + (locked ? "locked" : "unlocked") + ".");
        } else {
            System.out.println(getDeviceName() + " is off, cannot operate.");
        }
    }
}

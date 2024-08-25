package com.smarthome.devices;

/**
 * A class representing a Thermostat, which extends the generic Device class.
 */
public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String deviceName, int initialTemperature) {
        super(deviceName);
        this.temperature = initialTemperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(getDeviceName() + " is set to " + temperature + " degrees.");
    }

    @Override
    public void operate() {
        if (getStatus()) {
            System.out.println(getDeviceName() + " is maintaining the temperature at " + temperature + " degrees.");
        } else {
            System.out.println(getDeviceName() + " is off, cannot operate.");
        }
    }
}

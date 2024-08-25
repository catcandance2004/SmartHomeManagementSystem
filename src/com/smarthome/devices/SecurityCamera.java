package com.smarthome.devices;

/**
 * A class representing a Security Camera, which extends the generic Device class.
 */
public class SecurityCamera extends Device{
	private boolean recording;

    public SecurityCamera(String deviceName) {
        super(deviceName);
        this.recording = false; // Initially not recording
    }

    public void startRecording() {
        if (getStatus()) {
            this.recording = true;
            System.out.println(getDeviceName() + " started recording.");
        } else {
            System.out.println(getDeviceName() + " is off, cannot record.");
        }
    }

    public void stopRecording() {
        this.recording = false;
        System.out.println(getDeviceName() + " stopped recording.");
    }

    @Override
    public void operate() {
        if (getStatus()) {
            System.out.println(getDeviceName() + " is " + (recording ? "recording" : "not recording") + ".");
        } else {
            System.out.println(getDeviceName() + " is off, cannot operate.");
        }
    }
}

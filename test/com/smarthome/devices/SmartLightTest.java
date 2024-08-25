package com.smarthome.devices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmartLightTest {

    @Test
    void testTurnOnAndOperate() {
        SmartLight light = new SmartLight("Test Light");
        light.turnOn();
        assertTrue(light.getStatus());
        light.operate();
    }

    @Test
    void testTurnOffAndOperate() {
        SmartLight light = new SmartLight("Test Light");
        light.turnOff();
        assertFalse(light.getStatus());
        light.operate();
    }
}

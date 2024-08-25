package com.smarthome.devices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    @Test
    void testSetTemperature() {
        Thermostat thermostat = new Thermostat("Test Thermostat", 22);
        thermostat.setTemperature(25);
        assertEquals(25, thermostat.getTemperature());
    }

    @Test
    void testTurnOnAndOperate() {
        Thermostat thermostat = new Thermostat("Test Thermostat", 22);
        thermostat.turnOn();
        assertTrue(thermostat.getStatus());
        thermostat.operate();
    }
}

package org.launchcode.training;

import org.junit.*;
import static org.junit.Assert.*;

public class CarTest {

    // I plan to leave these TODOs in the starter code
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

    private Car car;

    @Before
    public void setup() {
        car = new Car("Toyota", "Prius", 10, 50);
    }


    @Test
    public void constructorSetsGasTankLevel() {
        assertEquals("gas tank level equal to tank size", car.getGasTankSize(), car.getGasTankLevel(), 0.0);
    }

    @Test
    public void driveWithinFuelLimit() {
        car.drive(100);
        assertEquals("400 gallons left", 8, car.getGasTankLevel(), 0.0);
        assertEquals("drove 100 miles", 100, car.getOdometer(), 0.0);
    }

    @Test
    public void drivePastFuelLimit() {
        car.drive(400);
        car.drive(101);
        assertEquals("0.0 gallons left", 0.0, car.getGasTankLevel(), 0.0);
        assertEquals("didn't drive past fuel limit", 500, car.getOdometer(), 0.0);
    }
}

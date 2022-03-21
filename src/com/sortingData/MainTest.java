package com.sortingData;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    // Test Number: 1
    // Objective: Invalid values entered for the Parking garage stay
    // Input(s): stay = 25 hours
    // Expected Output: "Incorrect values entered"

    public void testMain001() {

        String actualCharge;
        Main testObj = new Main();

        try {
            actualCharge = testObj.returnString(25);
            fail("Exception expected");
        } catch (ParkingExceptionHandler e) {
            assertEquals("Incorrect values entered", e.getMessage());
        }
    }
    // Test Number: 2
    // Objective: Invalid double values entered for the Parking garage stay
    // Input(s): stay = -1.5 hours
    // Expected Output: "Incorrect values entered"

    public void testMain002() {

        String actualCharge;
        Main testObj = new Main();

        try {
            actualCharge = testObj.returnString(-1.5);
            fail("Exception expected");
        } catch (ParkingExceptionHandler e) {
            assertEquals("Incorrect values entered", e.getMessage());
        }
    }

    // Test Number: 3
    // Objective: Valid Integer value entered for the Parking Garage
    // Input(s): Stay = 5 hours
    // Expected Output: "13.50 euro"

    public void testMain003() {

        try {
            Main testObj = new Main(); //Create a new instance of Main()
            assertEquals("13.50 euro", testObj.returnString(24));

        } // end try
        catch (ParkingExceptionHandler e) {
            fail("no exception expected");
        }// end catch
    }
    // Test Number: 4
    // Objective: Valid double value entered for the Parking Garage
    // Input(s): Stay = 5.5 hours
    // Expected Output: "4.50 euro"

    public void testMain004() {

        try {
            Main testObj = new Main(); //Create a new instance of Main()
            assertEquals("4.50 euro", testObj.returnString(5.5));

        } // end try
        catch (ParkingExceptionHandler e) {
            fail("no exception expected");
        }// end catch

    }
}

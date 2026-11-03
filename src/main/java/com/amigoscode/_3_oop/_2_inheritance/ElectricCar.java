package com.amigoscode._3_oop._2_inheritance;

/**
 * Exercise: Inheritance - ElectricCar Subclass
 * <p>
 * Create an ElectricCar that extends Vehicle. Practice constructor
 * chaining with super(), overriding methods, and adding behavior
 * unique to electric vehicles.
 * <p>
 * Key concepts:
 * - Extending a parent class and calling super()
 * - Overriding methods to change behavior
 * - Adding subclass-specific fields and methods
 */

//  1 - Make this class extend Vehicle.
public class ElectricCar extends Vehicle {

    //  2 - Add a private field:
    //   - batteryLevel (int) representing percentage from 0 to 100
    private int batteryLevel;

    //  3 - Create a constructor that takes make, model, year, and batteryLevel.
    //   Call super(make, model, year) first, then set the batteryLevel field.
    public ElectricCar(String make, String model, int year, int batteryLevel) {
        super(make, model, year);
        this.batteryLevel = batteryLevel;
    }

    //  4 - Override the start() method to print:
    //   "<make> <model> electric motor starting silently..."
    //   Use the @Override annotation. Access make and model from
    //   the parent class (they are protected).
    @Override
    public void start() {
        System.out.println(make + " " + model + " electric motor starting silently");
    }

    //  5 - Add a charge(int percent) method specific to ElectricCar.
    //   - Add percent to batteryLevel
    //   - Cap batteryLevel at 100 (use Math.min)
    //   - Print: "Charging... Battery now at <batteryLevel>%"
    public void charge(int percent) {
        batteryLevel = Math.min(batteryLevel + percent, 100);
        System.out.println("Charging... Battery now at " + batteryLevel + "%");
    }

    //  6 - Add a getBatteryStatus() method that returns a String:
    //   "Battery: <batteryLevel>%"
    //   Also override toString() to return:
    //   "ElectricCar{make='XXX', model='XXX', year=XXX, batteryLevel=XXX%}"
    public String getBatteryStatus() {
        return "Battery: " + batteryLevel + "%";
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", batteryLevel=" + batteryLevel +
                '}';
    }

    static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2024, 85);
        System.out.println(tesla);
        tesla.start();                      // overridden — silent start
        System.out.println(tesla.getInfo()); // inherited from Vehicle
        System.out.println(tesla.getBatteryStatus());

        tesla.charge(20);
        System.out.println(tesla.getBatteryStatus());

        // Polymorphism: an ElectricCar IS-A Vehicle
        Vehicle vehicle = new ElectricCar("Rivian", "R1T", 2025, 60);
        vehicle.start(); // calls ElectricCar's overridden version
    }
}
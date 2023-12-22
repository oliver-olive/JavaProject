package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.Vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car(123, "off", 0, true, "Petrol");
        v1.ignite();
        v1.changeGear(1);
        v1.changeGear(1);
        v1.changeGear(1);
        v1.changeGear(1);
        v1.changeGear(1);
        v1.changeGear(1);
        v1.changeGear(-1);
        v1.changeGear(-1);
        v1.changeGear(-1);
        v1.changeGear(-1);
        v1.changeGear(-1);
        v1.changeGear(-1);
        v1.stop();
        if (v1 instanceof Car) {
            Car c1 = (Car) v1;
            c1.showCarDetails();
        }
    }
}

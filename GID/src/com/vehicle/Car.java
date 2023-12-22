package com.vehicle;

public class Car extends Vehicle {
    boolean powerStearing;
    String fuelType;

    public Car(int vehicleNo, String engineStatus, int currentGear, Boolean powerStaring, String fuelType) {
        super(vehicleNo, engineStatus, currentGear);
        this.fuelType = fuelType;
        this.powerStearing = powerStaring;
    }

    public void showCarDetails() {
        System.out.println("Car{" +
                "powerStearing=" + powerStearing +
                ", fuelType='" + fuelType + '\'' +
                ", vehicleNo=" + vehicleNo +
                ", engineStatus='" + engineStatus + '\'' +
                ", current=" + currentGear +
                '}');
    }

    @Override
    public void ignite() {
        engineStatus = "on";
        currentGear = 1;
        System.out.println("engineStatus: " + engineStatus + "\n" + "currentGear: " + currentGear);

    }

    @Override
    public int changeGear(int flag) {
        if (flag == 1 && currentGear < 6) {
            currentGear++;
        } else if (flag == -1 && currentGear > 1) {
            currentGear--;
        }
        System.out.println(currentGear);
        return currentGear;
    }

    @Override
    public void stop() {
        engineStatus = "off";
        currentGear = 0;
        System.out.println("engineStatus: " + engineStatus + "\n" + "currentGear: " + currentGear);
    }
}

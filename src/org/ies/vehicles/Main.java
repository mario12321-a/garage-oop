package org.ies.vehicles;

import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.components.VehicleReader;
import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        var vehicleReader = new VehicleReader(scanner);
        var garageReader = new GarageReader(scanner, vehicleReader);

        Garage garage = garageReader.read();

        System.out.println(garage);
    }
}
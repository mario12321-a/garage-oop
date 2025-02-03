package org.ies.vehicles.components;

import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleReader vehicleReader;

    public GarageReader(Scanner scanner, VehicleReader vehicleReader) {
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }

    public Garage read(){
        System.out.println("introduce los datos del garage ");
        System.out.println("nombre: ");
        String name = scanner.nextLine();

        System.out.println("direccion: ");
        String address = scanner.nextLine();

        System.out.println("cuantos vehiculos tiene: ");
        int numVehiculos = scanner.nextInt();
        scanner.nextLine();

        Vehicle[] vehicles = new Vehicle[numVehiculos];
        for(int i=0; i<vehicles.length; i++){
            vehicles[i]=vehicleReader.read();
        }

        return new Garage(name,address,vehicles);
    }
}

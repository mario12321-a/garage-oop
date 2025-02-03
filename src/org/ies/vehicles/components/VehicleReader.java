package org.ies.vehicles.components;
import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;
import java.util.Scanner;

public class VehicleReader {
    private final Scanner scanner;

    public VehicleReader (Scanner scanner){
        this.scanner = scanner;
    }

    public Vehicle read(){
        System.out.println("introduce los datos del vehiculo");
        int option;
        do{
            System.out.println("elige el tipo de vehiculo");
            System.out.println("1. coche");
            System.out.println("2. moto");
            System.out.println("3. camion");

            option = scanner.nextInt();
            scanner.nextLine();
        } while (option!=1 && option!=2 && option!=3);

        VehicleType vehicleType;
         if (option ==1){
             vehicleType = VehicleType.Car;
         } else if (option==2){
             vehicleType = VehicleType.Motorbike;
         } else{
             vehicleType = VehicleType.truck;
         }
        System.out.println("velocidad maxima");
         int maxSpeed = scanner.nextInt();
         scanner.nextLine();

        System.out.println("color");
        String color = scanner.nextLine();

        System.out.println("matricula");
        String plate = scanner.nextLine();

        return new Vehicle(
                vehicleType,
                maxSpeed,
                color,
                plate
        );
    }
}

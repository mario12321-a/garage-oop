package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String address;
    private Vehicle [] vehicles;

    public Garage(String name, String address, Vehicle[] vehicles) {
        this.name = name;
        this.address = address;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(address, garage.address) && Objects.deepEquals(vehicles, garage.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, Arrays.hashCode(vehicles));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }

}
package airport.logic;

import airport.entity.Plane;
import airport.exceptions.EmptyAirportException;
import airport.exceptions.InvalidCapacityException;
import airport.exceptions.InvalidTonnageException;
import airport.utility.RangeComparator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Controller {

    public int calcTotalCapacity(List<Plane> airport) {

        int totalCapacity = 0;

        for (Plane plane : airport
        ) {
            totalCapacity += plane.getCapacity();
        }

        return totalCapacity;
    }

    public int calcTotalTonnage(List<Plane> airport) {

        int totalTonnage = 0;

        for (Plane plane : airport
        ) {
            totalTonnage += plane.getTonnage();
        }

        return totalTonnage;
    }


    public List<Plane> sortPlanesByRange(List<Plane> airport) {

        RangeComparator comparator = new RangeComparator();

        Collections.sort(airport, comparator);

        return airport;

    }


    public List<Plane> getPlaneByCriteria(List<Plane> airport)throws InvalidCapacityException, InvalidTonnageException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter plane brand: ");
        String brand = sc.nextLine();

        System.out.println("Enter plane capacity: ");
        int capacity = sc.nextInt();
        if (capacity<1) throw new InvalidCapacityException("Capacity can't be less than 1");

        System.out.println("Enter plane tonnage: ");
        int tonnage = sc.nextInt();
        if (tonnage<100) throw new InvalidTonnageException("Tonnage can't be less than 100");

        return airport.stream()
                .filter(plane -> plane.getBrand().contains(brand) || plane.getCapacity() == capacity || plane.getTonnage() == tonnage)
                .collect(Collectors.toList());
    }

    public void printPlaneToConsole(List<Plane> airport) throws EmptyAirportException {

        if (airport.size() == 0) throw new EmptyAirportException("There are no planes in the list!");

        for (Plane plane : airport
        ) {
            System.out.println(plane);
        }

    }

    public void writePlaneToFile(List<Plane> airport, String path) throws EmptyAirportException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            if (airport.size() == 0) throw new EmptyAirportException("There are no planes in the list!");

            for (Plane plane : airport
            ) {
                writer.write(plane.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

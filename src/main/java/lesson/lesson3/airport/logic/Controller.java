package lesson.lesson3.airport.logic;

import lesson.lesson3.airport.entity.Plane;
import lesson.lesson3.airport.utility.RangeComparator;

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


    public List<Plane> getPlaneByCriteria(List<Plane> airport) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter plane brand: ");
        String brand = sc.nextLine();

        System.out.println("Enter plane capacity: ");
        int capacity = sc.nextInt();

        System.out.println("Enter plane tonnage: ");
        int tonnage = sc.nextInt();

        return airport.stream()
                .filter(plane -> plane.getBrand().contains(brand) || plane.getCapacity() == capacity || plane.getTonnage() == tonnage)
                .collect(Collectors.toList());
    }

    public void printPlaneToConsole(List<Plane> airport) {

        if (airport.size() == 0) System.out.println("No planes to print");

        for (Plane plane : airport
        ) {
            System.out.println(plane);
        }

    }

    public void writePlaneToFile(List<Plane> airport, String path) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            if (airport.size() == 0) writer.write("There are no planes");

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

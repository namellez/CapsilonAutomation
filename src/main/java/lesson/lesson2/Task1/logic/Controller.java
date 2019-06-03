package lesson.lesson2.Task1.logic;

import lesson.lesson2.Task1.entity.Plane;
import lesson.lesson2.Task1.utility.RangeComparator;

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

    public void printPlane(List<Plane> airport) {

        if (airport.size() == 0) System.out.println("No planes to print");

        for (Plane plane : airport
        ) {
            System.out.println(plane);
        }

    }


}

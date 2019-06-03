package lesson.lesson2.Task1.logic;

import lesson.lesson2.Task1.entity.HeavyPlane;
import lesson.lesson2.Task1.entity.Plane;
import lesson.lesson2.Task1.entity.PrivatePlane;
import lesson.lesson2.Task1.entity.RegionalPlane;
import lesson.lesson2.Task1.utility.PlaneType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportFactory {

    public List<Plane> getAirportFromFile(String path) {

        File file = new File(path);
        List<Plane> airport = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().split(",");

                String type = array[0];
                String brand = array[1];
                int capacity = Integer.valueOf(array[2].trim());
                int tonnage = Integer.parseInt(array[3].trim());
                int range = Integer.parseInt(array[4].trim());

                PlaneType pt = PlaneType.valueOf(type.toUpperCase());

                switch (pt) {
                    case HEAVY_PLANE:
                        airport.add(new HeavyPlane(brand, capacity, tonnage, range));

                    case REGIONAL_PLANE:
                        airport.add(new RegionalPlane(brand, capacity, tonnage, range));

                    case PRIVATE_PLANE:
                        airport.add(new PrivatePlane(brand, capacity, tonnage, range));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return airport;
    }


}


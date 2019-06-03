package lesson.lesson2.Task1.Logic;

import lesson.lesson2.Task1.Entity.HeavyPlane;
import lesson.lesson2.Task1.Entity.Plane;
import lesson.lesson2.Task1.Entity.PrivatePlane;
import lesson.lesson2.Task1.Entity.RegionalPlane;
import lesson.lesson2.Task1.Utility.PlaneType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlaneFactory {

    public Plane getPlaneFromFile(String path) {

        File file = new File(path);

        try {
            Scanner sc = new Scanner(file);

            String[] array = sc.nextLine().split(",");

            String type = array[0];
            String brand = array[1];
            int capacity = Integer.valueOf(array[2].trim());
            int tonnage = Integer.parseInt(array[3].trim());
            int range = Integer.parseInt(array[4].trim());

            PlaneType pt = PlaneType.valueOf(type.toUpperCase());

            switch (pt) {
                case HEAVY_PLANE:
                    return new HeavyPlane(brand, capacity, tonnage, range);

                case REGIONAL_PLANE:
                    return new RegionalPlane(brand, capacity, tonnage, range);

                case PRIVATE_PLANE:
                    return new PrivatePlane(brand, capacity, tonnage, range);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}

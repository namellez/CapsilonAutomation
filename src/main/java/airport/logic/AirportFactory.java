package airport.logic;

import airport.entity.HeavyPlane;
import airport.entity.Plane;
import airport.entity.PrivatePlane;
import airport.entity.RegionalPlane;
import airport.utility.PlaneType;

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

                String line = sc.nextLine();

                if (line.matches("(Private|Heavy|Regional)_Plane,\\s[\\w-]+,\\s\\d+,\\s\\d+,\\s\\d+")) {

                    String[] array = line.split(",");

                    String type = array[0];
                    String brand = array[1];
                    int capacity = Integer.valueOf(array[2].trim());
                    int tonnage = Integer.parseInt(array[3].trim());
                    int range = Integer.parseInt(array[4].trim());

                    PlaneType pt = PlaneType.valueOf(type.toUpperCase());

                    switch (pt) {
                        case HEAVY_PLANE:
                            airport.add(new HeavyPlane(brand, capacity, tonnage, range));
                            break;

                        case REGIONAL_PLANE:
                            airport.add(new RegionalPlane(brand, capacity, tonnage, range));
                            break;

                        case PRIVATE_PLANE:
                            airport.add(new PrivatePlane(brand, capacity, tonnage, range));
                            break;
                    }
                }
            }

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return airport;
    }


}


package lesson.lesson2.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Plane> airport = new ArrayList<Plane>();

        airport.add(new HeavyPlane("T-500", 1150, 1000, 1000));
        airport.add(new HeavyPlane("T-600", 1255, 1200, 1100));
        airport.add(new RegionalPlane("Boeing-737", 725, 500, 2000));
        airport.add(new RegionalPlane("Boeing-939", 500, 400, 3000));
        airport.add(new PrivatePlane("Concord", 350, 50, 800));
        airport.add(new PrivatePlane("Jetline", 200, 50, 1200));


        Controller controller = new Controller();

        controller.printPlane(controller.sortPlanesByRange(airport));

        controller.printPlane(controller.getPlaneByCriteria(airport));

        System.out.println(controller.calcTotalTonnage(airport));

    }
}

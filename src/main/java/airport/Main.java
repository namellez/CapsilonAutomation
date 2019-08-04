package airport;

import airport.entity.Plane;
import airport.logic.AirportFactory;
import airport.logic.Controller;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String input = "src/main/resources/PlaneData.txt";
        String output = "src/main/resources/Output.txt";


        List<Plane> airport;

        AirportFactory af = new AirportFactory();

        airport = af.getAirportFromFile(input);

        Controller c = new Controller();

        //c.writePlaneToFile(airport, output);


        //comments:

//        Task 1: added exceptions to classes AirportFactory, PlaneFactory, Controller
//         - user exceptions: EmptyAirportException, invalidCapacityException, InvalidTonnageException
//         - system exceptions: FileNotFoundException, IOException
//
//        Task 2: added reading/writing to file using scanner (AirportFactory, PlaneFactory, Controller classes)
//        Task 3: added regexp for reading date from file (AirportFactory class)
//        Task 4: added factory classes (AirportFactory, PlaneFactory)


    }
}

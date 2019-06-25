package lesson.lesson3.airport;

import lesson.lesson3.airport.entity.Plane;
import lesson.lesson3.airport.logic.AirportFactory;
import lesson.lesson3.airport.logic.Controller;
import lesson.lesson3.airport.logic.PlaneFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String input = "src/main/resources/PlaneData.txt";
        String output = "src/main/resources/Output.txt";


        List<Plane> airport = new ArrayList<>();

        AirportFactory af = new AirportFactory();

        airport = af.getAirportFromFile(input);

        Controller c = new Controller();

        c.writePlaneToFile(airport, output);


    }
}


//added writePlaneToFile method to controller + output.txt
//factory is already present
//added regexp filter to airport factory
//fixed switch loop in factory (added break)
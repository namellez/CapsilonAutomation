package lesson.lesson2.Task1;

import lesson.lesson2.Task1.Entity.Plane;
import lesson.lesson2.Task1.Logic.PlaneFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String path = "C:\\Users\\Stepan\\IdeaProjects\\CapsilonAutomation\\src\\main\\java\\lesson\\lesson2\\Task1\\PlanesData.txt";

        List<Plane> airport = new ArrayList<Plane>();

        PlaneFactory pf = new PlaneFactory();

        pf.getPlaneFromFile(path).fly();

    }
}

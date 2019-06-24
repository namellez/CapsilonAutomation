package lesson.lesson2.Task1;

import lesson.lesson2.Task1.entity.Plane;
import lesson.lesson2.Task1.logic.PlaneFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String path = "src/main/resources/PlaneData.txt";

        List<Plane> airport = new ArrayList<>();

        PlaneFactory pf = new PlaneFactory();

        pf.getPlaneFromFile(path).fly();

    }
}

package lesson.lesson1.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        List<Runner> runners = new ArrayList<Runner>();

        for (int i = 0; i <names.length ; i++) {
            runners.add(new Runner(names[i],times[i]));
        }

        Collections.sort(runners, new SortByTime());

        printRunners(runners);

        getRunnerByPlace(runners,1);

    }

    public static void getRunnerByPlace(List<Runner> runners, int place) {      //allows to get a runner and time by inputting his/her place

        System.out.println(runners.get(place-1));
        System.out.println();
    }

    public static void printRunners(List<Runner> runners) {             //prints all runners

        for (Runner runner: runners
        ) {
            System.out.println(runner);
        }
    }

}


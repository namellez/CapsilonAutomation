package lesson.lesson1.Task4;
import java.util.Comparator;

public class Runner {

    private String name;
    private int time;

    public Runner(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String toString() {
        return this.name + ": " + this.time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}

class SortByTime implements Comparator<Runner> {
    public int compare(Runner a, Runner b) {
        return a.getTime() - b.getTime();
    }
}


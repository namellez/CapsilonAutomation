package lesson.lesson2.Task1;

import java.util.Comparator;

public class RangeComparator implements Comparator<Plane> {

    @Override
    public int compare(Plane plane1, Plane plane2) {
        return (plane1.getRange() - plane2.getRange());
    }
}

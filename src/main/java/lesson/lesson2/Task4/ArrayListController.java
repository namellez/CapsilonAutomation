package lesson.lesson2.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ArrayListController {


    List<Integer> createArrayList() {

        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(new Random().nextInt(101));
        }

        return arrayList;
    }

    long calcAddingElementsToArrayList(List<Integer> arrayList) {

        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(new Random().nextInt(101));
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000;
    }

    long calcRemovingElementsFromArrayList(List<Integer> arrayList) {

        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1 - i);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000;
    }

    long calcSearchingElementsInArrayList(List<Integer> arrayList, Integer searchRequest) {

        long startTime = System.nanoTime();

        int count = 0;
        int i = 0;

        while (count < 1000) {
            if (arrayList.get(i).equals(searchRequest)) {
                count++;
            }
            i++;
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000;

    }
}

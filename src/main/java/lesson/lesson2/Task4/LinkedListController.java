package lesson.lesson2.Task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class LinkedListController {


    List<Integer> createLinkedList() {

        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(new Random().nextInt(101));
        }

        return linkedList;
    }

    long calcAddingElementsToLinkedList(List<Integer> linkedList) {

        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(new Random().nextInt(101));
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000;

    }

    long calcRemovingElementsFromLinkedList(List<Integer> linkedList) {

        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() -1 - i);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000;
    }


    long calcSearchingElementsInLinkedList(List<Integer> linkedList, Integer searchRequest) {

        long startTime = System.nanoTime();

        int count = 0;
        int i = 0;

        while (count < 1000) {
            if (linkedList.get(i).equals(searchRequest)) {
                count++;
            }
            i++;
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000;
    }


}

package lesson.lesson2.Task4;

public class Main {

    public static void main(String[] args) {


        ArrayListController arrayListController = new ArrayListController();
        LinkedListController linkedListController = new LinkedListController();


        long addingInArrayList = arrayListController.calcAddingElementsToArrayList(arrayListController.createArrayList());

        long addingInLinkedList = linkedListController.calcAddingElementsToLinkedList(linkedListController.createLinkedList());

        long removingFromArrayList = arrayListController.calcRemovingElementsFromArrayList(arrayListController.createArrayList());

        long removingFromLinkedList = linkedListController.calcRemovingElementsFromLinkedList(linkedListController.createLinkedList());

        long searchingInArrayList = arrayListController.calcSearchingElementsInArrayList(arrayListController.createArrayList(), 12);

        long searchingInLinkedList = linkedListController.calcSearchingElementsInLinkedList(linkedListController.createLinkedList(), 12);


        System.out.println("Adding elements to lists:");
        System.out.println("ArrayList: " + addingInArrayList + " µs " + "||" + " LinkedList: " + addingInLinkedList + " µs");

        System.out.println("==============");

        System.out.println("Removing elements from lists:");
        System.out.println("ArrayList: " + removingFromArrayList + " µs " + "||" + " LinkedList: " + removingFromLinkedList + " µs");

        System.out.println("==============");

        System.out.println("Searching elements in lists:");
        System.out.println("ArrayList: " + searchingInArrayList + " µs " + "||" + " LinkedList: " + searchingInLinkedList + " µs");

    }


}

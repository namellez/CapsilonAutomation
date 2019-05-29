package lesson.lesson2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Sergey", 21, "st01"));
        studentsList.add(new Student("Sasha", 18, "st02"));
        studentsList.add(new Student("Andrey", 16, "st03"));
        studentsList.add(new Student("Ivan", 15, "st04"));
        studentsList.add(new Student("Anton", 22, "st05"));
        studentsList.add(new Student("Sergey", 14, "st06"));
        studentsList.add(new Student("Dima", 16, "st07"));
        studentsList.add(new Student("Oleg", 19, "st08"));
        studentsList.add(new Student("Stas", 20, "st09"));
        studentsList.add(new Student("Roman", 21, "st10"));

        Controller controller = new Controller();

        controller.printList(controller.getStudentsByFirstLetters(studentsList));

        controller.printList(controller.sortStudentsByAge(studentsList));

        controller.printMap(controller.getStudentsFromMapById(controller.convertListIntoMap(studentsList)));

    }
}

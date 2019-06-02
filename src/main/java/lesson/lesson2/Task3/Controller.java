package lesson.lesson2.Task3;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;

class Controller {

    List<Student> sortStudentsByAge(List<Student> studentsList) {
        return studentsList.stream()
                .sorted(new StudentComparator())
                .collect(Collectors.toList());
    }

    List<Student> getStudentsByFirstLetters(List<Student> studentsList) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first letters of the name: ");
        String request = sc.nextLine();

        return studentsList.stream()
                .filter(student -> student.getName().toLowerCase().startsWith(request))
                .collect(Collectors.toList());
    }

    double getAverageAge(List<Student> studentsList) {

        return studentsList.stream().collect(averagingDouble(Student::getAge));
    }

    Map<String, String> convertListIntoMap(List<Student> studentsList) {

        return studentsList.stream().collect(Collectors.toMap(Student::getId, Student::getName));
    }

    Map<String, String> getStudentsFromMapById(Map<String, String> studentMap) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input student's id (full or part): ");
        String request = sc.nextLine();

        return studentMap.entrySet().stream()
                .filter(x -> x.getKey().toLowerCase().contains(request.toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    void printList(List<Student> studentsList) {

        if (studentsList.size() == 0) {
            System.out.println("There are no students to print");
        }

        studentsList.stream().
                forEach(System.out::println);
    }


    void printMap(Map<String, String> studentsMap) {

        if (studentsMap.size() == 0) {
            System.out.println("There are no students to print");
        }

        studentsMap.entrySet().stream()
                .forEach(System.out::println);

    }


}

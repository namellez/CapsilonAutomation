package lesson.lesson2.Task2;

import java.util.*;
import java.util.stream.Collectors;

class Controller {

    List<Student> sortStudentsByAge(List<Student> studentsList) {
        Collections.sort(studentsList);
        return studentsList;
    }

    List<Student> getStudentsByFirstLetters(List<Student> studentsList) {

        List<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first letters of the name: ");
        String request = sc.nextLine();

        for (Student student : studentsList
        ) {
            if (student.getName().toLowerCase().startsWith(request.toLowerCase()))
                students.add(student);
        }

        return students;
    }

    double getAverageAge(List<Student> studentsList) {

        double totalAge = 0;

        for (Student st : studentsList
        ) {
            totalAge += st.getAge();
        }

        return totalAge / studentsList.size();
    }

    Map convertListIntoMap(List<Student> studentsList) {

        Map<String, String> studentMap = new TreeMap<String, String>();
        for (Student st : studentsList
        ) {
            studentMap.put(st.getId(), st.getName());
        }

        return studentMap;
    }

    Map<String, String> getStudentsFromMapById(Map<String, String> studentMap) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input student's id (full or part): ");
        String request = sc.nextLine();

        return studentMap.entrySet().stream()
                .filter(x -> x.getKey().toLowerCase().contains(request.toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    void printList (List<Student> studentsList){

        if (studentsList.size() == 0){
            System.out.println("There are no students to print");
        }

        for (Student student: studentsList
             ) {
            System.out.println(student);
        }
    }


    void printMap (Map<String, String> studentsMap){

        if (studentsMap.size() == 0){
            System.out.println("There are no students to print");
        }

        studentsMap.entrySet().stream()
                .forEach(System.out::println);
    }
}

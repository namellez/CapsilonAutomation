package lesson.lesson2.Task3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return (firstStudent.getAge() - secondStudent.getAge());
    }
}

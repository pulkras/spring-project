package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Mikhail Malygin", 3, 7.5);
        Student student2 = new Student("Sasha Ivanov", 2, 2.3);
        Student student3 = new Student("Anna Kolesnikova", 4, 5.8);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("start working method getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}

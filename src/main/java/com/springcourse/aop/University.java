package com.springcourse.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Ivan", 4, 4.5);
        Student student2 = new Student("Petr", 3, 3.5);
        Student student3 = new Student("Nikolay", 5, 4.7);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {

        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }

}

package com.springcourse.hibernate_many_to_one_uni;

import com.springcourse.hibernate_many_to_one_uni.entity.Department;
import com.springcourse.hibernate_many_to_one_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

/*
            Department department = new Department("HR", 100, 150);
            Employee employee = new Employee("Kolya", "Turutin", 150);
            Employee employee1 = new Employee("Vasya", "Tregulov", 100);

            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee1);

            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");
*/

/*
            session.beginTransaction();

            Department department = session.get(Department.class, 4);

            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");
*/

/*
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 21);

            System.out.println(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
*/


/*
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 19);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
*/

            session.beginTransaction();

            Department department = session.get(Department.class, 4);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");


        }

    }
}

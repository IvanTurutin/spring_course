package com.springcourse.hibernate_many_to_one_bi;

import com.springcourse.hibernate_many_to_one_bi.entity.Department;
import com.springcourse.hibernate_many_to_one_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

/*
            Department department = new Department("IT", 150, 250);
            Employee employee = new Employee("Ivan", "Turutin", 150);
            Employee employee1 = new Employee("Zaur", "Tregulov", 250);
            Employee employee2 = new Employee("Anaton", "Sidorov", 200);

            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");
*/

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 5);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Load employees");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees");
            System.out.println(department.getEmps());

            System.out.println("Done!");

/*
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 18);

            Department department = employee.getDepartment();

            System.out.println(department);

            session.getTransaction().commit();
            System.out.println("Done!");
*/


/*
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 20);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
*/

        }

    }
}

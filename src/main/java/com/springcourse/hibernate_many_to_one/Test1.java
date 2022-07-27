package com.springcourse.hibernate_many_to_one;

import com.springcourse.hibernate_many_to_one.entity.Department;
import com.springcourse.hibernate_many_to_one.entity.Employee;
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
            Department department = new Department("IT", 150, 250);
            Employee employee = new Employee("Ivan", "Turutin", 150);
            Employee employee1 = new Employee("Zaur", "Tregulov", 250);

            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee1);

            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");
*/

/*
            session.beginTransaction();

            Department department = session.get(Department.class, 1);

            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");
*/

/*
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 18);

            Department department = employee.getDepartment();

            System.out.println(department);

            session.getTransaction().commit();
            System.out.println("Done!");
*/


            session.beginTransaction();

            Employee employee = session.get(Employee.class, 20);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

        }

    }
}

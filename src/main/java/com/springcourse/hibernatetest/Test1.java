package com.springcourse.hibernatetest;

import com.springcourse.hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Ivan", "Turutin",
                    "DPHC", 160);
            Employee employee1 = new Employee("Ivan1", "Turutin",
                    "DPHC", 160);
            session.beginTransaction();
            session.save(employee1);
            session.getTransaction().commit();
        }

    }
}

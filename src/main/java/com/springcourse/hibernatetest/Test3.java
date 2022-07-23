package com.springcourse.hibernatetest;

import com.springcourse.hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

/*
            List<Employee> emps = session.createQuery("from Employee")
                    .getResultList();
*/
            List<Employee> emps = session.createQuery("from Employee "
                    + "where name = 'Ivan1' and salary > 160").getResultList();
            for (Employee employee : emps) {
                System.out.println(employee);
            }
            session.getTransaction().commit();

        }

    }
}

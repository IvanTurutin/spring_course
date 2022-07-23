package com.springcourse.hibernatetest;

import com.springcourse.hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

/*            Employee employee = session.get(Employee.class, 1);
            employee.setSalary(333);*/

/*
            List<Employee> employees = session.createQuery("from Employee "
                    + "where name = 'Ivan1'").getResultList();
            for (Employee employee : employees) {
                employee.setSalary(employee.getSalary() + 50);
            }
*/
            session.createQuery("update Employee set salary = 270 where " +
                    "name = 'Ivan1'").executeUpdate();

            session.getTransaction().commit();

        }

    }
}

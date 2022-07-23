package com.springcourse.hibernatetest;

import com.springcourse.hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

/*
            session.createQuery("delete Employee where name = 'Elena'")
                    .executeUpdate();
*/

/*
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
*/

            session.createQuery("delete Employee where id = 2")
                    .executeUpdate();

            session.getTransaction().commit();

        }

    }
}

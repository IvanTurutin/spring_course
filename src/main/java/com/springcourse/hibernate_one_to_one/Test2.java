package com.springcourse.hibernate_one_to_one;

import com.springcourse.hibernate_one_to_one.entity.Detail;
import com.springcourse.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

/*
            Employee employee = new Employee("Misha", "Korovin",
                    "123", 200);

            Detail detail = new Detail("SPb", "753456",
                    "mih@gmail.com");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);

            session.beginTransaction();

            session.save(detail);

            session.getTransaction().commit();
*/


/*
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 11);
            Employee emp = detail.getEmployee();
            System.out.println(detail);
            System.out.println(emp);

            session.getTransaction().commit();
*/


            session.beginTransaction();

            session.delete(session.get(Detail.class, 10));

            session.getTransaction().commit();

        }

    }
}

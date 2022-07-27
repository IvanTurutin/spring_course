package com.springcourse.hibernate_one_to_one;

import com.springcourse.hibernate_one_to_one.entity.Detail;
import com.springcourse.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
/*
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Turutin",
                    "DPHC", 160);

            Detail detail = new Detail("SPb", "456123789",
                    "ivan@gmail.com");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
*/

/*
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Kolya", "Vasin",
                    "ew", 153);

            Detail detail = new Detail("SPb", "951753",
                    "oleg@gmail.com");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
*/

/*            session.beginTransaction();

            Employee emp = session.get(Employee.class, 20);
            Detail detail = emp.getEmpDetail();

            session.getTransaction().commit();
            System.out.println(emp);
            System.out.println(detail);*/

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 11);
            session.delete(emp);
//            session.createQuery("delete Employee where id = " + emp.getId());
            session.getTransaction().commit();
        }

    }
}

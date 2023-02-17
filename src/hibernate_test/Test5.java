package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate_test/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);

            session.createQuery("delete Employee where salary<1300").executeUpdate();
            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            factory.close();
        }


    }
}

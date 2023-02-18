package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate_test/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Mikhail", "Malygin", "IT", 500);
//            Detail detail = new Detail("Moscow", "123456789", "malygin@gmail.com");
//            employee.setEmployeeDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//
//            System.out.println("Done");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmployeeDetail());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }


    }
}

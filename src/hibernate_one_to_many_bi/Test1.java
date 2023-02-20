package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate_test/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("IT", 300, 1300);
//            Employee employee1 = new Employee("Zaur", "Lyamovich", 500);
//            Employee employee2 = new Employee("Mikhail", "Malygin", 800);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");
// ********************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            hibernate_one_to_many_uni.entity.Department department = session.get(hibernate_one_to_many_uni.entity.Department.class, 3);
//
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());
//            session.getTransaction().commit();
//
//            System.out.println("Done");
// ********************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//
//            System.out.println("Done");
//********************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 3);

            session.delete(employee);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }


    }
}

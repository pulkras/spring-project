package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate_test/hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("Grisha", 7);
//            Child child3 = new Child("Pavel", 9);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//        Section section2 = new Section("Baseball");
//
//            session.beginTransaction();
//
//            session.persist(section1);
//            session.save(section1);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.save(child1);
//            session.save(child2);
//            session.save(child3);

//            session.getTransaction().commit();
//
//            System.out.println("Done");
// *********************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Baseball");
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Basketball");
//            Child child1 = new Child("Igor", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");
// *********************************************
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");
// *********************************************
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSectionList());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");
// *********************************************
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 8);
//            session.delete(section);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");
            session = factory.getCurrentSession();


            session.beginTransaction();

            Child child = session.get(Child.class, 4);
            session.delete(child);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }
    }
}

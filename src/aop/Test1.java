package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
//        Book book = context.getBean("book", Book.class);

//        uniLibrary.returnBook();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//
        uniLibrary.getBook();
        uniLibrary.getMagazine();
        uniLibrary.returnMagazine();
        uniLibrary.addBook();

//        schoolLibrary.getBook();

        context.close();

    }
}

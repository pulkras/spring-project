package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("we return a " + bookName + " to a library");
        context.close();
        System.out.println("method main ends");
    }
}

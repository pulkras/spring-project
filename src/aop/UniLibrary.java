package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We get a book from UniLibrary ");
        System.out.println("------------------------------");
    }
    public void returnBook() {
        System.out.println("We return a book to UniLibrary");
        System.out.println("------------------------------");

    }
    public void addBook(String personName, Book book) {
        System.out.println("We add a book");
        System.out.println("------------------------------");
    }

    public void getMagazine() {
        System.out.println("We get a magazine from UniLibrary");
        System.out.println("------------------------------");
    }
    public void returnMagazine() {
        System.out.println("We return a magazine from UniLibrary");
        System.out.println("------------------------------");
    }
    public void addMagazine() {
        System.out.println("We add a magazine");
        System.out.println("------------------------------");
    }
}

package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We get a book from UniLibrary ");
    }
    public void returnBook() {
        System.out.println("We return a book to UniLibrary");
    }
    public void addBook() {
        System.out.println("We add a book");
    }

    public void getMagazine() {
        System.out.println("We get a magazine from UniLibrary");
    }
    public void returnMagazine() {
        System.out.println("We return a magazine from UniLibrary");
    }
    public void addMagazine() {
        System.out.println("We add a magazine");
    }
}

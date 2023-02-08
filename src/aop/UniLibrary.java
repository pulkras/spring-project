package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("We get a book from UniLibrary " + book.getName());
    }

    protected void returnBook() {
        System.out.println("We return a book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We get a magazine from UniLibrary");
    }
}

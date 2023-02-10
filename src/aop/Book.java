package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("hodler")
    private String name;
    @Value("Buffett")
    private String author;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("2000")
    private int yearOfPublication;
    public String getName() {
        return name;
    }
}

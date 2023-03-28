package tpJenkins.exercice1;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String publicationDate;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}

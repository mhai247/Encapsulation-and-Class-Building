package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthors(String authorName) {
        if (this.authors.indexOf(authorName) == -1)
            this.authors.add(authorName);
    }

    public void removeAuthors(String authorName) {
        if (this.authors.indexOf(authorName) != -1)
            this.authors.remove(authorName);
    }
}

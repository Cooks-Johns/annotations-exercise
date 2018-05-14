
import java.util.ArrayList;
import java.util.List;]

@SupressWarnings("unchecked")


public class Author extends Person {

    private List <String> books;

    public Author(String books) {
        this.books = books;
    }

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    public List<String> getBooks() {

        return books;
    }

    public List<String> publishedBooks() {

        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
//    uses unchecked or unsafe operations
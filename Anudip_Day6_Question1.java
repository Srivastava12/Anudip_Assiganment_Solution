package anudip_day6_question1;
/**
 * @author Shubham Kumar
 */
import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println();
    }
}
public class Anudip_Day6_Question1 {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Create and add book objects to the ArrayList
        bookList.add(new Book(1, "The Catcher in the Rye", "J.D. Salinger"));
        bookList.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(3, "1984", "George Orwell"));
        bookList.add(new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(5, "Moby Dick", "Herman Melville"));

        // Display all book details using advanced for loop
        for (Book book : bookList) {
            book.displayBookDetails();
        }
    }
}

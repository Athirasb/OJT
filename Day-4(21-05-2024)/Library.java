import java.util.ArrayList;
import java.util.List;

public class Library {
    // Collection to hold the books in the library
    private List<Book> books;

    // Constructor to initialize the Library object
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " has been added to the library.");
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book + " has been removed from the library.");
        } else {
            System.out.println(book + " was not found in the library.");
        }
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Main method to test the Library class
    public static void main(String[] args) {
        // Create a Library object
        Library Library = new Library();

        // Create some Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Add books to the library
        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);

        // Display all books in the library
        Library.displayBooks();

        // Remove a book from the library
        Library.removeBook(book2);

        // Display all books in the library after removal
        Library.displayBooks();
    }
}


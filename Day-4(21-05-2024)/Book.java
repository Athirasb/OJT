public class Book {
    private String title;
    private String author;

    // Constructor to initialize a Book object
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods for the attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Overriding the toString() method for easy display of book information
    @Override
    public String toString() {
        return title + " by " + author;
    }
}

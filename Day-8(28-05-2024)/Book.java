public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("1234567890", "The Great Gatsby", "F. Scott Fitzgerald");
        book1.displayDetails();
        book1.borrow();
        book1.displayDetails();
        book1.returnBook();
        book1.displayDetails();
    }
}
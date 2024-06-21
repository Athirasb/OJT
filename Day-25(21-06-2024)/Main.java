import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }
}

class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks(ArrayList<Book> books) {
        for (Book book : books) {
            displayBook(book);
            System.out.println();
        }
    }
    public void displayBook(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Available: " + book.isAvailable());
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Member member, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            member.addBorrowedBook(book);
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(Member member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            member.removeBorrowedBook(book);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Member has not borrowed this book.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Benyamin", "Basheer", "1");
        Book book2 = new Book("The Alchemist", "Paulokoylo", "2");

        library.addBook(book1);
        library.addBook(book2);

        Member member = new Member("Athira", "104");
        library.addMember(member);

        library.borrowBook(member, book1);
        library.returnBook(member, book1);
        library.displayBook(book2);
        
    }
    
} 

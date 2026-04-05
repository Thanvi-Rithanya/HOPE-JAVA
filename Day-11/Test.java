import java.util.*;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // ADDED: Method to get the total number of books
    public int getBookCount() {
        return books.size();
    }

    // ADDED: Method to get a specific book by index safely
    public Book getBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + ". " + book.getTitle());
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084"));
        library.addBook(new Book("1984", "George Orwell", "978-0451524935"));

        // Display options to the user first
        library.displayBooks();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number corresponding to the book:");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // Fixed: Using library methods instead of accessing private list
            Book book = library.getBook(n - 1); 

            if (book != null) {
                System.out.println("Details found:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
            } else {
                System.out.println("Invalid selection.");
            }
        }
        scanner.close();
    }
}
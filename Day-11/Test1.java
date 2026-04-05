// Library management system using OOP concepts(simple basic version)
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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }

    // Method to get the total number of books
    public int getBookCount() {
        return books.size();
    }
    // Method to get a specific book by index safely
    public Book getBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }
    // Method to display book details by index
    public void displayBookDetails(int index) { 
        Book book = getBook(index);
        if (book != null) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        } else {
            System.out.println("Invalid index");
        }
    }
}

//get input from user which book to add to library and display the books in library
/*public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of books to add:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book title:");
            String title = scanner.nextLine();
            System.out.println("Enter book author:");
            String author = scanner.nextLine();
            System.out.println("Enter book ISBN:");
            String isbn = scanner.nextLine();

            Book book = new Book(title, author, isbn);
            library.addBook(book);
        }

        library.displayBooks();
        scanner.close();
    }
} */

//get input from user to choose no. corresponding to book and display the details of that book
public class Test1 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084"));
        library.addBook(new Book("1984", "George Orwell", "978-0451524935"));

        Scanner scanner = new Scanner(System.in);
         //display the books in library first so that user can choose the number corresponding to the book
        library.displayBooks();
        System.out.println("Enter the number corresponding to the book you want to view details of:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        //error because books is private in library class, so we need to create a method in library class to get the book details
        if (n > 0 && n <= library.getBookCount()) {
            Book book = library.getBook(n - 1); 
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        } else {
            System.out.println("Invalid number");
        }
    }
}

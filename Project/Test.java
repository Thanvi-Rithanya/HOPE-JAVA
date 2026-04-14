import java.util.*;

class Book {
    private String title; 
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {  //constructor
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
    }

    
    public int getBookCount() {
        return books.size();
    }

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
        library.addBook(new Book("The Power of the subconcious mind", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        library.addBook(new Book("You've reached Sam", "Dustin Thao", "9780451524935"));
        library.addBook(new Book("Metamorphosis", "Franz Kafka", "7880451524935"));
        library.addBook(new Book("Heaven Officials Blessing", "MXTX", "7880451524935"));
    
        library.displayBooks();  // Displaying books :-

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number corresponding to the book:");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
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
        sc.close();
    }
}


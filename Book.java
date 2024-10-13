package exception;

public class Book {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Is Available: " + book.isAvailable());

        // Setting availability
        book.setAvailable(false);
        System.out.println("After setting unavailable...");
        System.out.println("Is Available: " + book.isAvailable());
    }
}

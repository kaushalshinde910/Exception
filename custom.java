package exception;

public class custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Custom exception for book not found
		class BookNotFoundException extends Exceptions {
		    public BookNotFoundException(String message) {
		        super();
		    }
		}

		// Custom exception for invalid user
		class InvalidUserException extends Exception {
		    public InvalidUserException(String message) {
		        super(message);
		    }
		}

		// Class representing a book
		class Book {
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
		}

		// Class representing a library
		class Library {
		    private Book[] books;

		    public Library(Book[] books) {
		        this.books = books;
		    }

		    public void checkoutBook(String title) {
		        for (Book book : books) {
		            if (book.getTitle().equals(title) && book.isAvailable()) {
		                book.setAvailable(false);
		                System.out.println("Book '" + title + "' checked out successfully.");
		                return;
		            }
		        }
		        System.out.println("Sorry, the book '" + title + "' is not available.");
		    }

		    public void returnBook(String title) {
		        for (Book book : books) {
		            if (book.getTitle().equals(title) && !book.isAvailable()) {
		                book.setAvailable(true);
		                System.out.println("Book '" + title + "' returned successfully.");
		                return;
		            }
		        }
		        System.out.println("Sorry, the book '" + title + "' was not checked out.");
		    }
		}

		class Main {
		    public static void main(String[] args) {
		        Book[] books = {new Book("Book1"), new Book("Book2"), new Book("Book3")};
		        Library library = new Library(books);

		        // Example usage
		        library.checkoutBook("Book1");
		        library.checkoutBook("Book4"); // This book is not in the library
		        library.returnBook("Book1");
		        library.returnBook("Book4"); // This book was not checked out
		    }
		}

	}

}

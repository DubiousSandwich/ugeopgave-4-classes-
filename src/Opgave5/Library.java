package Opgave5;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Book book : books){
            if (book.isAvailable()){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public Book findBookByTitle(String title){
        for (Book book : books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void printAllBooks(){
        System.out.println("\nAll books: ");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

}

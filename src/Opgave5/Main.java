package Opgave5;

public class Main {

    public static void main(){
        Library library = new Library("Library");
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Surrounded by Idiots", "Thomas Erikson"));
        library.addBook(new Book("Crime And Punishment", "Fyodor Dostojevski"));
        library.addBook(new Book("Metamorphosis", "Franz Kafka"));
        library.addBook(new Book("The Hounds of Baskerville", "Sir. Arthur Conan Doyle"));

        Book book1 = library.findBookByTitle("1984");
        book1.borrow();

        Book book2 = library.findBookByTitle("Metamorphosis");
        book2.borrow();

        System.out.println(library.getAvailableBooks());

        book1.returnBook();

        library.printAllBooks();


    }

}

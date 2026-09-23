package Opgave5;

public class Book {

    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean isAvailable(){
        return this.available;
    }

    public void borrow(){
        if (available){
            System.out.println(this.title + " borrowed!");
            this.available = false;
        } else {
            System.out.println("This book is already borrowed.");
        }
    }
    public void returnBook(){
        System.out.println(this.title + " returned!");
        this.available = true;
    }

    @Override
    public String toString(){
        return "Name: " + this.title + " ||  Author: " + this.author + " || Is available: " + this.available;
    }

}

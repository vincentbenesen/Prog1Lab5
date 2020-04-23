/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * A class called book. This class has three attributes; the title, author, ISBN,
 * and the year of publishing. It also has two static attributes; the publisher
 * which initialized as "Vanier", and an amount of Books, which is initially zero.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class Book {
    
    private String title;
    private String author;
    private String ISBN;
    private int bookYear;
    private String publisher = "Vanier";
    private static int bookAmount = 0;
    
    
    public Book(String title, String author, String ISBN, int bookYear){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.bookYear = bookYear;
        String publisher;
    }
    
    public String getTitle (){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public int getBookYear(){
        return bookYear;
    }
    
    public int getBookAmount(){
        return bookAmount;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setTitle(String newTitle){
        title = newTitle;
        bookAmount++;
    }
    
    public void setAuthor(String newAuthor){
        author = newAuthor;
        bookAmount++;
    }
    
    public void setISBN(String newISBN){
        ISBN = newISBN;
        bookAmount++;
    }
    
    public void setBookYear(int newBookYear){
        bookYear = newBookYear;
        bookAmount++;
    }
    
    public void setBookAmount(int newBookAmount){
        bookAmount = newBookAmount;
    }
    
    public void setPublisher(String newPublisher){
        publisher = newPublisher;
    }
    
    @Override
    public String toString(){
        return "Book Title: " + title + "\ncreated by: " + author + "\nISBN: " 
               + ISBN + "\nPublisher: " + publisher +"\nPublishing year: " 
               + bookYear + "\nBook amount: " + bookAmount;
    }
    
    public boolean equals(Book book2){
        if (publisher.equals(book2.publisher) && bookAmount == book2.bookAmount){
            return true;
        } else {
            return false;
        }
    }
}

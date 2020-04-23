/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * This file is used to try different methods from the book class.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class BookClient {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Book programming = new Book("Java Illuminated", "Julie Anderson", 
                                    "978-1284-140996", 2020);
        System.out.println("The title of our book is " + programming.getTitle() 
                           + "\nIt is created by " + programming.getAuthor() 
                           + "\nThe ISBN of the Book is: " + programming.getISBN()
                           + "\nThe book was created on " + programming.getBookYear());
        
        programming.setTitle("Java Illumminated 10th Edition");
        programming.setAuthor("Herve Franceshi");
        programming.setBookYear(2021);
        
        System.out.println("\nThere's a new Version of programming book " 
                           + "It is called: " + programming.getTitle()
                           + "\nIt is created by " + programming.getAuthor()
                           + "\nThe ISBN is still the same which is: "
                           + programming.getISBN() + "\nThe book was created on "
                           + programming.getBookYear());
        
        Book intro = new Book("Invitaion to Computer Science", "Michael Schneider", 
                              "978-1337-561914", 2020);
        
        System.out.println("\n*****Welcome to Vanier Bookstore*****");
        System.out.println("Here's the Books information....");
        System.out.println("(1)" + "\n" + programming);
        System.out.println("\n(2)" + "\n" + intro);
        
        
        if (programming.getISBN().equals(intro.getISBN())) {
            System.out.println("\nThey have the same ISBN");
        } else {
            System.out.println("\nThey have a different ISBN");
        }
        
        if (programming.equals(intro)) {
            System.out.println("They have the same publisher and amount of the books");
        } else {
            System.out.println("They dont have the same publisher and amount of the books");
        }
    }
}

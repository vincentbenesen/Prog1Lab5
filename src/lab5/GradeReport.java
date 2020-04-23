/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *  This file is used to test the methods of Grade class.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class GradeReport {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       
        Grade vincent = new Grade("Math", 'B');
        Grade james = new Grade("Math", 'B');
        Grade adrian  = new Grade("English" , 'C');
        Grade roniel = new Grade("French", 'D');
        
        System.out.println("My grade on Math is " + vincent.getGradeLetter());
        if (vincent.equals(james)) {
            System.out.println("They have the same mark on Math");
        } else {
            System.out.println("They have a different mark on Math");
        }
        vincent.setGradeLetter('A');
        System.out.println("My new grade on Math is " + vincent.getGradeLetter());
        
        System.out.println("\nGRADE SUMMARY: ");
        System.out.println(vincent + "\n" + james + "\n" + adrian + "\n" + roniel);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 * This code is used to calculate the Greatest Common Denominator (GCD) of two numbers 
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class GCD {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int gcd = 0;
        System.out.println("Please enter your first number");
        
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Please enter your first number");
        }
        int number1 = sc.nextInt();
        
        System.out.println("Please enter your second number");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Please enter your second number");
        }
        int number2 = sc.nextInt();
        
        
        if (number1 > number2) {
            gcd = number1 % number2;
            if (gcd ==0) {
                gcd = number2;
            }
        } else if (number1 < number2){
            gcd = number2 % number1;
            if (gcd == 0) {
                gcd = number1;
            }
        }
        
        System.out.println("The greastest common denominator (GCD) of " 
                           + number1 + " and " + number2 + " is " + gcd);
    }
}

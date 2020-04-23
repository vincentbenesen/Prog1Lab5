/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.text.DecimalFormat;

/**
 * This file is designed to test the methods from the Television class.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class TelevisionApplication {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Television smartTV = new Television("Samsung", 15000);
        Television normalTV = new Television("Sony", 500);
        Television hDTV = new Television("LG", 4500);
        Television smallTV = new Television("Pioneer", 250);
        DecimalFormat priceFormat = new DecimalFormat("0.00$");

        System.out.println("*****WELCOME TO BESTBUY*****");
        System.out.println("TV's:");
        System.out.println("(1)\n" + smartTV + "\n");
        System.out.println("(2)\n" + normalTV + "\n");
        System.out.println("(3)\n" + hDTV + "\n");
        System.out.println("(4)\n" + smallTV + "\n");

        smartTV.setPrice((int) ((smartTV.getPrice() * 0.15) + smartTV.getPrice()));
        normalTV.setPrice((int) (normalTV.getPrice() * 0.15) + normalTV.getPrice());
        hDTV.setPrice((int) (hDTV.getPrice() * 0.15) + hDTV.getPrice());
        smallTV.setPrice((int) (smallTV.getPrice() * 0.15) + smallTV.getPrice());

        System.out.println("Due to the lost of our economy, the prices "
                           + "of all mechandise has increases");
        System.out.println("Updated Prices: ");
        System.out.println("TV's:");
        System.out.println("(1)\n" + smartTV + "\n");
        System.out.println("(2)\n" + normalTV + "\n");
        System.out.println("(3)\n" + hDTV + "\n");
        System.out.println("(4)\n" + smallTV + "\n");
        
        if (smartTV.equals(hDTV)) {
            System.out.println("They have the same Brand name");
        } else {
            System.out.println("They dont have the same Brand name");
        }
    }
}
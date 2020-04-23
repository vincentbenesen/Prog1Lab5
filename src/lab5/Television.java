/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.text.DecimalFormat;

/**
 * This file contains the class named Television. This class has two attribute; the 
 * brand name and the price of the product.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class Television {
    
    private String brandName;
    private int price;
    
    public Television(String brandName, int price){
        this.brandName = brandName;
        this.price = price;
    }
    
    public String getBrandName(){
        return brandName;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setBrandName(String newBrandName){
        brandName = newBrandName;
    }
    
    public void setPrice(int newPrice){
        price = newPrice;
    }
    
    @Override
    public String toString(){
        DecimalFormat priceFormat = new DecimalFormat("0.00$");
        return "BRAND: " + brandName + "\nPrice: " + priceFormat.format(price);
    }
    
    public boolean equals(Television other){
        return brandName.equals(other.brandName);
    }
}
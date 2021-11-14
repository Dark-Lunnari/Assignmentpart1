/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricecalculator;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author LUCY
 */
public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
     System.out.printf("%1s", "Please enter the item price: ");
       double price = myObj.nextDouble();
       double item = Math.round(price*100)/100;
        System.out.printf("\n");
     System.out.printf("%1s", "Please enter the discount ratio: ");
       double discount = myObj.nextDouble();
       double roundOff = Math.round(discount*100)/100.0;
       double pbt = item-(item*(roundOff/100));
       double BTax = Math.round(pbt*100)/100.0;
       double FT = BTax*0.05;
       double Federal = Math.round(FT*100)/100.0;
       double PT = BTax*0.09975;
       double Provincial = Math.round(PT*100)/100.0;
        System.out.printf("\n");
        System.out.printf("\n");
     System.out.printf("%1s %14s %.2f \n", "Original Price",":",item);   
     System.out.printf("%1s %14s %.2f %s \n", "Discount Ratio",":",roundOff,"%");
     System.out.printf("%1s %12s %.2f \n", "Price Before Tax",":",BTax);
     System.out.printf("%1s \n", "-----------------------------------------");
     System.out.printf("%1s %17s %.2f \n", "Federal Tax", ":", Federal);
     System.out.printf("%1s %14s %.2f \n", "Provincial Tax", ":", Provincial);
     System.out.printf("%1s %17s %.2f \n", "Final Price", ":", BTax+Federal+Provincial);
     System.out.printf("%1s", "@Aydan Guzevicius");
    }
    
}

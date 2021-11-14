/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancecalculator;

import java.util.Scanner;

/**
 *
 * @author LUCY
 */
public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.printf("%1s", "Please enter the initial balance: ");
        double balance = myObj.nextDouble();
        double ibal = Math.round(balance*100)/100.0;
        
        System.out.printf("%1s", "Please enter the annual interest rate: ");
        double interest = myObj.nextDouble();
        double irate = Math.round(interest*100)/100.0;
        
        System.out.printf("%1s", "Please enter the number of years the client wants to save money in the bank: ");
        float year = myObj.nextFloat();
        double nyears = Math.round(year*100)/100;
        
        System.out.printf("\n");
        System.out.printf("\n");
        
        System.out.printf("%1s %14s %.2f \n", "Initial Balance",":",ibal);   
        System.out.printf("%1s %9s %.2f %s \n", "Annual Interest Rate",":",irate,"%");
        System.out.printf("%1s %17s %.0f \n", "Saving Years",":",nyears);
        System.out.printf("%1s \n", "-----------------------------------------");
        System.out.printf("%1s %1s %1s %6s %.2f \n", "Balance after", nyears, "years", ":", ((ibal*(irate/100))*nyears)+ibal);
        
        System.out.printf("\n");
        
        System.out.printf("%1s \n", "@Aydan Guzevicius");
    }
    
}

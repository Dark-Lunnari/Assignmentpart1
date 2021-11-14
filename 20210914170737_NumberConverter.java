/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;

import java.util.Scanner;

/**
 *
 * @author LUCY
 */
public class NumberConverter {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        // TODO code application logic here
     Scanner myObj = new Scanner(System.in);
        System.out.printf("%1s", "Please enter a 4-digits Octal number: ");
        String octalString = myObj.nextLine();
        int decimal = Integer.parseInt(octalString,8);
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("%1s %7s %s \n", "Octal Number", ":",octalString );
        System.out.printf("%1s %5s %s \n", "Decimal Number", ":", decimal);
        System.out.printf("%1s", "@Aydan Guzevicius");
    }
    
}

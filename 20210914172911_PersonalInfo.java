/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.lang.Math;
/**
 *
 * @author LUCY
 */
public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your name");
          String name = myObj.nextLine();
          System.out.printf("\n");
          System.out.println("Please enter your age");
          String age = myObj.nextLine();
          System.out.printf("\n");
          System.out.println("Please enter your gender");
          String gender = myObj.nextLine();
          System.out.printf("\n");
          System.out.println("Please enter your department");
          String program = myObj.nextLine();
          System.out.printf("\n");
          System.out.println("Please enter the value of pi(3.1415926)");
          double pi = 3.1415926;
          double roundOff = Math.round(pi*100)/100.0;
          System.out.printf("\n");
          System.out.printf("\n");
          System.out.printf("%1s %14s %s \n", "Name",":",name);
          System.out.printf("%1s %15s %s \n", "Age", ":",age);
          System.out.printf("%1s %12s %s \n", "Gender", ":",gender);
          System.out.printf("%1s %8s %s \n", "Department", ":", program);
          System.out.printf("%1s %16s %s \n", "PI", ":",roundOff);
    }
    
}

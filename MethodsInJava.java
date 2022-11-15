/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java.methods.in.java;

import java.util.Scanner;

/**
 *
 * @author Magdaline
 */
public class MethodsInJava {

    public static void main(String[] args) {
        int n1,n2,n3;
        //declaring variables
         Scanner input = new Scanner(System.in);
         //ask user to enter the numbers
           System.out.println("Enter the number 1");
           n1 = input.nextInt();
           System.out.println("Enter the number 2");
           n2 = input.nextInt();
           System.out.println("Enter the number 3");
           n3 = input.nextInt();
           input.close();
      if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n3 + " is the smallest number.");

        else
            System.out.println(n2 + " is the largest number.");
      
    }
}
    


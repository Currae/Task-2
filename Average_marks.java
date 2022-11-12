/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unit.average_marks;



/**
 *
 * @author Magdaline
 */
import java.util.Scanner;
public class Average_marks {

    public static void main(String[] args) {
       {
        Scanner scan = new Scanner(System.in);
        //Enter the marks for Java programming
        System.out.print("Marks for java programming: ");
        double num1 = scan.nextDouble();
        //Enter the marks for Networking
        System.out.print("Marks for networking: ");
        double num2 = scan.nextDouble();
        //Enter the marks for Maths
        System.out.print("Marks for maths: ");
        double num3 = scan.nextDouble();
       scan.close();
       //Average of the three units
        System.out.print("The average the three units is:" + (num1 + num2 + num3) / 3);
    }

    }
}
  


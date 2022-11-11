/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
// task two question number 3(a)
package check.leap.year;

/**
 *
 * @author Magdahlyne
 */
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
       int year;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = sc.nextInt();
    	sc.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                isLeap = year % 400 == 0;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
    }


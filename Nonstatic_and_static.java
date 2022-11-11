/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package get.nonstatic_and_static;

import java.util.Scanner;

/**
 *
 * @author Magdaline
 */
public class Nonstatic_and_static {
    int Rectanglewidth,Rectanglelength;
      static int Rectanglearea;
    //Main Method
    public static void main(String[] args) {
        Rectangle Rectangle1= new Rectangle();
        Rectangle1.getInput();
        Rectangle1.SetArea();
        Rectangle1.outputArea();

    /**
     *
     */
    public void getInput()
    {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle:");
        Rectanglewidth = sc.nextInt();
         System.out.println("Enter the height of the Triangle:");
        Rectanglelength= sc.nextInt();
        //
    }
        public  int SetArea()
        {
            Rectanglearea = Rectanglewidth*Rectanglelength;
            return Rectanglearea;
        }
        public static void outputArea()
        {
       System.out.println("The area of a triangle is" +Rectanglearea);
}

    private static class Rectangle {

        public Rectangle() {
        }

        private void outputArea() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void SetArea() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void getInput() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

       
    }
}
    

    


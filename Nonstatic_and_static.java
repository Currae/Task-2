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
    int  Trianglebase, Triangleheight;
      static int  Trianglearea;
    //Main Method
    public static void main(String[] args) {
        Triangletangle Rectangle1= new  Triangle();
         Triangle1.getInput();
         Triangle1.SetArea();
         Triangle1.outputArea();

    /**
     *
     */
    public void getInput()
    {
        //start body
        
        Scanner sc = new Scanner(System.in);
        //user should enter the base of the triangle
        System.out.println("Enter the base of the Triangle:");
       Trianglebase = sc.nextInt();
        //user should enter the height of the triangle
         System.out.println("Enter the height of the Triangle:");
        Triangleheight= sc.nextInt();
        //end of body
    }
        public  int SetArea()
            //Formula of getting the area of a triangle
        {
            Trianglearea =  Trianglebase* Triangleheight/2;
            return Rectanglearea;
        }
        public static void outputArea()
            //getting output
        {
       System.out.println("The area of a triangle is"  +Trianglearea);
}

    }
}
    


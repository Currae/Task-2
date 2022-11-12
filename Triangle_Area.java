/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package formula.triangle_area;

/**
 *
 * @author Magdaline
 */
 import java.util.Scanner;
public class Triangle_Area {
    long area;
 Triangle_Area (long b,long h)
    {
     area=(b*h)/2;  
 
}
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
        //Getting the base of the triangle
      System.out.println("Enter the base of the Triangle:");
       long b= s.nextLong();
     
      //Getting the height of the triangle
      System.out.println("Enter the height of the Triangle:");
      long h= s.nextLong();
 
      Triangle_Area A1=new Triangle_Area(b,h);
      //Getting the Area
      System.out.println("Area of Triangle is: " + A1.area);      
   }
}
    


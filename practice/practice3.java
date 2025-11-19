/*
Write a Java program that reads the radius of a circle and 
prints its circumference and area
*/
package practice;
import java.util.Scanner;
public class practice3 {
    public static void main (){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the radius:");
        float r=sc.nextFloat();
        float pi=(float)3.1416;

        float area=pi*r*r;
        float circumference=2*pi*r;
        
        System.out.println("It's area:"+area);
        System.out.println("It's circumference:"+circumference);
        
        sc.close();
    }
}

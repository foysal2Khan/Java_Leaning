/*
Write the Java code of a program that reads a 4-digit number from the user. 
Print the sum of the last 2 digits of that number.
*/
package practice;
import java.util.Scanner;
public class practice5 {
    public static void main () {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the 4-digit num: ");
        int digit=sc.nextInt();

        
        int lastdigit=digit%10;
        int seclast=(digit/10)%10;
        int sum=lastdigit+seclast;

        System.out.print("The sum of last 2 digit: "+ sum);
        
        sc.close();
    }
}

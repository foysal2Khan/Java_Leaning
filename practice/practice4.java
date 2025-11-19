/*
Write a Java program that finds the number of hours, minutes, and seconds in a given number
of seconds. The number of seconds is taken as input from the user.
*/
package practice;
import java.util.Scanner;
public class practice4 {
    public static void main () {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the second:");
        int sec=sc.nextInt();

        int hour=sec/3600;
        int remain=sec%3600;
        int min=remain/60;
        int second=remain=remain%60;

        System.out.println("Hours: "+ hour +"\n"+ "Minutes: " + min +"\n"+ "Second: " + second);
        
        sc.close();
    }
}

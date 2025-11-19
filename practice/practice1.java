/*Write a Java program that takes an integer input from the user, representing the number of
pencils in a box. The user wants to distribute these pencils equally among 4 students. Your
program should calculate and display: How many pencils each student will receive and How
many pencils will remain in the box.
*/
package practice;
import java.util.Scanner;
public class practice1 {
    public static void main(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter No of pencils:");
        
        int pencil=sc.nextInt();
        int receive=pencil/4;
        int remain=pencil%4;
        
        System.out.println("Student's gets "+ receive + " pencils");
        
        System.out.println("Remaining pencils "+ remain +" in the box");

        sc.close();
    }  
}

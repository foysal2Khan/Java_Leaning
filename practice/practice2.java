/*
Write a Java program that reads an integer and prints "True" if the number is even, otherwise,
"False"
*/

package practice;

import java.util.Scanner;
public class practice2 {
      public static void main () {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }        
        
        sc.close();
      }
}

/*
Write a Java program that takes a string as input 
and prints whether it is a palindrome or not.
*/
package practice;
import java.util.Scanner;
public class prac11part2 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
    
        String str1=sc.nextLine();

        StringBuilder stringb= new StringBuilder(str1);
        String str2=stringb.reverse().toString();

        System.out.println(str2);

        if (str1.equals(str2)){
            System.out.println(str1 + " is a Palindrom");
        }     
        else{
            System.out.println(str1+ " in not a palindrom");
        }
    
        sc.close();
    }
}

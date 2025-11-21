/*
Write a Java program that takes a string as input 
and prints whether it is a palindrome or not.
*/

package practice;
import java.util.Scanner;
public class practice11 {
    public static void main () {
        Scanner sc=new Scanner(System.in);
        
        String original=sc.nextLine();      
        String rev="";

        for(int i=original.length()-1;i>=0;i--){
            rev+=original.charAt(i);
        }
        if(original.equals(rev)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
        sc.close();
    }
}
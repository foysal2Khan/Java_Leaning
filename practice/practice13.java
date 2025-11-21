/*
Write a Java program that takes a string as input and prints 
only the upper-case/ lower-case letters from that string.
*/

package practice;
import java.util.Scanner;
public class practice13 {
    public static void main () {
        Scanner sc=new Scanner(System.in); 

        System.out.print("Enter the string: ");
        String str1=sc.nextLine();
        
        

        System.out.print("Upper Case: ");
        for(int i=0; i<=str1.length()-1; i++){
            char c=str1.charAt(i);
             
            if(c>= 'A' && c<= 'Z'){
                System.out.print(c + " ");
              }
            }
            System.out.println();

            System.out.print("Lowercase:");
            for(int i=0; i<=str1.length()-1; i++){
            char c=str1.charAt(i);
             
            if(c>= 'a' && c<= 'z'){
                System.out.print(c + " ");
              }
            }

            sc.close();
        }       
}

/*
Write a java program that takes a string as input 
and prints all the characters in reverse order.
 */
package practice;
import java.util.Scanner;
public class practice17 {
    public static void main () {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str1=sc.nextLine();
        

        for(int i=str1.length()-1;i>=0;i--){
           System.out.print(str1.charAt(i)+" ");
        }
        System.out.println();

        //another way

        System.out.println("Enter the string");
        String str1s=sc.nextLine();

        StringBuilder stringb= new StringBuilder(str1s);
        String str2 = stringb.reverse().toString();

        System.out.println("Reverse string : "+str2);

        sc.close();
    }
}

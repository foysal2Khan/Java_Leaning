/*
Write a java program to find out the 
ascii value of a character.(vice versa)
*/

package practice;

import java.util.Scanner;

public class practice16 {
    public static void main () {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char c=sc.next().charAt(0);
        int asciivalue=(int) c;
        System.out.println("ACSII value of "+c+" is "+asciivalue);

        System.out.print("Enter an ASCII value (integer): ");
        int value=sc.nextInt();
        char character= (char) value;
        System.out.println("Character for ASCII value " + value + " is: '" + character + "'");

        sc.close();
    }
}
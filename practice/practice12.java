/*
Write a Java program that takes a string as input and 
prints the number of vowels and consonants in that string.
*/
package practice;
import java.util.Scanner;
public class practice12 {
    public static void main () {
        Scanner sc=new Scanner(System.in);
        

        int vowel=0;
        int cons=0;
        System.out.print("Enter the string: ");
        String str1=sc.nextLine().toLowerCase();

        for(int i=0; i<=str1.length()-1; i++){
            char c=str1.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel++;
            }
            else{
                cons++;
            }
        }
        
        System.out.println(vowel);
        System.out.println(cons);

        sc.close();
    }
}

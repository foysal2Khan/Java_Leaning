/*
Write a java program that takes a number from the user 
and prints its divisors
*/

package practice;

import java.util.Scanner;

public class practice14 {
    public static void main () {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the num:");
        int num=sc.nextInt();

        System.out.print("Divisors are:");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}

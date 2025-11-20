/*
Write a Java code of a program that asks the user to enter ten numbers and
then display the total and the average of ONLY the odd numbers 
among those ten numbers.
*/

package practice;
import java.util.Scanner;
public class practice8 {
    public static void main () {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 10 no:");
        int sum=0;
        double average=0;
        int count=0;       

        for(int i=0;i<10;i++){
            int num=sc.nextInt();
            if (num%2!=0){
                sum+=num;
                count++;
            }
        }
        average=(double)sum/count;
       

        System.out.println("Total of odd num: "+sum);
        System.out.println("The average is: "+average);

        sc.close();
    }
}

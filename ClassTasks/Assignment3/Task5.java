/*Write a Java program that takes a number as input from 
  the user and prints the divisors of that number
  as well as how many divisors the number has.
 */
package ClassTasks.Assignment3;
import java.util.Scanner;
public class Task5 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.println(i);
                
            }
        }
        System.out.print("Total divisors are:"+count);
        sc.close();
    }
}

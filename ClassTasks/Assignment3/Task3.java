/*Write a Java program that takes an integer number and 
prints how many digits are in that number. */

package ClassTasks.Assignment3;
import java.util.Scanner;
public class Task3 {
    public static void main(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int count=0;

        while(num>0){  
             int last=num%10;
             num=num/10;
             System.out.print(last+" ");
             count++;
            }
          System.out.println("\n"+"The number of digits: "+count);  
        sc.close(); 
    }
}

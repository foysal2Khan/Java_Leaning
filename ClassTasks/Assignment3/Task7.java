/*Write a Java program that asks the user for one number 
and tells if it is a prime number or not. using count */
package ClassTasks.Assignment3;
import java.util.Scanner;
public class Task7 {
    public static void main(){
        int count= 0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(num+" has "+count+" divisors");
        
        if(count==2){
        System.out.print("This is a prime number");
        }
        else{
            System.out.print("This is not a prime number");
        }
        sc.close();
    }
}


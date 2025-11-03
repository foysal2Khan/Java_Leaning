/*Write a Java program that asks the user for one number 
and tells if it is a prime number or not. using count */

package ClassTasks.Assignment3;
import java.util.Scanner;

public class Task7flag {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ente the number:");
        int num=sc.nextInt();
        boolean flag=true;
        
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        
        if(flag==true){
            System.out.print("This is a prime number");
        }
        else{
            System.out.print("This is not a prime number");
        }
        sc.close();
    } 
}

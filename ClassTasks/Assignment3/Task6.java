/*Write a Java program that takes a number as input from the user 
and tells if it is a perfect number or not
*/

package ClassTasks.Assignment3;
import java.util.Scanner;
public class Task6 {
    public static void main(){
        
        int sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int num=sc.nextInt();
        
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        
        if(sum==num){
        System.out.print("This num is a perfect number");
        }
        else{
            System.out.print("This num is not perfect number");
        }
        sc.close();
    }
}

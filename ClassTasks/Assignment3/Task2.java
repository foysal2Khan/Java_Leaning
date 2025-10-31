/*Write a Java program which takes an integer number and 
prints the digits from the unit place, then the tenth,
then hundredth, etc. (Right to Left)*/

package ClassTasks.Assignment3;
import java.util.Scanner;
public class Task2 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:"); 
        int num=sc.nextInt();
       
        while(num>0){  
             int last=num%10;
             num=num/10;
             System.out.print(last);
            }
    sc.close();
    }
}
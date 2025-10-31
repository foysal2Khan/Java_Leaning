/*Write a Java program which takes an integer number and 
prints its digits from left to right */
package ClassTasks.Assignment3;
import java.util.Scanner;
public class Task4 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int count=0;

        while(num>0){  
             int last=num%10;
             num=num/10;
             System.out.print(last+" ");
             count++;
            }

          //left to right
          
          int digit=(int) Math.pow(10,count-1);
          while(temp>0){
              int n=num%digit;
              System.out.print(n);
              temp=temp/digit;
              digit=digit/10;
          }
        sc.close();
    }
}

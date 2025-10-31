/*Write a Java program that asks the user for a quantity, 
then takes that many numbers as input and prints the maximum,
minimum and average of those numbers. */

package ClassTasks.Assignment3;
import java.util.Scanner;
public class Task1 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        int min=0;
        float avarage=0f;
        int sum=0;
        for(int i=1;i<=num;i++){
            int num1=sc.nextInt();
            if (i==1){
                max=num1;
                min=num1;
            }

            else if (num1>max){
                max=num1;
            }
            
            else if (num1<min){
                min=num1;
            }
            sum+=num1;

        }
        avarage=(float)sum/num;
        System.out.printf("Maximum:%d\nMinimum=%d\nAvarage=%.1f",max,min,avarage);
        sc.close();

    }
}

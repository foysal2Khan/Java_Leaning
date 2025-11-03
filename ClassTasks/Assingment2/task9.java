/*
Write a Java program to compute and display a person’s weekly salary as 
determined by the following conditions:
#If the hours worked is less than or equal to 40, then the person receives Tk 200 per hour.
#If the hours worked is greater than 40, then the person receives Tk 8000 plus
Tk 300 for each hour worked over 40 hours.
#The program should request the hours worked as an input from the user and
display the salary as output. You need to make sure that user input is valid. 
For example, a person cannot work for -5 hours or more than 168 hours in a week.
So, the valid hours range is 0 to 168. For invalid hours, print outputs as given in the samples below.
*/

package ClassTasks.Assingment2;
import java.util.Scanner;
public class task9 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int hour=scan.nextInt();
        if(hour>0){
            if(hour<=40){
                int salary=hour*200;
            System.out.print(salary);
            }
            else{
                int salary=8000+(hour-40)*300;
            System.out.print(salary);
            }
        }
        else{
         System.out.println("The input is invalid");
        }
            scan.close();
    }
}

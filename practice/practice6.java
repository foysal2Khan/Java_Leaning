/*
Write a Java program that reads a student’s mark for a single subject, and prints out the
corresponding grade for that mark. The mark ranges and corresponding grades are shown in the
table below. You need to make sure that the mark is valid. For example, a student cannot receive
-5 or 110 marks. So, the valid marks range from 0 to 100.
*/

package practice;
import java.util.Scanner;
public class practice6 {
    public static void main (){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the mark: ");
        int mark=sc.nextInt();

        if(mark>0 && mark<=100){
            if(mark>=90){
                System.out.print("A");
            }
            else if(mark>=80 && mark<90){
                System.out.print("B");
            }
            else if(mark>=70 && mark<80){
                System.out.print("C");
            }
            else if(mark>=60 && mark<70){
                System.out.print("D");
            }
            else if(mark>=50 && mark<60){
                System.out.print("E");
            }
            else{
                System.out.print("F");
            }
        }
        else{
            System.out.print("The mark is not valid");
        }     
        sc.close();
    }
}

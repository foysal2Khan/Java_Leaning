/* Write the Java code of a program that reads two numbers from the user. 
The program should then print "First is greater" if the first number is greater,
"Second is greater" if the second number is greater, and "The numbers are equal" otherwise.
*/

package ClassTasks.Assingment2;
import java.util.Scanner;
public class task3 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int sec=scan.nextInt();
        if(first>sec){
            System.out.print("First is greater.");
        }
        else{
            System.out.print("Second is greater.");
        }
        scan.close();
        
    }
}

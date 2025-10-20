/*Write the code of a program that reads two numbers from the user,prints their sum,product 
 * and difference.
 */
package ClassTasks.Assingment2;
import java.util.Scanner;
public class task1 {
    public static void main(){
    Scanner sc=new Scanner(System.in);
    int first=sc.nextInt();
    int sec=sc.nextInt();
    System.out.println("Sum:"+(first+sec));
    System.out.println("Product:"+(first*sec));
    System.out.print("Different:"+(first-sec));
  sc.close();
}
}

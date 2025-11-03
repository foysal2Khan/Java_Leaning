/*write a java program that reads an integer, and prints 
the integer if it is a multiple of either 2 or 5 but not both .
if the number is a multiple of 2 and 5  ,then print
"multiple of 2 and 5 both". For all other number,
the program prints,"not multiples of 2 and 5".
 */

package ClassTasks.Assingment2;
import java.util.Scanner;
public class task6 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The number:");
        int num=scan.nextInt();
        if(num%2==0 ^ num%5==0){
            System.out.print(num);
        }
        else {
            System.out.print("not a multiple of 2 and 5");    
        }
        scan.close();
    }
}
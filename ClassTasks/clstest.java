/*Write a Java program that takes an hour from the user as 
   input and tells it is time for which meal.
 */

package ClassTasks;
import java.util.Scanner;
public class clstest {
    public static void main(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The hour: ");
        int hour=sc.nextInt();

        if(hour>=0 && hour<24){
            if(hour>=4 && hour<=6){
                System.out.print("Breakfast");
            }
            else if(hour>=12 && hour<=13){
                System.out.print("Lunch");
            }
            else if(hour>=16 && hour<=17){
                System.out.print("Snacks");
            }
            else if(hour>=19 && hour<=20){
                System.out.print("Dinner");
            }
            else{
                System.out.print("Patient is a virtue");
            }

        }
        else{
            System.out.print("Wrong time");
        }
        sc.close();
    }
}

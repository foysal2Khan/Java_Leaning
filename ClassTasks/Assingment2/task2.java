/*Write the java code of a program that reads the radius of a circle and prints its
circumference and area 
 */

package ClassTasks.Assingment2;
import java.util.Scanner;
public class task2 {
    public static void main(){
        Scanner Scanf=new Scanner(System.in);
        float r=Scanf.nextFloat();
          float pi=3.1416f;
        double Area=pi*r*r;
        double circumference=2*pi*r;
        System.out.println("Area is: "+Area);
        System.out.print("Circumference is: "+circumference);

        Scanf.close();
    }
}

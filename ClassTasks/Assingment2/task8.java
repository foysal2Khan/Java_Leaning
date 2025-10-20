package ClassTasks.Assingment2;
import java.util.Scanner;
public class task8 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int km=scan.nextInt();
        int sec=scan.nextInt();
        km=km/1000;
        float hour=sec/3600;
         float velocity=km/hour;
         
         if(velocity<60){
            System.err.print(velocity+":Too slow.Needs more Changes");
        }
        else if(velocity>=60 && velocity<=90){
            System.err.print(velocity+" :velocity is okay.The car is ready!");
        }
        else if(velocity>90){
            System.out.print(velocity+"is Too fast. Only a few changes should suffice");
        }
            scan.close();
   
    }
}

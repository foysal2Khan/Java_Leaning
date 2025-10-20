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

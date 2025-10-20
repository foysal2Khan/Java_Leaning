package ClassTasks.Assingment2;
import java.util.Scanner;
public class task4 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int sec=scan.nextInt();
        if (first>sec){
            int subtract=first-sec;
            System.out.print(subtract);
        }
        else{
            int subtract=sec-first;
            System.out.print(subtract);
        }
        scan.close();
    }
}
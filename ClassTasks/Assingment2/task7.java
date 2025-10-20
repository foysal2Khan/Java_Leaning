package ClassTasks.Assingment2;
import java.util.Scanner;
public class task7 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
            int sec=scan.nextInt();
            int hour=sec/3600;
            int remain=sec%3600;
            int min=remain/60;
            remain=remain%60;
            System.out.print("Hours: "+hour);
            System.out.print(" Min: "+min);
            System.out.print(" Second: "+remain);
        
        scan.close();
    }
}
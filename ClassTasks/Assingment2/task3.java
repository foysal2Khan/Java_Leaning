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

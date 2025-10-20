package ClassTasks.Assingment2;
import java.util.Scanner;
public class task6 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0 || num%5==0){
            System.out.print(num +" is multiple of 2 or 5.");
        }
        else{
            System.out.print(num +" is not multiple of 2 or 5.");
        }
        scan.close();
    }
}
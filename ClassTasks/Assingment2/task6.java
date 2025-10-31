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
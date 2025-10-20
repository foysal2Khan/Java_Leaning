package ClassTasks.Assingment2;
import java.util.Scanner;
public class task5 {
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if (n%2==0){
            System.out.print("The number is even");
        }
        else{
            System.out.print("The number is odd");
        }
        scan.close();
    }
}

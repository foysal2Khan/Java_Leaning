package ClassTasks;
import java.util.Scanner;

public class task5 {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int base =sc.nextInt();
        int pow= sc.nextInt();
        
        System.out.print(Math.pow(base, pow));
        
        sc.close();

    }
}
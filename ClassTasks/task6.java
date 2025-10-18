package ClassTasks;
import java.util.Scanner;

public class task6 {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int noofchoco=sc.nextInt();
        
        int rec=noofchoco/3;
        int remaining=noofchoco%3;

        System.out.println("Each friend will receive:"+rec);
        System.out.print("the no of remaining:"+remaining);
        sc.close();
    }
}

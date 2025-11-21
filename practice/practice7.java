/*
Write a Java code that will calculate the value of y if 
the expression of y is as follows (n is the input):
y=1^2−2^2+3^2−4^2+5^2.........+n^2
y=12-15+18-21+24-27+30
*/
package practice;
import java.util.Scanner;
public class practice7 {
    public static void main (){
        Scanner sc=new Scanner(System.in);
        
        //y=1^2−2^2+3^2−4^2+5^2.........+n^2
        int n=sc.nextInt();
        int y=0;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                y+=i*i;
            }
            else{
                y+=-1*(i*i);
            }
        }
        System.out.println(y);

        //while loop

        int sum2=0;
        int j=1;
        while(j<=n){
            if(j%2!=0){
                sum2+=j*j;
            }
            else{
                sum2+=-1*(j*j);
            }
            j++;
        }
        System.out.println(sum2);

        //y=12-15+18-21+24-27+30
        
        int x=0;
        int sign=1;
        for(int i=12;i<=30;i+=3){
            x+=sign*i;
            sign*=-1;
        }
          System.out.println(x);  
          
          //while loop

          int z=12;
          int sum=0;
          while(z<=30){
               if(z%2!=0){
                sum+=-1*z;
               }
               else{
                sum+=z;
               }
               z+=3;
          }
          System.out.println(sum);

         
        sc.close();
    }
}
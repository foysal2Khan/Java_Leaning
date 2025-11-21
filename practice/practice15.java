package practice;

import java.util.Scanner;

public class practice15 {
    public static void main () {
        Scanner sc=new Scanner(System.in);

        //Prime No check
        int count=0;
        System.out.print("Enter the number:");
        int num=sc.nextInt();
         
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;                
            }
         }

         if(count==2){
            System.out.println(num+" is the Prime no.");
         }
         else{
            System.out.println(num+" is not the prime no.");
         }

         //perfect no

         System.out.print("Enter the number:");
         int num2=sc.nextInt();
         int sum=0;

        for(int i=1;i<num2;i++){
            if(num%i==0){
                   sum+=i;             
            }
         }

         if(sum==num2){
            System.out.print(num2+ " is the perfect no.");
         }
         else{
            System.out.print(num2 +" is not the perfect no");
         }
         sc.close();
    }
}


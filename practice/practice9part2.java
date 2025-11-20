/*
Print the following patterns:
      1
    1 2
  1 2 3
1 2 3 4
*/

package practice;

public class practice9part2 {
    public static void main () {
           for(int i=1; i<=4; i++){
                 for(int k=1; k<=4-i; k++){
                    System.out.print("  ");
                 }
                 
                 for(int j=1;  j<=i; j++){
                     System.out.print(j+" ");
                }
                 System.out.println("\n");
           }
    }
}
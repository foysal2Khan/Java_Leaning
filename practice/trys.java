package practice;

public class trys {
    public static void main(){
       int a = 10, b = 5, c = 8;
a = ++b + c--;
boolean result = (a > c) && (b != c) || (--a == b);
System.out.println("a = " + a + ", b = " + b + ", c = " + c);
System.out.println("result = " + result);
System.out.println(b++ == c);
System.out.println(a+c%b<=10);
    }
    
}

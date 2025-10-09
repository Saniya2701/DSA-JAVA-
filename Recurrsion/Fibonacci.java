package Recurrsion;
import java.util.*;
public class Fibonacci {

    public static int FibonacciNumber(int n){
        
        if(n==0 || n==1){
            return n;
        }
       

        int fibnm1= FibonacciNumber(n-1);
        int fibnm2 = FibonacciNumber(n-2);

        int fib = fibnm1+fibnm2;
        return fib;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

       System.out.println( FibonacciNumber(n));
    }
}

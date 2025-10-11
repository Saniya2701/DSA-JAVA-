package Recurrsion;
import java.util.*;
public class PowerXraiseNOptimized {

    public static int OptiPowerXN(int x,int n){
        if(n==1){
            return x;
        }
       int halfPower=OptiPowerXN(x,n/2);
       int halfPowerSq= halfPower*halfPower;
        
       if(n%2==1){ //for n is odd
         halfPowerSq= x*halfPowerSq;
       }
       return halfPowerSq;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();

        System.out.println("Enter value of n:");
        int n=sc.nextInt();

        System.out.println(OptiPowerXN( x, n));
    }
}
//TC= O(logn)

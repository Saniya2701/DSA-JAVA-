package Recurrsion;
import java.util.*;
public class SumOfNumber {

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = Sum(n-1);// sum of n-1(snm1)
        int sn= n+snm1;
        return sn;  //sum of n (sn)
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();

        System.out.println(Sum(n));
    }
}

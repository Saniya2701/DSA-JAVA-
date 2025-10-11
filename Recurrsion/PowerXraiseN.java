package Recurrsion;

import java.util.*;
public class PowerXraiseN {
    public static int powerXN(int x,int n){
        if(n==1){ //we can take n==0 and return 1
            return x;
        }

       int xnm1=powerXN(x,n-1);
       int xn=x*xnm1;
       return xn;

       //or we can write in only 1 line ....return x*powerXN(x,n-1)
    }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of x:");
    int x=sc.nextInt();

    System.out.println("Enter value of n:");
    int n=sc.nextInt();

    System.out.println(powerXN(x, n));
 }   
}

//TC=O(n)
package Recurrsion;
import java.util.*;
public class PrintNumberDec {
    public static void PrintDec(int n){

        if(n==1){  // basecase
            System.out.println(n);
            return;
        }

        System.out.println(n+" ");//first print n and then n-1
        PrintDec(n-1); //inner function  
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        PrintDec(n);
    }
}

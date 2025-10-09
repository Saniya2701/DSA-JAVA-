package Recurrsion;
import java.util.*;
public class Factorial {
          
    public static int Printfact(int n){
        if(n==0){
            return 1;
        }

        int fnm1 = Printfact(n-1);
        int fn = n* Printfact(n-1);
        return fn;

    }






    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

       System.out.println( Printfact(n));
    }
}

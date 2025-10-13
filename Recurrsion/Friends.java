package Recurrsion;
import java.util.*;
public class Friends {

    public static int friendpairing(int n){
        if(n==1 || n==2){
            return n;
        }

        //single
        int fnm1=friendpairing(n-1);

        //pair
        int fnm2=friendpairing(n-2);
        int pairways=(n-1)*fnm2;

        //totalways
        int totalways= fnm1+pairways;
        return totalways;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=sc.nextInt();

        System.out.println(friendpairing(n));

    }
}
// golden sachs 
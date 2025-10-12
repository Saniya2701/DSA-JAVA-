package Recurrsion;
import java.util.*;
public class Tiling {
    public static int TilingProblem(int n){ //2 x n (floor size)
        if(n==0 || n==1){
            return 1;
        }

        //vertical choice
        int fnm1= TilingProblem(n-1);

        //horizontal choice
        int fnm2 = TilingProblem(n-2);

        int totalways = fnm1+fnm2;
        return totalways;
    }
    public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter value of n:");
      int n= sc.nextInt();

      System.out.println(TilingProblem(n));

    }
}

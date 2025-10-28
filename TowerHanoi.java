package Recurrsion;

import java.util.*;
public class TowerHanoi {
    public static void TowerOfHanoi(int n , char A , char C , char B){
        if(n==0){
            return;
        }

        TowerOfHanoi(n-1,A,B,C);
        System.out.println(A +" to "+ C);
        TowerOfHanoi(n-1, B, C, A);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n= sc.nextInt();
       TowerOfHanoi(n,'A','C', 'B');

    }
    
}

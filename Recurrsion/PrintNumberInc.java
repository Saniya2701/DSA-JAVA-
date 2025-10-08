package Recurrsion;
import java.util.*;
public class PrintNumberInc {
      

   public static void Print_Increse(int n){
  
    if(n==1){
        System.out.println(n);
        return;
    }
    Print_Increse(n-1);  // first print n-1 and then n
    System.out.println(n +" ");
    
   } 
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();

    Print_Increse(n);
   }
}

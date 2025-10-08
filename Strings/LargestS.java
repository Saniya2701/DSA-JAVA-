package Strings;
import java.util.*;

public class LargestS {
 
    public static void Largest_String(String fruits[],int n){
        String largest=fruits[0];
        for(int i=0;i<n;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }

        }
       


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of string:");
        int n=sc.nextInt();
        
        String fruits[]=new String[n];

        System.out.println("Enter String elements:");
        for(int i=0;i<n;i++){
           fruits[i]=sc.nextLine();
        }

        Largest_String(fruits, n);

    }
}

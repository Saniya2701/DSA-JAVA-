package Arrays;
import java.util.*;

public class PairsA {
    

    public static void printPairs(int numbers[],int n){
        int tp=0;  //total pairs    tp=n(n-1)/2  { formula is important}
        for(int i=0;i<n;i++){
            int curr=numbers[i];  //e.g array  2, 4, 6, 7, 8  
            for(int j=i+1;j<n;j++){
                System.out.print("("+ curr +","+ numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:" +tp);
    }
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();

    int numbers[]=new int[n];

    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
        numbers[i]=sc.nextInt();
    }

    printPairs(numbers, n);


  }

}

//TC = O(n2)
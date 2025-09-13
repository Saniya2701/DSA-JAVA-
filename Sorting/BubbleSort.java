package Sorting;
import java.util.*;
public class BubbleSort {
     
  public static void Bubble_Sort(int arr[],int n){
      for(int turn =0;turn<n-1 ; turn++){
        for(int j=0;j<n-1-turn;j++){
            if(arr[j]>arr[j+1]){
                //swap

                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }

      }
  }
  
  public static void printarr(int arr[],int n){
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+ " ");
    }
    System.out.println();
  }

    public static void main(String args[]){

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n=sc.nextInt();
      
      int arr[] = new int[n]; //mistake: i always forget to create array in main function

      System.out.println("Enter the values in array:");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      Bubble_Sort(arr, n);
      System.out.println("Sorted array :");
      printarr(arr,n);

    }
}
//TC= O(n2)
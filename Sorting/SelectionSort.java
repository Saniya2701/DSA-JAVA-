package Sorting;
import java.util.*;
public class SelectionSort {

public static void Selection_Sort(int arr[],int n){
  
    for(int i=0;i<n-1;i++){
        int minPos =i;
        for(int j=i+1;j<n;j++){
            if(arr[minPos]> arr[j]){
                minPos=j;
            }
        }

        //swap
        int temp=arr[minPos];
        arr[minPos]= arr[i];
        arr[i]=temp;

    }

}

public static void printarr(int arr[],int n){
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();
}


    public static void main(String args[]){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array:");
       int n=sc.nextInt();

       int arr[]=new int[n];

       System.out.println("Enter the array elements:");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

       Selection_Sort(arr, n);
       System.out.println("Sorted array:");
       printarr(arr, n);

    }
}

//TC = O(n2)

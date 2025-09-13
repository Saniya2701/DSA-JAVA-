package Sorting;
import java.util.*;
public class InsertionSort {
    

    public static void Insertion_Sort(int arr[],int n){
     
        for(int i=1;i<n;i++){
            int curr =arr[i];
            int prev=i-1;

            // finding out the current pos to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            
              //insertion
              arr[prev+1]= curr;
            
        }

    }

    public static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
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

      // Arrays.sort(arr, 0 ,3);  inbuild Sort

        Insertion_Sort(arr, n);
        System.out.println("Sorted array:");
        printarr(arr, n);
        
       
    }


    
}

package Sorting;
import java.util.*;
public class OptimizedBubbleSort {
    
    public static void Optimized_Bubble(int arr[],int n){
        for(int i=0;i<n-1;i++){
            boolean swaped =false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){

                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;

                  swaped = true;
            }
            }
            if(swaped== false){
                break;
            }
        }
    }

    public static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]  +" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Optimized_Bubble(arr,n);
        System.out.println("Sorted array:");
        printarr(arr, n);
    }
}

package Sorting;
import java.util.*;

public class CountingSort {

    public static void Counting_Sort(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest, arr[i]);
        }
        System.out.println("DEBUG: largest = " + largest); //

        int count[] = new int[largest+1];

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        System.out.println("DEBUG: count array = " + Arrays.toString(count));//

        // sorting 
        int j = 0;
        for(int i = 0; i <= largest; i++){   // <-- correct boundary
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("DEBUG: final j = " + j);//
    }

    public static void printarr(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Counting_Sort(arr, n);
        System.out.println("Sorted array:");
        printarr(arr, n);
    }
}


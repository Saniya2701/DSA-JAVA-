package Recurrsion;
import java.util.*;
public class SortedArray {

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){ //base case
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            
        arr[i]=sc.nextInt();
        }
        System.out.println(isSorted(arr, 0));

    }
}

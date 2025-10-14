package DivideConquer;
import java.util.*;
public class QuickSort {
 
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void QuickSortRecurr(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
       
        //last elements
        int pidx = partition(arr,si,ei);
        QuickSortRecurr(arr, si, pidx-1);//left part
        QuickSortRecurr(arr,pidx+1, ei);//right part

    }  

    public static int partition(int arr[],int si,int ei){
         int pivot = arr[ei];
         int i= si-1;//to make place for elements smaller than pivot

         for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;

                //swap
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
         }
         i++;
         int temp= pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;


    }
    
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        QuickSortRecurr(arr,0,arr.length-1);
        printarr(arr);


    }
}

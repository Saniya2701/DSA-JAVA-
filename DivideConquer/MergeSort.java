package DivideConquer;
import java.util.*;
public class MergeSort {
    public static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    //recurssion fun
    public static void MergeSortRec(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }

        //kaam
        int mid= si+(ei-si)/2; //dont take mid=si+ei/2

        MergeSortRec(arr,si,mid); //for left part
        MergeSortRec(arr, mid+1, ei); //for right part
        merge(arr,si,mid,ei);
    }
     
   //merge fun
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
         
        int i=si; //iterator for left part
        int j=mid+1; //iterator for right part
        int k=0; // iterator for temp arr
       
        //camparision
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        //remaining elements of left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //remaining ele of right part
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
          arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       MergeSortRec(arr, 0, arr.length-1);
       printarr(arr, n);

    }
}

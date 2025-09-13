package Arrays;

import java.util.*;
public class BinarySearch {
    

    public static int BinaryS(int numbers[],int val,int n){
        int beg=0;
        int end=n-1;
        
        
        while(beg<=end){

            int mid=(beg+end)/2;
           
            //comparasion
            if(numbers[mid]==val){
                return mid;
                
            }
            else if(numbers[mid]>val){
                 end=mid-1;
            }
            else {
                   beg=mid+1;
            }

        
        }
         return -1;   //not found
        
        
    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int numbers[] =new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){  // should be only = n 
            numbers[i]=sc.nextInt();
        }

        System.out.println("Enter the value to be found:");
        int val=sc.nextInt();


       int pos= BinaryS(numbers, val,n);

       if(pos==-1){
        System.out.println("Element not found.");
       }
       else{
        System.out.println("Element found at:" + pos);
       }
    }
}

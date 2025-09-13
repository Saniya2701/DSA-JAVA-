package Arrays;
import java.util.*;
public class MaxSubarraySumPrefix {
    

    public static void Prefix_Array_MaxSubArray(int numbers[], int n){
      int currSum=0;
      int maxSum=Integer.MIN_VALUE;
      
      int prefix []=new int[n]; // create the prefix array
       

      prefix[0]=numbers[0];  // sum till the 0 index in 0
      
      //calculate the prefix array
       for(int i=1;i<n;i++){
          prefix[i]= prefix[i-1]+numbers[i];
       }

       //start of the array
       for(int i=0;i<n;i++){
        int start =i;
           
             //end of the array
             for(int j=i;j<n;j++){
                int end= j;
                
                //calculate the sum of subarray 
                // but if start = 0 it will give prefix[start - 1]= -1 which is wronge 
                // thats why i use ternary operator 
                currSum= start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
                  
                if(maxSum < currSum){
                    maxSum= currSum;
                }

             }

       }

       System.out.println("max of sum :" + maxSum);


    }

    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int numbers[]=new int[n];
       
        System.out.println("Enter the array Elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
       

        Prefix_Array_MaxSubArray(numbers, n);


    }
}

//TC= O(n2) cause only 2 loops are used
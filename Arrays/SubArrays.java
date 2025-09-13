package Arrays;
import java.util.*;
public class SubArrays {
    

    public static void Sub_Arrays(int numbers[],int n){
        int ts=0; 
        int minSum= Integer.MAX_VALUE; //min and max of sum
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int sum=0;
                int end=j;
                
                for(int k=i;k<=j;k++){   //print 
                    System.out.print( numbers[k]+ "  "); //subarrays
                    sum=sum+numbers[k];// update of sum
                
                    
                }
                ts++;
                System.out.println("\nSum of subarrays:" +sum);
                System.out.println();

               //update min and max
               minSum =Math.min(minSum,sum);
               maxSum =Math.max(maxSum, sum);
            
            }
            System.out.println();
        }
       System.out.println("Total SubArrays are:" + ts);
       System.out.println("Minimun sum is:" +minSum);
       System.out.println("Maximum sum is:" +maxSum);
        
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();

        int numbers[]=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("\nSubArrays are:");
        Sub_Arrays(numbers, n);


    }
}


//TC = O(n3) 
// 3 loops are used
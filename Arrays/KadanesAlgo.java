package Arrays;
import java.util.*;
public class KadanesAlgo {
    

    public static void MaxSum_SubArray_Kadanes(int numbers[],int n){
        int ms=Integer.MIN_VALUE;
        int cs= 0;

        for(int i=0;i<n;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);  // this function campare cs and ms and max value is set to ms
        }

        System.out.println("max of Subarrays sum :" +ms);
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        int numbers[]=new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        MaxSum_SubArray_Kadanes(numbers, n);
    }
}

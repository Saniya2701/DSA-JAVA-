package Arrays;
import java.util.*;
public class ReverseA {
    

    public static void Reverse(int numbers[],int n){

        int beg=0;
        int end=n-1;

        while(beg<=end){

            //swap
            int temp = numbers[end];
            numbers[end] = numbers[beg];
            numbers[beg] = temp;
          
            beg++;
            end--;
        
        }

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        int numbers[]=new int[n];

        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        
        Reverse(numbers,n);   //my mistake == first i call the function in int form where my function doesnt return anything its void

        System.out.println("Reverse of array is:");
        for(int i=0;i<n;i++){
            System.out.println(numbers[i]+" ");
        }


    }
}

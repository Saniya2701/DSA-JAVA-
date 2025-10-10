package Recurrsion;
import java.util.*;
public class FirstOccurence {
    public static int FirstOccu(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccu(arr,key,i+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter key:");
        int key=sc.nextInt();

        System.out.println(FirstOccu(arr, 0, key));
    }
}

package Recurrsion;
import java.util.*;
public class LastOccurence {
    public static int LastOccu(int arr[],int i,int key){
        if(i==arr.length){ //base case
            return -1;
        }
        int isFound= LastOccu(arr,i+1,key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
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

        System.out.println(LastOccu(arr, 0, key));
    }
}


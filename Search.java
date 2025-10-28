package DivideConquer;
import java.util.*;
public class Search {

    public static int SearchIndex(int arr[],int n,int target,int si,int ei){
        
        //base case
        if(si>ei){
            return -1;
        }


        int mid=si +(ei-si)/2;

        //case FOUND
        if(arr[mid]== target){
            return mid;
        }
        
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case 1 : left
            if(arr[si]<=target && target<=arr[mid]){
                return SearchIndex(arr,n,target,si,mid);
            }else{
                //case 2: right
                return SearchIndex(arr, n, target, mid+1, ei);
            }

        }

        //mid on L2
        else{
            //case 3:right
            if(arr[mid]<=target  && target<=arr[ei]){
                return SearchIndex(arr, n, target, mid+1, ei);
            }
            else{
                //case 4 : left
                return SearchIndex(arr, n, target, si, mid-1);
            }

        }


     
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target value:");
        int target=sc.nextInt();

        System.out.println(SearchIndex(arr,n,target,0,n-1));

    }
    
}

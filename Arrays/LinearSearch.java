package Arrays;
import java.util.*;
public class LinearSearch {
    

    public static int LSearch(int numbers[],int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
         System.out.println("Enter array size:" );//input array size
        int n=sc.nextInt();
       
        int numbers[]=new int[n];//create array

        System.out.println("Enter array elements:");//input elements
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

       
        System.out.println("Enter the number to found:" );//input a key
        int key=sc.nextInt();

        
       int index= LSearch(numbers, key);//call a function


       if(index==-1){                                //print result
        System.out.println("Element not found");
       }
       else{
        System.out.println("Element found at index:" +index);
       }





    }
}

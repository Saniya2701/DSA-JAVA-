package Arrays;
import java.util.*;
public class Largest {
    

    public static int LargestOf_Array(int numbers[]){

        int largest=Integer.MIN_VALUE; // -INFINITY

        for(int i=0;i<numbers.length;i++){

            if(largest< numbers[i]){
              largest = numbers[i];  
            }
            
        }
        return largest;
    }

    public static void main(String args[]){

        int numbers[]={3,6,4,8,9};
        System.out.println("Largest number is:"+LargestOf_Array(numbers));
    }
}

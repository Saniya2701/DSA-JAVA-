//most imp Q , TC = O(n)
// this code is for nextGreater Right 
// nextGreater left will also asked and nextSmaller also
package Stack;
import java.util.*;
public class NextGreater {
    
    public static void main(String args[]){
        int arr[] ={ 6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){ // for left nextGreater & left nextSmall loop should be forward
            //step 1
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){ // if NextSmaller right/left asked just change to arr[s.peek()]>=arr[i]
             s.pop();
            }
            //step 2
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            //step 3
            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+ " ");
        }
        System.out.println();
    }
}

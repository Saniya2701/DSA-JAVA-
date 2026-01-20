package Queue;
import java.util.*;
public class Queue_JCF {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>(); // Queue is ann interface so we can't make an obj of it therefor we take LL as an obj
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

//TC = O(1)

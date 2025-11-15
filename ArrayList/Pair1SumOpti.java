package ArrayList;
import java.util.*;
public class Pair1SumOpti {
    public static boolean pair1Sum(ArrayList<Integer>list,int target){
        //2 pointer approach

        int lp =0;
        int rp =list.size()-1;
        while(lp!=rp){
            //case 1
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)< target ){
                lp++;
            }else{
                //case 3
                rp--;
            }

        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //list is sorted
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 6;
        System.out.println(pair1Sum(list, target));


    }
    
}

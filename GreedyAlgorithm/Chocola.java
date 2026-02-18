package GreedyAlgorithm;
import java.util.*;
public class Chocola {
    public static void main(String args[]){
        int n=4;
        int m=6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer , Collections.reverseOrder());//descending order sorting
        Arrays.sort(costHor,Collections.reverseOrder());//descending order sorting

        int h =0,v=0;//horizontl & vertical pointers
        int hp =1,vp =1; //hp = horizontal pieces , vp = vertical pieces
        int cost =0;

        while(h<costHor.length && v< costVer.length){
            if(costVer[v] <= costHor[h]){//horizontal cut
             cost += (costHor[h]* vp);
             hp++;
             h++;
            }else{//vertical cuts
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }
        }

        while(h < costHor.length){
            cost += (costHor[h]*vp);
            hp++;
            h++;
        }

        while(v<costVer.length){
            cost += (costVer[v]* hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts :" + cost);


    }
}

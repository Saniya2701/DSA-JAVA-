package Arrays;
import java.util.*;
public class TrappingWater {
    

    public static int Trapping_Water(int height[],int n){
        //calculate left max bar - helper array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //calculate right max bar - helper array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
           
        int trappedWater=0;

        //loop
        for(int i=0;i<n;i++){
            //calculate waterlevel
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);

            //calculate trappedwater
            trappedWater += WaterLevel-height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of bars/building:");
        int n=sc.nextInt();

        int height[]=new int[n];

        System.out.println("Enter heights of bars:");
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }

       
        System.out.println("Trapped Water is:" + Trapping_Water(height, n));
    }


}

//TC = O(n)
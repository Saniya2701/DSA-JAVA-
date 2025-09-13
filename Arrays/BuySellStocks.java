package Arrays;
import java.util.*;
public class BuySellStocks {
    

    public static int Buy_Sell_Stcks(int price[],int n){
       
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=  0;

        for(int i=0;i<n;i++){
          
            if(buyPrice <price[i]){//profit
              int profit =price[i] - buyPrice;  //todays profit
              maxProfit = Math.max(maxProfit,profit);//global profit
            }
            else{
                buyPrice = price[i];

            }

        }
        return maxProfit;

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Price Array:");
        int n = sc.nextInt();
        
        int price[]=new int[n];

        System.out.println("Enter the prices in array:");
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }


        System.out.println("Maximum Profit is:" + Buy_Sell_Stcks(price, n));
    }
}

//TC=O(n)
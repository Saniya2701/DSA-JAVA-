package Matrix;

import java.util.Scanner;

public class CountSevenMatrix {
    public static void NumberSeven(int array[][],int n,int m){

          int count=0;
           for(int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                   if(array[i][j]==7){
                           count=count+1;
                          }
                }
           }
         System.out.println("count:"+count);
    }

   public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
             System.out.println("Enter row size:");
                int n=sc.nextInt();

            System.out.println("Enter the column size:");
                int m=sc.nextInt();

          int array[][]=new int[n][m];

             System.out.println("Enter array Elements:");
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        array[i][j]=sc.nextInt();
                    }
                }
             NumberSeven(array, n, m);
   }
}




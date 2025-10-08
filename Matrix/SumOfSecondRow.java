package Matrix;

import java.util.Scanner;

public class SumOfSecondRow {
    public static void Sum_Of_SecondRow(int arr[][],int n,int m){

        int sum=0;
        for(int j=0;j<m;j++){
            sum=sum+arr[1][j];
        }
        System.out.println("Sum is:" +sum);
    }


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row size: ");
    int n=sc.nextInt();

    System.out.println("Enter the column size:");
    int m=sc.nextInt();


    int arr[][]=new int[n][m];

    System.out.println("Enter the array Elements:");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    Sum_Of_SecondRow(arr,n,m);

}


}
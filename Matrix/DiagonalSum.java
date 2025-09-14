package Matrix;
import java.util.*;
public class DiagonalSum {
    
    public static int Diagonal_sum(int matrix[] [],int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
           //PD
           sum+= matrix[i][i];

           //SD
           if(i != n-1-i){
            sum+= matrix[i][n-i-1];
           }
        }
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter size of row:");
        int n=sc.nextInt();

        System.out.println("Enter size of column:");
        int m=sc.nextInt();

        int matrix[] [] = new int[n][m];

        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

         
          int result=  Diagonal_sum(matrix, n, m);
            System.out.println("Diagonal Sum:" +result);
    }



}

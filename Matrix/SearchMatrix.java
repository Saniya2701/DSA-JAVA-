package Matrix;
import java.util.*;
public class SearchMatrix {
    
    public static boolean staircaseSearch(int matrix[][],int key,int n,int m){
        int row=0,col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key is not found.");
        return false;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int n=sc.nextInt();

        System.out.println("Enter the size of column:");
        int m=sc.nextInt();

        int matrix[][] =new int [n][m];

        System.out.println("Enter the matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        System.out.println("Enter a key:");
            int key=sc.nextInt();

            staircaseSearch(matrix, key, n, m);
    }

}
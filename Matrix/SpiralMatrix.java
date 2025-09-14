package Matrix;
import java.util.*;
public class SpiralMatrix {
    
    public static void printSpiral(int matrix [] [] ,int n,int m){
        int startRow =0;
        int startCol = 0;
        int endRow = n-1;//n = matrix.length
        int endCol = m-1;//m= matrix[0].length

        while(startRow <= endRow && startCol <= endCol){// && because my code should run for n*m matrix also

            //print top boundry 
            for(int j=startCol;j<=endCol;j++){ // j is for column and i=row
               
                 System.out.print(matrix[startRow][j]+" ");

            }

            //right
             for(int i= startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");

             }

             //bottom
             for(int j=endCol-1;j>=startCol;j-- ){
                if(startRow==endRow){ //boundry check
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
             }

             //left
             for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){ //boundry check
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
             }

             startCol++;
             startRow++;
             endCol--;
             endRow--;
        }
        System.out.println();


    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int n=sc.nextInt();

        System.out.println("Enter column size:");
        int m= sc.nextInt();

        int matrix[] []= new int[n][m];

        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
       
        System.out.println("Spiral matrix :");
        printSpiral(matrix, n, m);


    }

}
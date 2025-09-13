import java.util.*;
public class FloydTriangle {
    

    public static void Floyds_trangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
          //inner loop of how many times will counter be printed
          for(int j=1;j<=i;j++){
            System.out.print( counter +" ");
            counter++;
          }
          System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        Floyds_trangle(n);
    }
}

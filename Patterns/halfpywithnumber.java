import java.util.*;

public class halfpywithnumber {
    
    public static void halfpynum(int n){
       
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){

                System.out.print(j);
            }
            System.out.println();
        }
        
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n= sc.nextInt();
        halfpynum(n);
    }
}

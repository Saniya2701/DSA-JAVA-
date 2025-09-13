import java.util.*;
public class Diamond {
    
    public static void Diamond_P(int n){
       //outer loop of 1st half
       for(int i=1;i<=n;i++){

        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        //stars
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       
       //2nd half
       for(int i=n;i>=1;i--){
         //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        //stars
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
       }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        Diamond_P(n);
    }
}

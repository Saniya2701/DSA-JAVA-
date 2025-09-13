import java.util.*;
public class hollowrec {  

   //i used the function here 

    public static void hrec(int n){   // instead of n we can take int row and int colm
        
 //outer loop for lines
        for (int i=1;i<=n;i++){  //i<=row

            //innner loop for stars
            for (int j=1;j<=n;j++){ //j<=colm
                 //stars only on the border of rec
                if (i==1|| i==n||j==1||j==n){  //i==row and j==colm
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        
         hrec(n);
        
       
    }
}
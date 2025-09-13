import java.util.*;
public class halfpy{
//funtion

public static void halfp(int n){
   
   
    //outer loop
    for(int i=1;i<=n ;i++){
     //inner loop for spaces
        for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
  //2nd inner loop for stars
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }

    System.out.println();
}
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of n:");
    int n=sc.nextInt();
    halfp(n);
}


}

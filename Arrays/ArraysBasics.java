package Arrays;


import java.util.*;

public class ArraysBasics {
    public static void main(String args[]){
     
    int marks[]=new int[60]; //creating an array

    Scanner sc=new Scanner(System.in);// taking input
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();

    System.out.println("marks of phy: "+ marks[0]); //output
    System.out.println("marks of chem: "+marks[1]);

    marks[0]=100;//update

    System.out.println("marks of phy"+marks[0]);

    int percentage= (marks[0]+marks[1])/2;  // we can perform any math operation 
    System.out.println("Percentage is: "+ percentage +"%");


    System.out.println("length of array: " + marks.length);//length of the array

}
}

package Strings;
import java.util.*;
public class Palindrome {
    
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){ 
                return true;
            }
           
        }
        return false;
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();


        
       System.out.println(isPalindrome(str));
    }
}

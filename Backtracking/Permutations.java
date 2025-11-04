package Backtracking;
import java.util.*;
public class Permutations {
    
    public static void findPermutations(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }


        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // delete the curr char from str
            //e.g "abcde" = "ab" +"de"
            String newstr = str.substring(0,i) + str.substring(i+1);

            findPermutations(newstr, ans+curr);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        findPermutations(str," ");
    }
}

//TC = O(n*n!)
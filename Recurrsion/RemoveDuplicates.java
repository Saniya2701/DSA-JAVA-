package Recurrsion;
import java.util.*;
public class RemoveDuplicates {
    public static void RemoveDup(String str,int idx,StringBuilder newstr , boolean map []){
        //base case
      if(idx== str.length()){
        System.out.println(newstr);
        return;
    }    
    
    //kaam 
    char currchar = str.charAt(idx);
    if(map[currchar-'a']==true){
       //duplicate
       RemoveDup(str,idx+1,newstr,map);
    }else{
        map[currchar-'a']=true;
        RemoveDup(str,idx+1,newstr.append(currchar),map);
    }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();

        RemoveDup(str,0,new StringBuilder(""),new boolean[26]);

    }
}

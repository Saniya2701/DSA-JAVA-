package Strings;
import java.util.*;
public class SubString {
    public static String Sub_String(String str,int si,int ei){ //si=start index ei=end index
         
        String substr ="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter a start index:");
        int si=sc.nextInt();

        System.out.println("Enter a end index:");
        int ei= sc.nextInt();

        System.out.println("SubString is:" +Sub_String(str, si, ei));
        //there is already a java buildin function
        //System.out.println(substring(str,0,4)) = this one
    }
}

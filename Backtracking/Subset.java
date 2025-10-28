package Backtracking;

import java.util.Scanner;

public class Subset {

    public static void findSubset(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        findSubset(str, ans + str.charAt(i), i + 1);
        findSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        findSubset(str, "", 0);
    }
}


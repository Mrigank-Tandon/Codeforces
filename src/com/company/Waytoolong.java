package com.company;

import java.util.*;

public class Waytoolong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();

            if (s.length() > 10) {
                String ans = s.substring(1, s.length() - 2);
                char c = s.charAt(0);
                char l = s.charAt(s.length() - 1);
                System.out.print(c);
                System.out.print(ans.length() + 1);
                System.out.print(l);
            }
            else{
                System.out.print(s);
            }
            System.out.println();
        }
    }
}

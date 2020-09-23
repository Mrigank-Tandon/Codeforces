package com.company;

import java.util.*;

public class giftfixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());

            }
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                list1.add(sc.nextInt());
            }
            int k=Collections.min(list);
            System.out.println(k);
            int l=Collections.min(list1);
            System.out.println(l);
            int c=0;
            for (int i:list) {
                c=c+(i-k);
            }
            for (int i:list1) {
                c=c+(i-l);
            }
            System.out.println(c);

        }

    }
}

package com.company;

import java.util.*;

public class removesamallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
          ArrayList<Integer>list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());

            }
            for (int i = 0; i < list.size()-1; i++) {
                for (int j = i+1; j < list.size(); j++) {
                    int a=list.get(i);
                    int b=list.get(j);
                   if(Math.abs(a-b)<=1){
                       if(a<b)
                       list.remove((Integer) a);
                       else if(b<a)
                           list.remove((Integer) b);
                       else
                           list.remove((Integer) a);

                       i=0;
                       j=0;
                   }


                }

            }if(list.size()==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}

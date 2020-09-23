package com.company;

import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();


        if(n%2==0 && n>2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}

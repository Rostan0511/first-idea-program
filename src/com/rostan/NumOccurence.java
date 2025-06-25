package com.rostan;

import java.util.Scanner;

public class NumOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter The specific number to find: ");
        int numbertofind = sc.nextInt();
        int count = 0 ;

        while (n>0){
            int rem = n%10;
            if(rem == numbertofind){
                count++;
            }
            n = n/10;

        }

        System.out.println("Occurence of "+numbertofind+" is "+count);
    }
}

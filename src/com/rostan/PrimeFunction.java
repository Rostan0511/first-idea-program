package com.rostan;

import java.util.Scanner;

public class PrimeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }

    static boolean isprime(int n) {
        int c = 2;
        if(n<=1){
            return false;
        }
        while (c*c <= n){
            if(n%c==0){
               return false;
            }
            c++;
        }
        return c*c > n;


    }

}

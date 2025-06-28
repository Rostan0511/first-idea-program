package com.rostan;

public class Function {
    public static void main(String[] args) {
        greet();
        int ans = sum(7,7);
        System.out.println(ans);
    }

    static void greet() {
        System.out.println("Hello World");
    }

    static int sum(int a,int b){
        int ans = a+b;
        return ans;
    }

}

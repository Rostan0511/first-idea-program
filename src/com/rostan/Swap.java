package com.rostan;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a,b);
//        System.out.println(a+" "+b);
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void change(int[] arr) {
        arr[0]=99;
    }


    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2); //loaclly swapping but cant be applied to original one

    }




}

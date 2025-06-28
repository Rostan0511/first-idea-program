package com.rostan;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int ognum = sc.nextInt();
//        System.out.println(ArmStrongNo(ognum));
        for (int i = 100; i <1000;i++){
            if(ArmStrongNo(i)){
                System.out.println("Armstrong Num: "+i);
            }
        }

    }

    static boolean ArmStrongNo(int ognum){
        int sum = 0;
        int temp = ognum;
        while(temp > 0){
            int rem = temp%10;
            temp = temp/10;
            sum = sum + rem*rem*rem;

        }

        return sum == ognum;
    }
}

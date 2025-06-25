package com.rostan;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Degree: ");
        float tempC = input.nextFloat();
        System.out.println("In Degree: "+tempC+"C");
        float tempF = ( tempC * 9/5 ) + 32;
        System.out.println("In Fahrenheit: "+ tempF+"F");

    }
}

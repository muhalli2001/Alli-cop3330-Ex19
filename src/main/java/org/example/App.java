package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //bmi = (weight / (height × height)) * 703
        float bmi;
        Scanner w = new Scanner(System.in);
        System.out.println("Weight in lbs: ");
        float weight = w.nextFloat();

        Scanner h = new Scanner(System.in);
        System.out.println("Height in inches: ");
        float height = h.nextFloat();

        bmi = (weight / (height*height))*703;
        System.out.printf("Your bmi is: %.2f\n",bmi);
        if(bmi>25){System.out.printf("you may be overweight, consult with a doctor!");}
        else if(bmi<18.5){System.out.printf("you may be underweight, consult with a doctor!");}
        else System.out.printf("you are likely healthy");

    }
}

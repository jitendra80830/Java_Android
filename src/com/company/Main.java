package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        int counter=0;

        //System.out.println(randomNumber);

        System.out.println("guess the number");
        while (true) {
            counter++;
            int number = input.nextInt();


            if (number > randomNumber) {
                System.out.println("guess lower number");
            } else if (number < randomNumber) {
                System.out.println("guess higher number");
            } else {
                System.out.println("you guessed number in "+counter+" Times");
                System.exit(0);
            }
        }
    }
}

package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the total amount of marks:");
        int max = input.nextInt();
        System.out.println("how much did the student get: ");
        int mark = input.nextInt();
        float result = (float) mark / max * 5;
        System.out.println(result);
        if (result < 0) {
            System.out.println("marking is incorrect");
        } else if (result < 2) {
            System.out.println("U");
        } else if (result < 2.5) {
            System.out.println("E");
        } else if (result < 3) {
            System.out.println("D");
        } else if (result < 3.5) {
            System.out.println("C");
        } else if (result < 4) {
            System.out.println("B");
        } else if (result <= 5) {
            System.out.println("A");
        }
        else{System.out.println("mark too high");}
    }
}

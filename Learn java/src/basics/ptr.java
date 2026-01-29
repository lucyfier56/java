package basics;

import java.util.Scanner;

public class ptr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        int P = scn.nextInt();

        System.out.println("Enter rate of interest (in %): ");
        float R = scn.nextFloat();

        int t = 0;           // years
        float SI = 0;

        while (SI < P) {
            t++;
            SI = (P * R * t) / 100;  // simple interest formula
        }

        System.out.println("Time required for interest to equal principal: " + t + " years");
    }
}


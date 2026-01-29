package basics;

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1 = scn.nextInt();

        System.out.print("Enter Number 2: ");
        int n2 = scn.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char ch = scn.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Result: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Result: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Result: " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Result: " + ((double)n1 / n2)); // cast to double for decimals
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        scn.close();
    }
}

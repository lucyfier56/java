package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String color =  scn.nextLine();
        switch (color){
            case "yellow":
                System.out.println("You got yellow");
                break;
            case "Blue":
                System.out.println("You got Blue");
                break;
            case "orange":
                System.out.println("You got orange");
                break;
            case "pink":
                System.out.println("You got pink");
                break;
            default:
                System.out.println("You got wrong");

        }
    }
}

package oops.methods;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Mobile m1 = new Mobile();
//        m1.brand = "Samsung";
//        m1.color = "Red";
//        m1.price = 100000;
//        m1.show();
//
//        Mobile m2 = new Mobile();
//        m2.brand = "Samsung";
//        m2.color = "Blue";
//        m2.price = 10000000;
//        m2.show();


        chair c1 = new chair();
        c1.material = "Carbon Fibre";
        c1.numberOfLegs = 4;
        c1.color = "Black";
        c1.hasCushion = true;
        c1.specialFeature = "Shoots confetti when you sit";
        c1.sit();

        Scanner scn = new Scanner(System.in);

        System.out.println("Do you want to move the chair up or down? ");
        String direction = scn.nextLine();

        System.out.println("By what inches? ");
        int height = scn.nextInt();

        c1.move(height, direction);

    }
}

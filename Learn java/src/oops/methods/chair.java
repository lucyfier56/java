package oops.methods;


public class chair {
    String material;
    int numberOfLegs;
    String color;
    boolean hasCushion;
    String specialFeature;

    // Method to show the chair info
    public void sit() {
        System.out.println("Material: " + material);
        System.out.println("Number of Legs: " + numberOfLegs);
        System.out.println("Color: " + color);
        System.out.println("Has Cushion: " + hasCushion);
        System.out.println("Special Feature: " + specialFeature);
    }
    public void move (int height, String move){
        if(move == "Up"){
            System.out.println("Moved up by" + height+ "inches");
        }
        else if(move == "Down"){
            System.out.println("Moved down by" + height+ "inches");
        }
        else {
            System.out.println("Invalid Direction");
        }
    }
}
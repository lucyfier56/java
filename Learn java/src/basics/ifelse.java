package basics;

public class ifelse {
    public static void main(String[] args) {
        int x = 10, y=9;
        if (x>y){
            System.out.println("x is bigger");}
        else if (x<y){
            System.out.println("Y is bigger");}
        else {
            System.out.println("both are equal");}

        int z = 21;

        if (z>y&&z>x){
            System.out.println("Z is bigger");

        }
       if (z>y || x>z){
            System.out.println("Y is smaller");
        }
        else
            System.out.println("Z is smaller");

    }
}

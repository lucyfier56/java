package oops.Lambda;

public class Test {
    public static void main(String[] args) {
        Greeting g=new Greeting() {
            @Override
            public void greet() {
                System.out.println("Greetings!");
            }

            @Override
            public void hello() {
                System.out.println("Hello!");
            }
        };

        Notable n=()->{
            System.out.println("I am note");
        };

        n.note();

        write w=()->{
            System.out.println("Write");
        };
        w.write();
    }
}

package oops.interfaceclass;

public abstract class Employee extends Person implements player, artist{
    public Employee(String name, int employeeId) {
        super();
    }

    @Override
    public void doArt() {
        System.out.println("Employee does art");
    }

    @Override
    public void dosomething() {
        System.out.println("Employee works");
    }

    @Override
    public void dosomethingelse() {
        System.out.println("Employee works more");
    }

    @Override
    public void doplay() {
        System.out.println("Playing");
    }

    @Override
    public void coach() {
        System.out.println("coaching");
    }

    public abstract void work();
}

package oops.abstractclass;

public class Employee extends Person {
    @Override
    public void dosomething(){
        System.out.println("Employee works");
    }
    @Override
    public void dosomethingelse(){
        System.out.println("Employee works more");
    }
}

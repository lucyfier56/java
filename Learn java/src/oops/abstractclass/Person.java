package oops.abstractclass;

import javax.sound.midi.Soundbank;

public abstract class Person {
    String name;
    int age;

    public void show(){
        System.out.println("Show something");
    }
    public abstract void dosomething();
    public abstract void dosomethingelse();
}

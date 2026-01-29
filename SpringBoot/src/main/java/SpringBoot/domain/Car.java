package SpringBoot.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Car {
    private String brand;
    @Autowired
    Engine engine;

    public void show(){
        System.out.println("This car has "+engine.type);
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}

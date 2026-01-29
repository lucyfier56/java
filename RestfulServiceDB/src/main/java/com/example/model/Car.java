package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    private String brand;
    private int price;
    private String engine;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getengine() {
        return engine;
    }

    public void setengine(String engine) {
        this.engine = engine;
    }

    public Car(String brand, int price, String engine) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", engine='" + engine + '\'' +
                ", id=" + id +
                '}';
    }

    public Car() {
    }

}

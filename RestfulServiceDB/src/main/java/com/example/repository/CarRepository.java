package com.example.repository;

import com.example.model.Book;
import com.example.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository  extends JpaRepository<Car, Integer> {
}

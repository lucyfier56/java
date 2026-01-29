package com.example.controller;

import com.example.model.Book;

import com.example.model.Car;
import com.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {
    ArrayList<Car> carlist = new ArrayList();



    @Autowired
    CarRepository cr;

    @GetMapping("/showcar")
    public List<Car> showcar()

    {
        return cr.findAll();
    }


    @PostMapping("/addcar")
    public Car addCar(@RequestBody Car newcar){
        cr.save(newcar);
        return newcar;
    }


    @GetMapping("/findbook/{id}")
    public Optional<Car> findBook(@PathVariable int id)
    {
        return cr.findById(id);
    }

    @PutMapping("/updatebook/{id}")
    public Car updateBook(@RequestBody Car newcar, @PathVariable int id){


        Optional<Car> temp=cr.findById(id);
        temp.get().setbrand(newcar.getbrand());
        temp.get().setPrice(newcar.getPrice());
        temp.get().setengine(newcar.getengine());
        cr.save(temp.get());
        return newcar;
    }


//    @GetMapping("/booklist")
//    public ArrayList<Book> showbooklist(){
//        return booklist;
//    }
//
//    @PostMapping("/addbook")
//    public Book addbook(@RequestBody Book newcar){
//        booklist.add(newcar);
//        return newcar;
//
//    }
//
//
//    @PutMapping("/updatebook")
//    public Book updateBook(@RequestBody Book newcar, @PathVariable int id){
//        booklist.set(id,newcar);
//        return newcar;
//    }
//
//    @DeleteMapping("/deletebook/{id}")
//    public void deleteBook(@PathVariable int id){
//        booklist.remove(id);
//    }
//
//
//    @GetMapping("/findbook/{id}")
//    public Book findbook(@PathVariable int id){
//        return booklist.get(id);
//    }
}

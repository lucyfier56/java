package com.example.controller;

import com.example.model.Book;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    ArrayList<Book> booklist = new ArrayList();

    public BookController(){
        booklist.add(new Book("a",5,"I"));
        booklist.add(new Book("a",5,"I"));
    }

    @GetMapping("/booklist")
    public ArrayList<Book> showbooklist(){
        return booklist;
    }

    @PostMapping("/addbook")
    public Book addbook(@RequestBody Book NewBook){
        booklist.add(NewBook);
        return NewBook;

    }


    @PutMapping("/updatebook")
    public Book updateBook(@RequestBody Book newBook, @PathVariable int id){
        booklist.set(id,newBook);
        return newBook;
    }

    @DeleteMapping("/deletebook/{id}")
    public void deleteBook(@PathVariable int id){
        booklist.remove(id);
    }


    @GetMapping("/findbook/{id}")
    public Book findbook(@PathVariable int id){
        return booklist.get(id);
    }
}

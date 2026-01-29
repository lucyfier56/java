package com.example.controller;


import com.example.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    ArrayList<String> list = new ArrayList<>();
    ArrayList<Book> bookList = new ArrayList<>();
    public Controller(){
        list.add("Rudra");
        list.add("Panda");
        list.add("crazy");
        bookList.add(new Book("wow", 1234, "Da Vinci"));
    }
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String greeting(){
        return "Hello";
    }

    @RequestMapping("/showlist")
    public List<String> showList(){
        return list;
    }

    @RequestMapping("/showbooklist")
    public ArrayList<Book> showBookList(){
        return bookList;
    }
}

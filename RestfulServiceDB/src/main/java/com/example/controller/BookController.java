package com.example.controller;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    ArrayList<Book> booklist = new ArrayList();

    public BookController(){

        booklist.add(new Book("a",5,"I"));
        booklist.add(new Book("a",5,"I"));
    }

    //@RequestMapping("/booklist")
    @Autowired
    BookService bs;


    @GetMapping("/booklist")
    public List<Book> showbooklist(){

        return  bs.showbooklist();
    }




    @GetMapping("/findbook/{id}")
    public ResponseEntity<Book> findBook(@PathVariable int id) throws ResourceNotFoundException {
        return bs.findoneBook(id);

    }



    @PostMapping("/addbook")
    public Book addBook(@RequestBody Book newBook)
    {
        return bs.addoneBook(newBook);
    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<Book> updateBook(@RequestBody Book newBook, @PathVariable int id) throws ResourceNotFoundException {
        return bs.updateoneBook(newBook,id);
    }



    @DeleteMapping("deletebook/{id}")
    public void deleteBook(@PathVariable int id){
        bs.deleteoneBook(id);

    }
    @GetMapping("/by-author")
    public List<Book>  getByAuthorAndPrice(@PathVariable String author, @PathVariable int price) {
        return bs. findByAuthorAndPrice(author, price);
    }


}

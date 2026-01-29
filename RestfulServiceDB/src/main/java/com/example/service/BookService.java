package com.example.service;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Book;
import com.example.repository.BookRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository br;


    public List<Book> getAllBooks(){
        return  br.findAll();
    }
    public Book addoneBook(@RequestBody Book newBook)
    {
        br.save(newBook);
        return newBook;
    }
    public ResponseEntity<Book> updateoneBook(@RequestBody Book newBook,@PathVariable int id) throws ResourceNotFoundException {
        Book temp=br.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book not found"));
        temp.setAuthor(newBook.getAuthor());
        temp.setPrice(newBook.getPrice());
        temp.setTitle(newBook.getTitle());
        br.save(temp);
        return ResponseEntity.ok(temp);
    }


    public List<Book> showbooklist(){

        return  br.findAll();
    }

    public ResponseEntity<Book> findoneBook(@PathVariable int id) throws ResourceNotFoundException
    {
        Book book1 =br.findById(id).orElseThrow(()->new ResourceNotFoundException("Book not found"));
        return ResponseEntity.ok(book1);

    }

    public void deleteoneBook(@PathVariable int id){
        br.deleteById(id);

    }


    public List<Book> findByAuthorAndPrice(String author) {
        return br. findByAuthorAndPrice(author,price);
    }
    
    /*
    * public ResponseEntity<Employee> readEmployee1(@PathVariable(value="id") Integer employeeId ) throws ResourceNotFoundException{
		  Employee employee=employeeRepository.findById(employeeId)
				  .orElseThrow(()-> new ResourceNotFoundException("Employee not found for the id "+employeeId));
		  return ResponseEntity.ok(employee);
	  
	  }
    * */


}

























package com.example.repository;

import com.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value="Select b from Book b where b.author=?1")
    List<Book> findBYAuthor(String author);

    @Query(value = "Select b from Book b where  b.author=?1 AND b.price>?2")
    public List<Book> findByAuthorAndPrice(String author, int price);


}

package com.bookapp.repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public interface IBookRepository {

    //admin
    void addBook(Book book); //create
    void updateBook(int bookId,  double price);  //update
    void deleteBook(int bookId);  //delete
    Book findById(int bookId) throws IdNotFoundException; //retrieve

    //user
    List<Book> findAll(); //retrieve
    List<Book> findByAuthor(String author) throws BookNotFoundException;
    List<Book> findByCategory(String category) throws BookNotFoundException;
    List<Book> findByLesserPrice(double price) throws BookNotFoundException;
    List<Book> findByAuthorCategory(String author,String category) throws BookNotFoundException;
}

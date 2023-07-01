package com.example.demo.book.service;

import org.springframework.stereotype.Service;

import com.example.demo.book.domain.Book;
import com.example.demo.book.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookById(int id) {
        return bookRepository.getBookById(id);
    }
}

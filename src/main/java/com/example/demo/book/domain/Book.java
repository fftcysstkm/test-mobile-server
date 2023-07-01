package com.example.demo.book.domain;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private final int id;
    private final String name;
    private final String author;

    // コンストラクタ
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

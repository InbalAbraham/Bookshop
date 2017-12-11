package com.inbal.spring.rest.bookshop;

public class Book {

    private long id;
    private String name;

    public Book(long id, String content) {
        this.id = id;
        this.name = content;
    }

    public Book() {

    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

package com.bookservice.model;

/**
 * @author Joel Rodrigues Moreira on 27/12/17.
 * @project Book-service
 */
public class Book {
    private Long id;
    private String author;
    private String title;

    public Book() {
    }

    public Book(final Long id, final String author, final String title) {
        this();
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public Book setId(final Long id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(final String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(final String title) {
        this.title = title;
        return this;
    }
}
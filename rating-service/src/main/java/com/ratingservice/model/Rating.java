package com.ratingservice.model;

/**
 * @author Joel Rodrigues Moreira on 27/12/17.
 * @project rating-service
 */
public class Rating {
    private Long id;
    private Long bookId;
    private int stars;

    public Rating() {
    }

    public Rating(final Long id, final Long bookId, final int stars) {
        this();
        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
    }

    public Long getId() {
        return id;
    }

    public Rating setId(final Long id) {
        this.id = id;
        return this;
    }

    public Long getBookId() {
        return bookId;
    }

    public Rating setBookId(final Long bookId) {
        this.bookId = bookId;
        return this;
    }

    public int getStars() {
        return stars;
    }

    public Rating setStars(final int stars) {
        this.stars = stars;
        return this;
    }
}

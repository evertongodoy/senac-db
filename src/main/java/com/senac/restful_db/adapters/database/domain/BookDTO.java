package com.senac.restful_db.adapters.database.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BookDTO {

    private String title;
    private LocalDate publishedAt;
    private String isbn;
    private BigDecimal price;

    public String getTitle() {
        return title;
    }

    public BookDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public BookDTO setPublishedAt(LocalDate publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookDTO setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BookDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

}
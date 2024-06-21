package com.senac.restful_db.usecase.ucbooks.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.senac.restful_db.entities.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String id;
    private String title;
    @JsonProperty("published_at")
    private LocalDate publishedAt;
    private String isbn;
    private BigDecimal price;

    private BookEntity toBookEntity(Book book){
        return BookEntity.builder()
                .id(book.getId())
                .title(book.getTitle())
                .publishedAt(book.getPublishedAt())
                .isbn(book.getIsbn())
                .price(book.getPrice())
                .build();
    }

}
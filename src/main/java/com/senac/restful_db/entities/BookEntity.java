package com.senac.restful_db.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    private String id;
    private String title;
    private LocalDate publishedAt;
    private String isbn;
    private BigDecimal price;

    public BookEntity toBookEntity(String id, String title, LocalDate publishedAt, String isbn, BigDecimal price){
        return BookEntity.builder()
                .id(id)
                .title(title)
                .publishedAt(publishedAt)
                .isbn(isbn)
                .price(price)
                .build();
    }


}
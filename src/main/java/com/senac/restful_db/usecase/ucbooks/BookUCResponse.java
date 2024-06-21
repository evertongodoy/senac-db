package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.entities.BookEntity;
import com.senac.restful_db.usecase.ucbooks.models.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookUCResponse {

    private List<Book> books = new ArrayList<>();

    public List<Book> fromBookEntities(List<BookEntity> books){
        return books.stream()
                .map(entity -> Book.builder()
                        .id(entity.getId())
                        .title(entity.getTitle())
                        .publishedAt(entity.getPublishedAt())
                        .isbn(entity.getIsbn())
                        .price(entity.getPrice())
                        .build())
                .toList();
    }

}
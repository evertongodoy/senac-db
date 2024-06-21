package com.senac.restful_db.usecase.ucbooks.port;

import com.senac.restful_db.adapters.database.domain.BookDTO;

import com.senac.restful_db.entities.BookEntity;
import com.senac.restful_db.usecase.ucbooks.models.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CrudResponse {

    private List<BookDTO> books = new ArrayList<>();
//    private Book toBook(BookDTO dto){
//        return Book.builder()
//                .id(dto.getId())
//                .title(dto.getTitle())
//                .publishedAt(dto.getPublishedAt())
//                .isbn(dto.getIsbn())
//                .price(dto.getPrice())
//                .build();
//    }

    public BookDTO toBookDto(String id, String title, LocalDate publishedAt, String isbn, BigDecimal price){
        return new BookDTO()
                .setId(id)
                .setTitle(title)
                .setPublishedAt(publishedAt)
                .setIsbn(isbn)
                .setPrice(price);
    }

}
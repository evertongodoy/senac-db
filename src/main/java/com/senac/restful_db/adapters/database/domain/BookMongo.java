package com.senac.restful_db.adapters.database.domain;


import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document("book")
public class BookMongo {

    @Id
    private String id;
    private String title;
    @Field("published_at")
    private LocalDate publishedAt;
    private String isbn;
    private BigDecimal price;

    public BookDTO toBookDTO(BookMongo bookMongo){
        return new BookDTO()
                .setId(bookMongo.getId())
                .setTitle(bookMongo.getTitle())
                .setPublishedAt(bookMongo.getPublishedAt())
                .setIsbn(bookMongo.getIsbn())
                .setPrice(bookMongo.getPrice());
    }

    public BookMongo toEntity(CrudRequest crudRequest){
        return BookMongo.builder()
                .id(Objects.isNull(crudRequest.getId()) ? null : crudRequest.getId())
                .title(crudRequest.getTitle())
                .publishedAt(crudRequest.getPublishedAt())
                .isbn(crudRequest.getIsbn())
                .price(crudRequest.getPrice())
                .build();
    }

}
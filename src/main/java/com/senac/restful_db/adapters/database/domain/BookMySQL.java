package com.senac.restful_db.adapters.database.domain;

import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = BookMySQL.TABLE_NAME)
public class BookMySQL {

    public static final String TABLE_NAME= "book";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "published_at", nullable = false)
    private LocalDate publishedAt;
    @Column(name = "isbn", nullable = false)
    private String isbn;
    @Column(name = "price", nullable = false)
    private BigDecimal price;

    public BookDTO toBookDTO(BookMySQL bookMySQL){
        return new BookDTO()
                .setId(String.valueOf(bookMySQL.getId()))
                .setTitle(bookMySQL.getTitle())
                .setPublishedAt(bookMySQL.getPublishedAt())
                .setIsbn(bookMySQL.getIsbn())
                .setPrice(bookMySQL.getPrice());
    }

    public BookMySQL toEntity(CrudRequest crudRequest){
        return BookMySQL.builder()
                .id(Objects.isNull(crudRequest.getId()) ? null : Long.parseLong(crudRequest.getId()))
                .title(crudRequest.getTitle())
                .publishedAt(crudRequest.getPublishedAt())
                .isbn(crudRequest.getIsbn())
                .price(crudRequest.getPrice())
                .build();
    }
}

package com.senac.restful_db.adapters.database.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = BookMySQL.TABLE_NAME)
public class BookMySQL {

    public static final String TABLE_NAME= "book";

    @Id
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
        return new BookDTOMySQL()
                .setId(bookMySQL.getId())
                .setTitle(bookMySQL.getTitle())
                .setPublishedAt(bookMySQL.getPublishedAt())
                .setIsbn(bookMySQL.getIsbn())
                .setPrice(bookMySQL.getPrice());
    }

}

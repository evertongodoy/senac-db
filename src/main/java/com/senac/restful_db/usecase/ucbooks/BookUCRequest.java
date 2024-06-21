package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BookUCRequest {

    @Getter
    private String id;
    @Getter
    private String title;
    @Getter
    private LocalDate publishedAt;
    @Getter
    private String isbn;
    @Getter
    private BigDecimal price;

    @Getter
    private String database;
    @Getter
    private DatabaseType databaseType;

    public BookUCRequest(String database){
        this.database = database;
        this.databaseType = DatabaseType.fromString(database);
    }

    public BookUCRequest(String id, String database){
        this.id = id;
        this.database = database;
        this.databaseType = DatabaseType.fromString(database);
    }

    public BookUCRequest(String title, LocalDate publishedAt, String isbn, BigDecimal price, String database){
        this.title = title;
        this.publishedAt = publishedAt;
        this.isbn = isbn;
        this.price = price;
        this.database = database;
        this.databaseType = DatabaseType.fromString(database);
    }

    public BookUCRequest(String id, String title, LocalDate publishedAt, String isbn, BigDecimal price, String database){
        this.id = id;
        this.title = title;
        this.publishedAt = publishedAt;
        this.isbn = isbn;
        this.price = price;
        this.database = database;
        this.databaseType = DatabaseType.fromString(database);
    }

}
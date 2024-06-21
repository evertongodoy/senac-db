package com.senac.restful_db.adapters.database.domain;

public class BookDTOMySQL extends BookDTO {

    private Long id;

    public Long getId() {
        return id;
    }

    public BookDTO setId(Long id) {
        this.id = id;
        return this;
    }

}

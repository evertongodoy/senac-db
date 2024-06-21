package com.senac.restful_db.adapters.database.domain;

public class BookDTOMongoDB extends BookDTO {

    private String id;

    public String getId() {
        return id;
    }

    public BookDTO setId(String id) {
        this.id = id;
        return this;
    }

}
